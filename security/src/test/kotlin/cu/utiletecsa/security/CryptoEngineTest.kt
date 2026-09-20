package cu.utiletecsa.security

import org.junit.Assert.assertEquals
import org.junit.Assert.assertFalse
import org.junit.Assert.assertNotEquals
import org.junit.Assert.assertThrows
import org.junit.Assert.assertTrue
import org.junit.Test

class CryptoEngineTest {

    private val engine = CryptoEngine(InMemoryKeyProvider())

    @Test
    fun `roundtrip AES-GCM preserva el texto`() {
        val token = engine.encryptString("miContraseñaNauta123!")
        assertEquals("miContraseñaNauta123!", engine.decryptString(token))
    }

    @Test
    fun `cada cifrado usa un IV distinto (no determinista)`() {
        val a = engine.encryptString("mismo-texto")
        val b = engine.encryptString("mismo-texto")
        assertNotEquals(a, b)
        assertEquals(engine.decryptString(a), engine.decryptString(b))
    }

    @Test
    fun `el formato del token es v1-iv-ciphertext`() {
        val token = engine.encryptString("hola")
        val parts = token.split('.')
        assertEquals(3, parts.size)
        assertEquals("v1", parts[0])
        assertTrue(token.startsWith("v1."))
    }

    @Test
    fun `rechaza tokens manipulados o con formato inválido`() {
        assertThrows(IllegalArgumentException::class.java) {
            engine.decryptString("v9.AAAA.BBBB")
        }
        assertThrows(IllegalArgumentException::class.java) {
            engine.decryptString("mierda-de-token")
        }
    }

    @Test
    fun `alias distintos generan datos incompatibles`() {
        val token = engine.encryptString("secreto", alias = "alias_a")
        assertThrows(Exception::class.java) {
            engine.decryptString(token, alias = "alias_b")
        }
    }
}
