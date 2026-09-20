package cu.utiletecsa.security

import java.security.SecureRandom
import javax.crypto.Cipher
import javax.crypto.spec.GCMParameterSpec

/**
 * Motor de cifrado AES-256/GCM para datos sensibles en reposo (contraseñas Nauta,
 * tokens FCM, preferencias privadas).
 *
 * Formato del texto cifrado: `v1.<ivBase64>.<ciphertextBase64>` — IV aleatorio de
 * 12 bytes por operación, tag GCM de 128 bits. Mitiga el almacenamiento sin cifrar
 * detectado en la auditoría (hallazgo H-2 de SECURITY.md).
 */
class CryptoEngine(private val keyProvider: KeyProvider) {

    private val random = SecureRandom()

    fun encrypt(plaintext: ByteArray, alias: String = DEFAULT_ALIAS): String {
        val cipher = Cipher.getInstance(TRANSFORMATION)
        val iv = ByteArray(IV_SIZE).also { random.nextBytes(it) }
        cipher.init(Cipher.ENCRYPT_MODE, keyProvider.getOrCreateKey(alias), GCMParameterSpec(TAG_BITS, iv))
        val ciphertext = cipher.doFinal(plaintext)
        return "v1.${b64(iv)}.${b64(ciphertext)}"
    }

    fun decrypt(token: String, alias: String = DEFAULT_ALIAS): ByteArray {
        val parts = token.split('.')
        require(parts.size == 3 && parts[0] == "v1") { "Formato de token inválido" }
        val iv = unb64(parts[1])
        require(iv.size == IV_SIZE) { "IV inválido" }
        val cipher = Cipher.getInstance(TRANSFORMATION)
        cipher.init(Cipher.DECRYPT_MODE, keyProvider.getOrCreateKey(alias), GCMParameterSpec(TAG_BITS, iv))
        return cipher.doFinal(unb64(parts[2]))
    }

    fun encryptString(plaintext: String, alias: String = DEFAULT_ALIAS): String =
        encrypt(plaintext.toByteArray(Charsets.UTF_8), alias)

    fun decryptString(token: String, alias: String = DEFAULT_ALIAS): String =
        String(decrypt(token, alias), Charsets.UTF_8)

    private fun b64(data: ByteArray): String = B64.encode(data)

    private fun unb64(data: String): ByteArray = B64.decode(data)

    companion object {
        const val DEFAULT_ALIAS = "utiletecsa_data_key"
        private const val TRANSFORMATION = "AES/GCM/NoPadding"
        private const val IV_SIZE = 12
        private const val TAG_BITS = 128
    }
}
