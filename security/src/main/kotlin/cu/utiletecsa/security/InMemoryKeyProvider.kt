package cu.utiletecsa.security

import javax.crypto.KeyGenerator
import javax.crypto.SecretKey

/**
 * [KeyProvider] en memoria SOLO para tests unitarios (fuera de dispositivo no
 * existe AndroidKeyStore). Genera una clave AES-256 real por alias.
 */
class InMemoryKeyProvider : KeyProvider {

    private val keys = mutableMapOf<String, SecretKey>()

    override fun getOrCreateKey(alias: String): SecretKey =
        keys.getOrPut(alias) {
            KeyGenerator.getInstance("AES").apply { init(256) }.generateKey()
        }
}
