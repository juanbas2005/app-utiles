package cu.utiletecsa.security

import android.security.keystore.KeyGenParameterSpec
import android.security.keystore.KeyProperties
import java.security.KeyStore
import javax.crypto.KeyGenerator
import javax.crypto.SecretKey

/**
 * [KeyProvider] respaldado por AndroidKeyStore: AES-256/GCM, la clave se genera
 * dentro del keystore del dispositivo y no es extraíble.
 *
 * Equivalente endurecido de la clave `nauta_account_key` del APK original
 * (que ya usaba AndroidKeyStore — se conserva el patrón y se generaliza).
 */
class AndroidKeystoreKeyProvider(
    private val keystoreName: String = "AndroidKeyStore",
) : KeyProvider {

    override fun getOrCreateKey(alias: String): SecretKey {
        val keyStore = KeyStore.getInstance(keystoreName).apply { load(null) }
        (keyStore.getEntry(alias, null) as? KeyStore.SecretKeyEntry)?.let { return it.secretKey }

        val generator = KeyGenerator.getInstance(KeyProperties.KEY_ALGORITHM_AES, keystoreName)
        val spec = KeyGenParameterSpec.Builder(
            alias,
            KeyProperties.PURPOSE_ENCRYPT or KeyProperties.PURPOSE_DECRYPT,
        )
            .setBlockModes(KeyProperties.BLOCK_MODE_GCM)
            .setEncryptionPaddings(KeyProperties.ENCRYPTION_PADDING_NONE)
            .setKeySize(256)
            .setRandomizedEncryptionRequired(true)
            .build()
        generator.init(spec)
        return generator.generateKey()
    }
}
