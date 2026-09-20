package cu.utiletecsa.core.common

/**
 * Validación de códigos USSD antes de marcarlos.
 *
 * Un código USSD seguro cumple: empieza por `*` o `#`, contiene solo dígitos y los
 * caracteres `* # +`, longitud acotada y termina en `#`. Nunca se marcan cadenas
 * que no pasen esta validación (mitigación de U-2 / inyección de dial).
 */
object UssdCodeValidator {

    private val USSD_PATTERN = Regex("""^[*#][0-9*#+]{0,24}#$""")

    fun isValid(code: String): Boolean =
        code.length in 2..26 && USSD_PATTERN.matches(code)

    /** Normaliza quitando espacios y caracteres invisibles. */
    fun normalize(code: String): String = code.trim().replace(" ", "")
}
