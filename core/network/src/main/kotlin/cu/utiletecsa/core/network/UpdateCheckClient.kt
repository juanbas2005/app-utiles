package cu.utiletecsa.core.network

import cu.utiletecsa.core.model.UpdateManifest
import kotlinx.serialization.json.Json
import okhttp3.ConnectionSpec
import okhttp3.OkHttpClient
import okhttp3.Request
import java.io.IOException
import java.security.MessageDigest
import java.util.concurrent.TimeUnit

/**
 * Cliente del canal de actualizaciones.
 *
 * Diferencias de seguridad respecto al `AppUpdateWorker` original:
 *  - OkHttp con [ConnectionSpec.RESTRICTED_TLS] (TLS 1.2/1.3, sin fallback).
 *  - Allowlist de host HTTPS ([TlsPolicy.isAllowedUpdateUrl]) antes de cada petición.
 *  - El APK candidato se verifica por SHA-256 ([ApkIntegrityVerifier]) antes de
 *    entregarlo al sistema; el hash viaja en `version.json` y debe coincidir.
 *  - Sin descarga automática: solo se informa al usuario.
 */
class UpdateCheckClient(
    private val client: OkHttpClient = defaultClient(),
    private val manifestUrl: String = "https://apputiles.com/version.json",
) {

    /** Consulta el manifiesto de versión. Lanza [IOException] en error de red. */
    fun fetchUpdateManifest(): UpdateManifest {
        require(TlsPolicy.isAllowedUpdateUrl(manifestUrl)) { "URL de actualización no permitida" }
        val request = Request.Builder()
            .url(manifestUrl)
            .header("Cache-Control", "no-cache")
            .build()
        client.newCall(request).execute().use { response ->
            if (!response.isSuccessful) throw IOException("HTTP ${response.code} al consultar version.json")
            val body = response.body?.string() ?: throw IOException("Respuesta vacía")
            return parseUpdateManifest(body)
        }
    }

    companion object {
        private val json = Json { ignoreUnknownKeys = true }

        fun parseUpdateManifest(payload: String): UpdateManifest =
            json.decodeFromString(UpdateManifest.serializer(), payload)

        fun defaultClient(): OkHttpClient = OkHttpClient.Builder()
            .connectionSpecs(TlsPolicy.connectionSpecs)
            .connectTimeout(15, TimeUnit.SECONDS)
            .readTimeout(15, TimeUnit.SECONDS)
            .retryOnConnectionFailure(false)
            .build()
    }
}

/** Verificación de integridad por SHA-256 del APK candidato. */
object ApkIntegrityVerifier {

    fun sha256Hex(bytes: ByteArray): String =
        MessageDigest.getInstance("SHA-256").digest(bytes).joinToString("") { "%02x".format(it) }

    /** Devuelve true si el hash calculado coincide con el publicado (case-insensitive). */
    fun matches(expectedHex: String, actualBytes: ByteArray): Boolean =
        expectedHex.isNotBlank() && expectedHex.equals(sha256Hex(actualBytes), ignoreCase = true)
}
