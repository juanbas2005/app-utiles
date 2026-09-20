package cu.utiletecsa.security

import java.io.InputStream
import java.security.MessageDigest

/** Utilidades de integridad de ficheros (verificación SHA-256 de APK descargados). */
object FileIntegrity {

    private const val BUFFER = 1 shl 16

    fun sha256Hex(input: InputStream): String {
        val digest = MessageDigest.getInstance("SHA-256")
        input.use { stream ->
            val buffer = ByteArray(BUFFER)
            while (true) {
                val read = stream.read(buffer)
                if (read <= 0) break
                digest.update(buffer, 0, read)
            }
        }
        return digest.digest().joinToString("") { "%02x".format(it) }
    }
}
