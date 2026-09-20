package cu.utiletecsa.core.common

/**
 * Validador de números de teléfono cubanos (+53 5XXXXXXX móviles, 8 dígitos
 * comenzando por 5 para ETECSA móvil).
 */
object PhoneNumberValidator {

    private val CUBA_MOBILE = Regex("""^\+535\d{7}$""")

    fun isValidCubanMobile(e164: String): Boolean = CUBA_MOBILE.matches(e164)

    /** Acepta "5xxx xxxx", "53 5xxx xxxx", "+53 5xxx xxxx" y devuelve formato E.164 o null. */
    fun toE164(raw: String): String? {
        val digits = raw.filter { it.isDigit() }
        val normalized = when {
            digits.length == 8 -> "+53$digits"
            digits.length == 10 && digits.startsWith("53") -> "+$digits"
            digits.length == 11 && digits.startsWith("535") -> "+$digits"
            else -> return null
        }
        return normalized.takeIf { isValidCubanMobile(it) }
    }
}
