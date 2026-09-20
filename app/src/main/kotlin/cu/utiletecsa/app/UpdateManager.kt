package cu.utiletecsa.app

import cu.utiletecsa.core.common.VersionNameComparator
import cu.utiletecsa.core.network.ApkIntegrityVerifier
import kotlinx.coroutines.withContext
import kotlinx.coroutines.Dispatchers

/**
 * Gestor de actualizaciones endurecido.
 *
 * Diferencias con `AppUpdateWorker`/`DownloadApkReceiver` del original:
 *  - Sin descargas automáticas ni receivers de intent custom.
 *  - Solo consulta version.json por HTTPS con allowlist y TLS restringido.
 *  - La descarga final la haría el usuario desde el propio canal oficial
 *    verificando SHA-256 (ApkIntegrityVerifier) antes de instalar.
 */
class UpdateManager(private val client: cu.utiletecsa.core.network.UpdateCheckClient) {

    suspend fun check(currentVersion: String): String = withContext(Dispatchers.IO) {
        runCatching { client.fetchUpdateManifest() }
            .fold(
                onSuccess = { manifest ->
                    when {
                        manifest.sha256.isBlank() ->
                            "Hay una versión ${manifest.version} publicada, pero el " +
                                "manifiesto no publica hash SHA-256: se rechaza la actualización."
                        !manifest.url.startsWith("https://") ->
                            "La versión ${manifest.version} apunta a una URL no HTTPS: se rechaza."
                        VersionNameComparator.isNewer(manifest.version, currentVersion) ->
                            "Nueva versión disponible: ${manifest.version}. " +
                                "Verifica su SHA-256 (${manifest.sha256.take(12)}…) antes de instalar."
                        else ->
                            "La app está actualizada (${manifest.version})."
                    }
                },
                onFailure = { "No se pudo comprobar actualizaciones: ${it.message}" },
            )
    }
}
