package cu.lestebang.utiletecsa.security

import android.content.Context
import android.util.Base64
import java.security.KeyStore
import javax.crypto.Cipher
import javax.crypto.KeyGenerator
import javax.crypto.SecretKey
import javax.crypto.spec.GCMParameterSpec

/**
 * Almacenamiento de secretos cifrado en el dispositivo
 * (mitigación SECURITY.md §F-06).
 *
 * La app original guardaba `transferPin`, `nautaCookies`, `licenseTransferId`,
 * etc. en DataStore **sin cifrar**. Este wrapper cifra con AES-256-GCM usando
 * una clave **no exportable** en Android KeyStore (hardware/TEE cuando el
 * dispositivo lo soporta).
 *
 * Uso:
 * ```
 * val storage = SecureStorage(context, "utiles_secrets")
 * storage.put("transferPin", pin)
 * val pin: String? = storage.getString("transferPin")
 * ```
 *
 * Alternativa: Tink `EncryptedSharedPreferences`
 * (`com.google.crypto.tink: tink-android` + `androidx.security:security-crypto`)
 * si el proyecto migra a Tink; la interfaz [SecureStorage] permite cambiar la
 * implementación sin tocar la UI.
 */
class SecureStorage(context: Context, private val alias: String = "utiles_secrets") {

    private val keyStore: KeyStore = KeyStore.getInstance(ANDROID_KEYSTORE).apply { load(null) }
    private val cipher: Cipher by lazy {
        Cipher.getInstance(TRANSFORMATION).apply { init(Cipher.ENCRYPT_MODE, getOrCreateKey()) }
    }

    /**
     * Escribe un valor cifrado. El texto plano NUNCA toca disco.
     * @return false si falla el cifrado (el valor anterior, si existía, se borra)
     */
    fun put(key: String, value: String): Boolean = try {
        cipher.init(Cipher.ENCRYPT_MODE, getOrCreateKey())
        val iv = cipher.iv
        val encrypted = cipher.doFinal(value.toByteArray(Charsets.UTF_8))
        context.getSharedPreferences(FILENAME, Context.MODE_PRIVATE)
            .edit()
            .putString(key, Base64.encodeToString(iv + encrypted, Base64.NO_WRAP))
            .commit()
        true
    } catch (e: Exception) {
        context.getSharedPreferences(FILENAME, Context.MODE_PRIVATE)
            .edit().remove(key).commit()
        false
    }

    /** Lee y descifra un valor; null si no existe o el cifrado no coincide. */
    fun getString(key: String): String? {
        val blob = context.getSharedPreferences(FILENAME, Context.MODE_PRIVATE).getString(key, null)
            ?: return null
        return try {
            val data = Base64.decode(blob, Base64.NO_WRAP)
            val iv = data.copyOfRange(0, GCM_IV_BYTES)
            val ciphertext = data.copyOfRange(GCM_IV_BYTES, data.size)
            val decipher = Cipher.getInstance(TRANSFORMATION)
            decipher.init(
                Cipher.DECRYPT_MODE,
                getOrCreateKey(),
                GCMParameterSpec(GCM_TAG_BITS, iv),
            )
            String(decipher.doFinal(ciphertext), Charsets.UTF_8)
        } catch (e: Exception) {
            null
        }
    }

    /** Borra un secreto (p. ej. al cerrar sesión o desactivar app-lock). */
    fun remove(key: String) {
        context.getSharedPreferences(FILENAME, Context.MODE_PRIVATE)
            .edit().remove(key).commit()
    }

    private fun getOrCreateKey(): SecretKey {
        (keyStore.getEntry(alias, null) as? KeyStore.SecretKeyEntry)?.let { return it.secretKey }
        val generator = KeyGenerator.getInstance("AES", ANDROID_KEYSTORE)
        generator.init(256, android.security.KeyGenParameterSpec.Builder(
            alias,
            android.security.KeyProperties.PURPOSE_ENCRYPT or
                android.security.KeyProperties.PURPOSE_DECRYPT,
        )
            .setBlockModes(android.security.KeyProperties.BLOCK_MODE_GCM)
            .setEncryptionPaddings(android.security.KeyProperties.ENCRYPTION_PADDING_NONE)
            .setKeySize(256)
            .build())
        return generator.generateKey()
    }

    private companion object {
        const val ANDROID_KEYSTORE = "AndroidKeyStore"
        const val TRANSFORMATION = "AES/GCM/NoPadding"
        const val GCM_IV_BYTES = 12
        const val GCM_TAG_BITS = 128
        const val FILENAME = "secure_storage"
    }
}
