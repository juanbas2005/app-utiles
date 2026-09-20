package cu.lestebang.utiletecsa.data.repository.account

/**
 * Resultado de la redención de un cupón de licencia.
 * Reconstruido desde `RedeemCouponDto.java` decompilado.
 */
data class RedeemCouponDto(
    val ok: Boolean,
    val error: String,
    val pricing: LicensePricingDto?,
)
