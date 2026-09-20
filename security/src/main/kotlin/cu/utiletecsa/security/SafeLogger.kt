package cu.utiletecsa.security

/**
 * Logger seguro: en release NO emite nada (como Timber sin plant en el APK
 * original, pero explícito y auditado). En debug redacta mensajes que puedan
 * contener PII (teléfonos, correos, tokens) antes de imprimirlos.
 */
class SafeLogger(private val debugMode: Boolean) {

    fun d(tag: String, message: String) {
        if (!debugMode) return
        android.util.Log.d(tag, redact(message))
    }

    fun w(tag: String, message: String, error: Throwable? = null) {
        if (!debugMode) return
        android.util.Log.w(tag, redact(message), error)
    }

    /**
     * Redacción defensiva: sustituye teléfonos cubanos, correos y tokens largos.
     */
    fun redact(message: String): String = message
        .replace(Regex("\\+?53\\s?5\\d{7}")) { match -> "${match.value.take(3)}•••••••" }
        .replace(Regex("[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+")) { match ->
            val user = match.value.substringBefore('@')
            "${user.take(2)}•••@•••"
        }
        .replace(Regex("(?i)(token|password|secret)[=: ]+\\S+")) { "${it.groupValues[1]}=•••" }
}
