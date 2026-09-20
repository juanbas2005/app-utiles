package cu.lestebang.utiletecsa.security

import android.content.Context
import android.content.pm.PackageInfo
import android.content.pm.PackageManager
import android.content.pm.Signature
import android.os.Build
import java.io.File
import java.security.MessageDigest

/**
 * Verificación de integridad de la auto-actualización (SECURITY.md §F-08).
 *
 * Provee las piezas que el flujo `sync/DownloadApkReceiver` de la app original
 * NO tenía:
 *
 *  1. [sha256OfFile] — hash del APK descargado (se compara contra el
 *     publicado con [UpdatePolicy.sha256Matches]).
 *  2. [installedCertificateSha256] — huella del certificado de la versión
 *     instalada.
 *  3. [verifyDownloadedApk] — orquesta la comprobación completa antes de
 *     ofrecer la instalación.
 *
 * Nota: la comparación de certificados del APK *descargado* (parseo de su
 * bloque v2/v3) requiere `apksig` en el dispositivo; cuando la app se
 * re-firma con apksigner estándar (SECURITY.md §F-01) se puede hacer con
 * `PackageParser`/`ApkParsingCallback` o con la librería apksig embebida.
 * Mientras tanto, [verifyDownloadedApk] exige como mínimo el SHA-256.
 */
object SignatureVerifier {

    /**
     * SHA-256 (hex minúsculas, 64 chars) de un archivo. Devuelve null si el
     * archivo no existe o no es legible.
     */
    fun sha256OfFile(file: File): String? {
        if (!file.isFile) return null
        val digest = MessageDigest.getInstance("SHA-256")
        file.inputStream().use { input ->
            val buffer = ByteArray(8192)
            while (true) {
                val read = input.read(buffer)
                if (read <= 0) break
                digest.update(buffer, 0, read)
            }
        }
        return digest.digest().joinToString("") { "%02x".format(it) }
    }

    /**
     * Huella SHA-256 del certificado de la app instalada (el "yo mismo").
     * Devuelve null si no se puede obtener (debería ser siempre posible para
     * el propio paquete).
     */
    fun installedCertificateSha256(context: Context, packageName: String): String? {
        val signatures: Array<Signature> =
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.P) {
                val pi: PackageInfo = context.packageManager.getPackageInfo(
                    packageName,
                    PackageManager.PackageInfoFlags.of(PackageManager.GET_SIGNING_CERTIFICATES.toLong()),
                )
                pi.signingInfo?.apkContentsSigners ?: return null
            } else {
                @Suppress("DEPRECATION")
                context.packageManager.getPackageInfo(packageName, PackageManager.GET_SIGNATURES)
                    .signatures ?: return null
            }
        if (signatures.isEmpty()) return null
        val digest = MessageDigest.getInstance("SHA-256")
        return digest.digest(signatures[0].toByteArray()).joinToString("") { "%02x".format(it) }
    }

    /**
     * Comprobación completa de un APK descargado antes de ofrecer su
     * instalación.
     *
     * @param context contexto de la app
     * @param downloadedApk archivo APK descargado
     * @param remoteVersionCode versionCode anunciado en el sitio
     * @param expectedSha256 SHA-256 publicado/embebido (recomendado)
     * @return [UpdatePolicy.CheckResult]
     */
    fun verifyDownloadedApk(
        context: Context,
        downloadedApk: File,
        remoteVersionCode: Int,
        expectedSha256: String?,
        policy: UpdatePolicy = UpdatePolicy(),
    ): UpdatePolicy.CheckResult {
        val localVersionCode = try {
            context.packageManager.getPackageInfo(context.packageName, 0).versionCode
        } catch (e: PackageManager.NameNotFoundException) {
            return UpdatePolicy.CheckResult.rejected("no se pudo leer la versión instalada")
        }
        val downloadedSha = sha256OfFile(downloadedApk)
            ?: return UpdatePolicy.CheckResult.rejected("no se pudo leer el APK descargado")
        val installedCert = installedCertificateSha256(context, context.packageName)
        return policy.checkUpdate(
            localVersionCode = localVersionCode,
            remoteVersionCode = remoteVersionCode,
            downloadedSha256 = downloadedSha,
            expectedSha256 = expectedSha256,
            downloadedCertSha256 = null, // se completa al habilitar apksig estándar (§F-01)
            installedCertSha256 = installedCert,
        )
    }
}
