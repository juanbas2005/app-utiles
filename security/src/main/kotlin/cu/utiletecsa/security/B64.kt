package cu.utiletecsa.security

/**
 * Base64 (RFC 4648, variante estándar con padding) implementado en Kotlin puro.
 *
 * ¿Por qué no android.util.Base64? Porque este módulo se testea en JVM
 * (unit tests sin dispositivo) y android.util.Base64 es un stub que lanza
 * "not mocked". ¿Por qué no java.util.Base64? Porque requiere API 26+ y el
 * proyecto mantiene minSdk 24.
 */
internal object B64 {

    private const val ALPHABET = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/"

    fun encode(data: ByteArray): String {
        val out = StringBuilder(((data.size + 2) / 3) * 4)
        var i = 0
        while (i < data.size) {
            val b0 = data[i].toInt() and 0xFF
            val hasB1 = i + 1 < data.size
            val hasB2 = i + 2 < data.size
            val b1 = if (hasB1) data[i + 1].toInt() and 0xFF else 0
            val b2 = if (hasB2) data[i + 2].toInt() and 0xFF else 0

            out.append(ALPHABET[b0 shr 2])
            out.append(ALPHABET[((b0 and 0x03) shl 4) or (b1 shr 4)])
            out.append(if (hasB1) ALPHABET[((b1 and 0x0F) shl 2) or (b2 shr 6)] else '=')
            out.append(if (hasB2) ALPHABET[b2 and 0x3F] else '=')
            i += 3
        }
        return out.toString()
    }

    fun decode(text: String): ByteArray {
        val clean = text.trim().filterNot { it == '\n' || it == '\r' }
        require(clean.length % 4 == 0) { "Base64 inválido: longitud ${clean.length}" }
        val rev = IntArray(128) { -1 }
        ALPHABET.forEachIndexed { idx, c -> rev[c.code] = idx }

        val padCount = when {
            clean.endsWith("==") -> 2
            clean.endsWith("=") -> 1
            else -> 0
        }
        val out = ByteArray(clean.length / 4 * 3 - padCount)
        var outIndex = 0
        var i = 0
        while (i < clean.length) {
            val c0 = value(rev, clean[i])
            val c1 = value(rev, clean[i + 1])
            val hasC2 = i + 2 < clean.length - padCount + 2 && clean[i + 2] != '='
            val hasC3 = clean[i + 3] != '='
            val c2 = if (clean[i + 2] == '=') 0 else value(rev, clean[i + 2])
            val c3 = if (clean[i + 3] == '=') 0 else value(rev, clean[i + 3])

            val triple = (c0 shl 18) or (c1 shl 12) or (c2 shl 6) or c3
            if (outIndex < out.size) out[outIndex++] = ((triple shr 16) and 0xFF).toByte()
            if (outIndex < out.size) out[outIndex++] = ((triple shr 8) and 0xFF).toByte()
            if (outIndex < out.size) out[outIndex++] = (triple and 0xFF).toByte()
            // hasC2/hasC3 quedan implícitos por el tamaño de `out` calculado con padCount
            i += 4
        }
        return out
    }

    private fun value(rev: IntArray, c: Char): Int {
        require(c.code < 128 && rev[c.code] >= 0) { "Carácter Base64 inválido: '$c'" }
        return rev[c.code]
    }
}
