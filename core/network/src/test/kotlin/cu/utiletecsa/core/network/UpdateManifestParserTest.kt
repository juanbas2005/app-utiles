package cu.utiletecsa.core.network

import cu.utiletecsa.core.model.UpdateManifest
import org.junit.Assert.assertEquals
import org.junit.Assert.assertFalse
import org.junit.Assert.assertTrue
import org.junit.Test

class UpdateManifestParserTest {

    @Test
    fun `parsea un manifiesto completo`() {
        val payload = """
            {"version":"2.1.0","size":"22407919",
             "sha256":"e2631f1f9096ffaee56224735758f901a9207f365e46cd08950fadf2ad2f2e9f",
             "url":"https://apputiles.com/assets/UtilEs.apk"}
        """.trimIndent()
        val manifest = UpdateCheckClient.parseUpdateManifest(payload)
        assertEquals("2.1.0", manifest.version)
        assertEquals("22407919", manifest.size)
        assertEquals(64, manifest.sha256.length)
    }

    @Test
    fun `tolera campos desconocidos y usa valores por defecto`() {
        val payload = """{"version":"9.9.9","extra":"ignorado"}"""
        val manifest: UpdateManifest = UpdateCheckClient.parseUpdateManifest(payload)
        assertEquals("9.9.9", manifest.version)
        assertEquals("", manifest.sha256)
        assertTrue(manifest.url.startsWith("https://"))
    }

    @Test
    fun `verificador de integridad calcula sha256 correctamente`() {
        // sha256("abc") conocido
        assertEquals(
            "ba7816bf8f01cfea414140de5dae2223b00361a396177a9cb410ff61f20015ad",
            ApkIntegrityVerifier.sha256Hex("abc".toByteArray()),
        )
    }

    @Test
    fun `la verificación por hash es case-insensitive y exige hash publicado`() {
        val bytes = "abc".toByteArray()
        assertTrue(
            ApkIntegrityVerifier.matches(
                "BA7816BF8F01CFEA414140DE5DAE2223B00361A396177A9CB410FF61F20015AD",
                bytes,
            ),
        )
        assertFalse(ApkIntegrityVerifier.matches("", bytes))
        assertFalse(ApkIntegrityVerifier.matches("00", bytes))
    }
}
