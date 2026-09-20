package cu.lestebang.utiletecsa

import org.junit.Assert.assertEquals
import org.junit.Assert.assertTrue
import org.junit.Test

class BuildInfoTest {

    @Test
    fun `version de la reconstrucion es mayor que la original`() {
        // Original: 10602 / 1.6.2 (apk-original/README.md)
        assertTrue(BuildInfo.VERSION_CODE > 10602)
        assertTrue(BuildInfo.VERSION_NAME.startsWith("1.6.3"))
    }

    @Test
    fun `huella del certificado original documentada`() {
        // Evidencia de la auditoría (apk-original/signature/)
        assertEquals(
            "187c763aad58634aaf6c65e8043525c159d6afe061c1ec3e51c962b4ca6519b8",
            BuildInfo.ORIGINAL_CERT_SHA256
        )
        assertEquals(64, BuildInfo.ORIGINAL_CERT_SHA256.length)
    }
}
