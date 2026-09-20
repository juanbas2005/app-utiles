package cu.utiletecsa.security

import org.junit.Assert.assertEquals
import org.junit.Assert.assertFalse
import org.junit.Assert.assertTrue
import org.junit.Test

class SafeLoggerRedactionTest {

    private val logger = SafeLogger(debugMode = true)

    @Test
    fun `redacta números de teléfono cubanos`() {
        val redacted = logger.redact("Consulta desde +5351234567 OK")
        assertFalse(redacted.contains("51234567"))
        assertTrue(redacted.contains("•••"))
    }

    @Test
    fun `redacta correos electrónicos`() {
        val redacted = logger.redact("login de usuario@nauta.com.cu fallido")
        assertFalse(redacted.contains("usuario@nauta.com.cu"))
        assertTrue(redacted.contains("•••"))
    }

    @Test
    fun `redacta tokens y secretos`() {
        val redacted = logger.redact("token=abc123def456")
        assertFalse(redacted.contains("abc123def456"))
        assertTrue(redacted.contains("token=•••"))
    }

    @Test
    fun `no modifica mensajes sin PII`() {
        assertEquals("Consulta de saldo completada", logger.redact("Consulta de saldo completada"))
    }
}
