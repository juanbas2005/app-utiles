package cu.lestebang.utiletecsa.data.repository.account

/**
 * Excepción lanzada cuando la cuenta de email asociada a la licencia no ha
 * verificado su correo (Supabase Auth). Reconstruida desde el decompilado.
 */
class EmailNotVerifiedException(message: String = "Email no verificado") : Exception(message)
