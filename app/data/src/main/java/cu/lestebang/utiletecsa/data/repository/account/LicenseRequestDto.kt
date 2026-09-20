package cu.lestebang.utiletecsa.data.repository.account

/**
 * Solicitud/estado de activación de licencia.
 * Reconstruido desde `LicenseRequestDto.java` decompilado.
 */
data class LicenseRequestDto(
    val userId: String,
    val transferId: String,
    val status: String,
    val activatedAt: String,
    val imagePath: String,
)
