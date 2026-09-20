package cu.utiletecsa.security

import org.junit.Assert.assertFalse
import org.junit.Assert.assertNotEquals
import org.junit.Assert.assertTrue
import org.junit.Test

class PasswordHasherTest {

    private val hasher = PasswordHasher(iterations = 1_000) // iteraciones bajas SOLO en tests

    @Test
    fun `verifica la contraseña correcta`() {
        val stored = hasher.hash("S3creta!".toCharArray())
        assertTrue(hasher.verify("S3creta!".toCharArray(), stored))
    }

    @Test
    fun `rechaza contraseñas incorrectas`() {
        val stored = hasher.hash("S3creta!".toCharArray())
        assertFalse(hasher.verify("s3creta!".toCharArray(), stored))
        assertFalse(hasher.verify("", stored))
    }

    @Test
    fun `incluye salt aleatorio (mismo password, hashes distintos)`() {
        val a = hasher.hash("misma".toCharArray())
        val b = hasher.hash("misma".toCharArray())
        assertNotEquals(a, b)
        assertTrue(hasher.verify("misma".toCharArray(), a))
        assertTrue(hasher.verify("misma".toCharArray(), b))
    }

    @Test
    fun `formato del hash es pbkdf2-sha256-dollar-iteraciones-dollar-salt-dollar-hash`() {
        val stored = hasher.hash("x".toCharArray())
        val parts = stored.split('$')
        assertTrue(stored.startsWith("pbkdf2-sha256$"))
        assertEquals(4, parts.size)
        assertEquals("1000", parts[1])
    }

    @Test
    fun `rechaza hashes malformados sin lanzar`() {
        assertFalse(hasher.verify("x".toCharArray(), "garbage"))
        assertFalse(hasher.verify("x".toCharArray(), "md5$1$AA$BB"))
    }
}
