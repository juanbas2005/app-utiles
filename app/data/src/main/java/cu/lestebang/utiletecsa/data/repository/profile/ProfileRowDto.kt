package cu.lestebang.utiletecsa.data.repository.profile

/**
 * Fila de perfil (código de invitación / registro con código).
 * Reconstruido desde `ProfileRowDto.java` decompilado.
 */
data class ProfileRowDto(
    val userId: String,
    val invitationCode: String,
    val registeredWithCode: String,
)
