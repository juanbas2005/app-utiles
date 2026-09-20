package cu.utiletecsa.security

import java.security.MessageDigest
import java.security.SecureRandom
import javax.crypto.SecretKeyFactory
import javax.crypto.spec.PBEKeySpec

/**
 * Hash de contraseñas/secretos de verificación local con PBKDF2-HMAC-SHA256.
 *
 * Formato almacenado: `pbkdf2-sha256$<iteraciones>$<saltB64>$<hashB64>`.
 * Comparación en tiempo constante para evitar timing attacks.
 */
class PasswordHasher(
    private val iterations: Int = DEFAULT_ITERATIONS,
    private val keyLengthBits: Int = 256,
) {

    private val random = SecureRandom()

    fun hash(password: CharArray, salt: ByteArray = ByteArray(SALT_SIZE).also { random.nextBytes(it) }): String {
        val spec = PBEKeySpec(password, salt, iterations, keyLengthBits)
        val hash = try {
            SecretKeyFactory.getInstance(ALGORITHM).generateSecret(spec).encoded
        } finally {
            spec.clearPassword()
        }
        return buildString {
            append(ID).append('$')
            append(iterations).append('$')
            append(encode(salt)).append('$')
            append(encode(hash))
        }
    }

    fun verify(password: CharArray, stored: String): Boolean {
        val parts = stored.split('$')
        if (parts.size != 4 || parts[0] != ID) return false
        val storedIterations = parts[1].toIntOrNull() ?: return false
        val salt = decode(parts[2])
        val expected = decode(parts[3])
        val spec = PBEKeySpec(password, salt, storedIterations, expected.size * 8)
        val actual = try {
            SecretKeyFactory.getInstance(ALGORITHM).generateSecret(spec).encoded
        } finally {
            spec.clearPassword()
        }
        return MessageDigest.isEqual(expected, actual)
    }

    private fun encode(bytes: ByteArray): String =
        android.util.Base64.encodeToString(bytes, android.util.Base64.NO_WRAP)

    private fun decode(text: String): ByteArray =
        android.util.Base64.decode(text, android.util.Base64.NO_WRAP)

    companion object {
        private const val ID = "pbkdf2-sha256"
        private const val ALGORITHM = "PBKDF2WithHmacSHA256"
        private const val SALT_SIZE = 16
        const val DEFAULT_ITERATIONS = 210_000
    }
}
