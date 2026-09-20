package cu.utiletecsa.core.common

import org.junit.Assert.assertEquals
import org.junit.Assert.assertFalse
import org.junit.Assert.assertTrue
import org.junit.Test

class VersionNameComparatorTest {

    @Test
    fun `compara componentes numéricos no lexicográficos`() {
        assertTrue(VersionNameComparator.compare("1.10.0", "1.9.9") > 0)
        assertEquals(0, VersionNameComparator.compare("2.0.0", "2.0.0"))
        assertTrue(VersionNameComparator.compare("1.9", "1.10") < 0)
    }

    @Test
    fun `detecta versiones más nuevas`() {
        assertTrue(VersionNameComparator.isNewer("2.0.1", "2.0.0"))
        assertFalse(VersionNameComparator.isNewer("1.99.99", "2.0.0"))
    }

    @Test
    fun `ignora sufijos de pre-release en la comparación base`() {
        assertTrue(VersionNameComparator.isNewer("2.1.0", "2.0.0-beta"))
        assertEquals(0, VersionNameComparator.compare("2.0.0-rc1", "2.0.0"))
    }

    @Test
    fun `tolera versiones malformadas`() {
        assertEquals(0, VersionNameComparator.compare("abc", "x.y"))
        assertTrue(VersionNameComparator.isNewer("3", "2"))
    }
}
