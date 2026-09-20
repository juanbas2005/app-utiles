package cu.utiletecsa.core.network

import org.junit.Assert.assertEquals
import org.junit.Assert.assertFalse
import org.junit.Assert.assertTrue
import org.junit.Test

class TlsPolicyTest {

    @Test
    fun `solo se permiten URLs HTTPS de hosts en la allowlist`() {
        assertTrue(TlsPolicy.isAllowedUpdateUrl("https://apputiles.com/version.json"))
        assertTrue(TlsPolicy.isAllowedUpdateUrl("https://www.apputiles.com/version.json"))
    }

    @Test
    fun `rechaza HTTP en claro y hosts desconocidos`() {
        assertFalse(TlsPolicy.isAllowedUpdateUrl("http://apputiles.com/version.json"))
        assertFalse(TlsPolicy.isAllowedUpdateUrl("https://evil.example.com/version.json"))
        assertFalse(TlsPolicy.isAllowedUpdateUrl("no-es-una-url"))
    }

    @Test
    fun `la política de conexión prohíbe cleartext`() {
        assertFalse(TlsPolicy.connectionSpecs.any { it.isCleartextTrafficPermitted })
    }
}
