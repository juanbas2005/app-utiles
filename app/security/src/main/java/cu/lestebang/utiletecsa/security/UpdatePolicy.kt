package cu.lestebang.utiletecsa.security

import java.math.BigInteger

/**
 * Política de auto-actualización segura (mitigación SECURITY.md §F-08).
 *
 * La app original descargaba `https://apputiles.com/assets/UtilEs.apk` con
 * `DownloadManager` y dejaba al usuario instalarlo **sin ninguna verificación**
 * (ni hash, ni firma). Este módulo convierte ese flujo en:
 *
 *   1. [shouldUpdate] — solo se ofrece la actualización si el versionCode remoto
 *      es mayor que el local (nunca "downgrade silencioso").
 *   2. [sha256Matches] — el APK descargado debe coincidir con el SHA-256
 *      publicado junto al APK (y, idealmente, embebido en la app).
 *   3. [SignatureVerifier.verifyCertificateChain] — el certificado del APK
 *      descargado debe ser el mismo que el de la versión instalada
 *      (imprescindible una vez la app se re-firma con apksig estándar, §F-01).
 *
 * La lógica de decisión es pura (sin dependencias Android) para poder probarla.
 */
class UpdatePolicy {

    /** Resultado de la comprobación de una actualización descargada. */
    data class CheckResult(
        val accepted: Boolean,
        val reason: String,
    ) {
        companion object {
            fun accepted(reason: String = "ok") = CheckResult(true, reason)
            fun rejected(reason: String) = CheckResult(false, reason)
        }
    }

    /**
     * Decide si se debe ofrecer la actualización.
     *
     * @param localVersionCode versionCode de la versión instalada (p. ej. 10602)
     * @param remoteVersionCode versionCode publicado en el sitio
     * @return true solo si el remoto es estrictamente mayor
     */
    fun shouldUpdate(localVersionCode: Int, remoteVersionCode: Int): Boolean =
        remoteVersionCode > localVersionCode

    /**
     * Compara versionNames "a.b.c" (el formato visible de UtilEs, p. ej. 1.6.2).
     * Devuelve < 0, 0 o > 0 como [Comparable].
     */
    fun compareVersionName(a: String, b: String): Int {
        val pa = a.split('.', '-').mapNotNull { it.toIntOrNull() }
        val pb = b.split('.', '-').mapNotNull { it.toIntOrNull() }
        val n = maxOf(pa.size, pb.size)
        for (i in 0 until n) {
            val va = pa.getOrNull(i) ?: 0
            val vb = pb.getOrNull(i) ?: 0
            if (va != vb) return va.compareTo(vb)
        }
        return 0
    }

    /**
     * Valida el APK descargado contra la política completa.
     *
     * @param localVersionCode versionCode instalado
     * @param remoteVersionCode versionCode que dice el sitio
     * @param downloadedSha256 hex (64 chars) del APK descargado
     * @param expectedSha256 hex publicado/embebido; si es null se exige la
     *        verificación de certificado en su lugar (o ambas, si hay ambas).
     * @param downloadedCertSha256 huella SHA-256 del certificado del APK
     *        descargado (apksig v2/v3); null si no pudo extraerse.
     * @param installedCertSha256 huella SHA-256 del certificado de la app
     *        instalada.
     */
    fun checkUpdate(
        localVersionCode: Int,
        remoteVersionCode: Int,
        downloadedSha256: String?,
        expectedSha256: String?,
        downloadedCertSha256: String?,
        installedCertSha256: String?,
    ): CheckResult {
        if (!shouldUpdate(localVersionCode, remoteVersionCode)) {
            return CheckResult.rejected("no hay versión mayor que instalar")
        }
        var sawCheck = false
        if (expectedSha256 != null) {
            sawCheck = true
            if (downloadedSha256 == null || !sha256Matches(expectedSha256, downloadedSha256)) {
                return CheckResult.rejected("el SHA-256 del APK descargado no coincide con el publicado")
            }
        }
        if (installedCertSha256 != null) {
            sawCheck = true
            if (downloadedCertSha256 == null ||
                !downloadedCertSha256.equals(installedCertSha256, ignoreCase = true)
            ) {
                return CheckResult.rejected(
                    "el certificado del APK descargado no coincide con el de la versión instalada"
                )
            }
        }
        if (!sawCheck) {
            return CheckResult.rejected(
                "falta verificación: se exige expectedSha256 o certificado instalado"
            )
        }
        return CheckResult.accepted("actualización verificada")
    }

    /**
     * Compara dos hashes SHA-256 en hexadecimal de forma constant-time.
     */
    fun sha256Matches(expectedHex: String, actualHex: String): Boolean {
        if (expectedHex.length != 64 || actualHex.length != 64) return false
        val e = expectedHex.lowercase().toByteArray()
        val a = actualHex.lowercase().toByteArray()
        var diff = 0
        for (i in e.indices) diff = diff or (e[i].toInt() xor a[i].toInt())
        return diff == 0
    }

    /**
     * Convierte un hex SHA-256 a [BigInteger] para comparaciones numéricas.
     * Útil para logs de diagnóstico (NUNCA comparar numéricamente en producción;
     * usar [sha256Matches]).
     */
    fun sha256ToBigInteger(hex: String): BigInteger = BigInteger(hex, 16)
}
