package cu.lestebang.utiletecsa.data.repository.account

/**
 * Precios de licencia y resultado de descuento por cupón.
 * Reconstruido desde `LicensePricingDto.java` decompilado.
 */
data class LicensePricingDto(
    val couponCode: String,
    val discountPercent: Int,
    val discountSource: String,
    val saldoAmount: Int,
    val transferAmount: Int,
)
