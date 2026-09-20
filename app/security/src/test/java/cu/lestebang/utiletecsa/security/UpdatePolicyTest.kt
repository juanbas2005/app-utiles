package cu.lestebang.utiletecsa.security

import org.junit.Assert.assertEquals
import org.junit.Assert.assertFalse
import org.junit.Assert.assertTrue
import org.junit.Test

/**
 * Tests de la política de actualización segura (módulo :security, §F-08).
 * Lógica pura: sin dependencias Android.
 */
class UpdatePolicyTest {

    private val policy = UpdatePolicy()

    @Test
    fun `solo se ofrece actualizacion si el remoto es mayor`() {
        assertTrue(policy.shouldUpdate(localVersionCode = 10602, remoteVersionCode = 10603))
        assertFalse(policy.shouldUpdate(localVersionCode = 10602, remoteVersionCode = 10602))
        assertFalse(policy.shouldUpdate(localVersionCode = 10602, remoteVersionCode = 10599))
    }

    @Test
    fun `comparacion de versionName`() {
        assertTrue(policy.compareVersionName("1.6.2", "1.6.10") < 0)
        assertTrue(policy.compareVersionName("1.10.0", "1.9.9") > 0)
        assertEquals(0, policy.compareVersionName("1.6.2", "1.6.2"))
        assertEquals(0, policy.compareVersionName("1.6", "1.6.0"))
    }

    @Test
    fun `sha256 matches es case-insensitive`() {
        val hex = "e2631f1f9096ffaee56224735758f901a9207f365e46cd08950fadf2ad2f2e9f"
        assertTrue(policy.sha256Matches(hex, hex.uppercase()))
        assertFalse(policy.sha256Matches(hex, "0".repeat(64)))
        assertFalse(policy.sha256Matches(hex, "corto"))
    }

    @Test
    fun `actualizacion rechazada sin ninguna verificacion`() {
        val result = policy.checkUpdate(
            localVersionCode = 10602,
            remoteVersionCode = 10603,
            downloadedSha256 = "a".repeat(64),
            expectedSha256 = null,
            downloadedCertSha256 = null,
            installedCertSha256 = null,
        )
        assertFalse(result.accepted)
        assertTrue(result.reason.contains("falta verificación"))
    }

    @Test
    fun `sha256 correcto y version mayor acepta`() {
        val expected = "e2631f1f9096ffaee56224735758f901a9207f365e46cd08950fadf2ad2f2e9f"
        val result = policy.checkUpdate(
            localVersionCode = 10602,
            remoteVersionCode = 10603,
            downloadedSha256 = expected,
            expectedSha256 = expected,
            downloadedCertSha256 = null,
            installedCertSha256 = null,
        )
        assertTrue(result.accepted)
    }

    @Test
    fun `sha256 distinto rechaza aunque la version sea mayor`() {
        val result = policy.checkUpdate(
            localVersionCode = 10602,
            remoteVersionCode = 99999,
            downloadedSha256 = "a".repeat(64),
            expectedSha256 = "b".repeat(64),
            downloadedCertSha256 = null,
            installedCertSha256 = null,
        )
        assertFalse(result.accepted)
        assertTrue(result.reason.contains("SHA-256"))
    }

    @Test
    fun `certificado del descargado distinto al instalado rechaza`() {
        val result = policy.checkUpdate(
            localVersionCode = 10602,
            remoteVersionCode = 10603,
            downloadedSha256 = null,
            expectedSha256 = null,
            downloadedCertSha256 = "11".repeat(32),
            installedCertSha256 = "22".repeat(32),
        )
        assertFalse(result.accepted)
        assertTrue(result.reason.contains("certificado"))
    }

    @Test
    fun `certificados iguales y version mayor acepta`() {
        val result = policy.checkUpdate(
            localVersionCode = 10602,
            remoteVersionCode = 10603,
            downloadedSha256 = null,
            expectedSha256 = null,
            downloadedCertSha256 = "187c763aad58634aaf6c65e8043525c159d6afe061c1ec3e51c962b4ca6519b8",
            installedCertSha256 = "187C763AAD58634AAF6C65E8043525C159D6AFE061C1EC3E51C962B4CA6519B8",
        )
        assertTrue(result.accepted)
    }
}
