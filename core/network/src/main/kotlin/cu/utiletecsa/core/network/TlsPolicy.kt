package cu.utiletecsa.core.network

import okhttp3.CipherSuite
import okhttp3.ConnectionSpec
import okhttp3.HttpUrl.Companion.toHttpUrlOrNull
import okhttp3.TlsVersion

/**
 * Política TLS estricta para todo el tráfico de red de la app.
 *
 * Mitigaciones aplicadas frente al APK original:
 *  - `usesCleartextTraffic="true"` eliminado: aquí se REFUSA cualquier conexión HTTP.
 *  - Se restringe a TLS 1.2/1.3 con suites modernas (RESTRICTED_TLS de OkHttp).
 */
object TlsPolicy {

    /** Especificación de conexión: solo TLS moderno, sin cleartext. */
    val connectionSpec: ConnectionSpec = ConnectionSpec.RESTRICTED_TLS

    val connectionSpecs: List<ConnectionSpec> = listOf(connectionSpec)

    /** Conjuntos de cifrado mínimos aceptados (documentación/auditoría). */
    val requiredCipherSuites: Set<CipherSuite> = setOf(
        CipherSuite.TLS_AES_128_GCM_SHA256,
        CipherSuite.TLS_AES_256_GCM_SHA384,
        CipherSuite.TLS_ECDHE_ECDSA_WITH_AES_128_GCM_SHA256,
        CipherSuite.TLS_ECDHE_ECDSA_WITH_AES_256_GCM_SHA384,
        CipherSuite.TLS_ECDHE_RSA_WITH_AES_128_GCM_SHA256,
        CipherSuite.TLS_ECDHE_RSA_WITH_AES_256_GCM_SHA384,
    )

    val minimumTlsVersion: TlsVersion = TlsVersion.TLS_1_2

    /** Hosts autorizados para el canal de actualizaciones (allowlist HTTPS). */
    val allowedUpdateHosts: Set<String> = setOf("apputiles.com", "www.apputiles.com")

    /** Solo se aceptan URLs HTTPS de hosts en la allowlist de actualizaciones. */
    fun isAllowedUpdateUrl(url: String): Boolean {
        val parsed = url.toHttpUrlOrNull() ?: return false
        return parsed.isHttps && parsed.host in allowedUpdateHosts
    }
}
