package cu.lestebang.utiletecsa.data.repository.profile

/**
 * Perfil de usuario en el backend.
 * ⚠️ `fcmToken`: el token de push viaja al backend (SECURITY.md §F-09).
 * Reconstruido desde `ProfileDto.java` decompilado.
 */
data class ProfileDto(
    val userId: String,
    val fcmToken: String,
    val updatedAt: String,
)
