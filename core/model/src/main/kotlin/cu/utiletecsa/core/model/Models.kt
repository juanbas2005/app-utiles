package cu.utiletecsa.core.model

import kotlinx.serialization.Serializable

/**
 * Código USSD permitido por la allowlist de la app (p. ej. *222# — saldo CUBACEL).
 */
data class UssdCode(
    val id: String,
    val nombre: String,
    val code: String,
    val categoria: Categoria,
) {
    enum class Categoria { SALDO, DATOS, VOZ, SMS, OTROS }
}

/** Instantánea de un resultado de consulta (saldo/datos/voz/sms). */
data class BalanceSnapshot(
    val code: String,
    val valor: String,
    val fechaEpochMillis: Long,
)

/** Cuenta de correo Nauta almacenada (la contraseña NUNCA se guarda en claro). */
data class NautaAccountModel(
    val email: String,
    val lastUsedEpochMillis: Long,
)

/** Manifiesto de actualización publicado en https://apputiles.com/version.json */
@Serializable
data class UpdateManifest(
    val version: String,
    val size: String = "",
    val sha256: String = "",
    val url: String = "https://apputiles.com/assets/UtilEs.apk",
)
