package cu.lestebang.utiletecsa.data.repository.account

/**
 * Contrato de la capa de cuenta/licencias.
 *
 * La implementación original vive en clases minificadas por R8
 * (ver `src/reference`); este contrato delimita la API que la UI consume.
 */
interface AccountRepository {
    /** Precios vigentes de la licencia (saldo CUP / transferencia CUP). */
    suspend fun fetchPricing(): LicensePricingDto

    /** Redime un cupón; lanza [EmailNotVerifiedException] si el email no está verificado. */
    suspend fun redeemCoupon(userId: String, couponCode: String): RedeemCouponDto

    /** Registra una solicitud de activación por transferencia. */
    suspend fun requestActivation(request: LicenseRequestDto)
}
