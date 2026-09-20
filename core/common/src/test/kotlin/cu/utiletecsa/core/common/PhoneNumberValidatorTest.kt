package cu.utiletecsa.core.common

import org.junit.Assert.assertEquals
import org.junit.Assert.assertFalse
import org.junit.Assert.assertNull
import org.junit.Assert.assertTrue
import org.junit.Test

class PhoneNumberValidatorTest {

    @Test
    fun `acepta móviles cubanos en E164`() {
        assertTrue(PhoneNumberValidator.isValidCubanMobile("+5351234567"))
    }

    @Test
    fun `rechaza números que no son móviles cubanos`() {
        assertFalse(PhoneNumberValidator.isValidCubanMobile("+5361234567"))
        assertFalse(PhoneNumberValidator.isValidCubanMobile("+5251234567"))
        assertFalse(PhoneNumberValidator.isValidCubanMobile("5351234567"))
        assertFalse(PhoneNumberValidator.isValidCubanMobile("+53512345678"))
    }

    @Test
    fun `normaliza formatos locales a E164`() {
        assertEquals("+5351234567", PhoneNumberValidator.toE164("5123 4567"))
        assertEquals("+5351234567", PhoneNumberValidator.toE164("+53 5123 4567"))
    }

    @Test
    fun `devuelve null en entradas inválidas`() {
        assertNull(PhoneNumberValidator.toE164("123"))
        assertNull(PhoneNumberValidator.toE164("abcd"))
    }
}
