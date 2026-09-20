package cu.lestebang.utiletecsa.data.repository.feedback

/**
 * Contrato de la capa de feedback. La implementación original es minificada
 * (R8); ver `src/reference`.
 */
interface FeedbackRepository {
    suspend fun sendReport(report: AppReportDto)
}
