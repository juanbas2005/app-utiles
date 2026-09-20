package cu.utiletecsa.core.common

import org.junit.Assert.assertEquals
import org.junit.Assert.assertFalse
import org.junit.Assert.assertTrue
import org.junit.Test

class UssdCodeValidatorTest {

    @Test
    fun `acepta códigos USSD reales de ETECSA`() {
        assertTrue(UssdCodeValidator.isValid("*222#"))
        assertTrue(UssdCodeValidator.isValid("*234#"))
        assertTrue(UssdCodeValidator.isValid("*2266#"))
        assertTrue(UssdCodeValidator.isValid("#99#"))
    }

    @Test
    fun `rechaza cadenas que no son códigos USSD`() {
        assertFalse(UssdCodeValidator.isValid("222#"))
        assertFalse(UssdCodeValidator.isValid("*222"))
        assertFalse(UssdCodeValidator.isValid("*222#; rm -rf /"))
        assertFalse(UssdCodeValidator.isValid(""))
        assertFalse(UssdCodeValidator.isValid("*222#DROP TABLE"))
        assertFalse(UssdCodeValidator.isValid("*222#\n"))
        assertFalse(UssdCodeValidator.isValid("tel:*222#"))
    }

    @Test
    fun `rechaza códigos excesivamente largos`() {
        val largo = "*" + "1".repeat(30) + "#"
        assertFalse(UssdCodeValidator.isValid(largo))
    }

    @Test
    fun `normaliza espacios`() {
        assertEquals("*222#", UssdCodeValidator.normalize(" *222 # "))
    }
}
