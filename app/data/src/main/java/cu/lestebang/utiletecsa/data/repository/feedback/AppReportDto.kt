package cu.lestebang.utiletecsa.data.repository.feedback

/**
 * Reporte de error enviado por la app. Reconstruido desde `AppReportDto.java`
 * decompilado.
 */
data class AppReportDto(
    val userId: String,
    val userEmail: String,
    val device: String,
    val androidVersion: String,
    val appVersion: String,
    val type: String,
    val message: String,
    val error: String,
)
