package cu.lestebang.utiletecsa.data

import cu.lestebang.utiletecsa.data.repository.account.EmailNotVerifiedException
import cu.lestebang.utiletecsa.data.repository.account.LicensePricingDto
import cu.lestebang.utiletecsa.data.repository.account.LicenseRequestDto
import cu.lestebang.utiletecsa.data.repository.account.RedeemCouponDto
import cu.lestebang.utiletecsa.data.repository.forum.ForumCategoryDto
import cu.lestebang.utiletecsa.data.repository.profile.ProfileDto
import org.junit.Assert.assertEquals
import org.junit.Assert.assertFalse
import org.junit.Assert.assertTrue
import org.junit.Test

/**
 * Tests mínimos de la forma de los DTOs y contratos (módulo :data).
 */
class RepositoryContractsTest {

    @Test
    fun `cupon ok con descuento`() {
        val pricing = LicensePricingDto(
            couponCode = "CUBA10",
            discountPercent = 10,
            discountSource = "promo",
            saldoAmount = 100,
            transferAmount = 90,
        )
        val result = RedeemCouponDto(ok = true, error = "", pricing = pricing)
        assertTrue(result.ok)
        assertEquals(10, result.pricing?.discountPercent)
    }

    @Test
    fun `cupon fallido lleva mensaje de error y sin pricing`() {
        val result = RedeemCouponDto(ok = false, error = "cupon no valido", pricing = null)
        assertFalse(result.ok)
        assertEquals("cupon no valido", result.error)
    }

    @Test
    fun `solicitud de licencia conserva el transferId`() {
        val req = LicenseRequestDto(
            userId = "u1",
            transferId = "TRF-42",
            status = "pending",
            activatedAt = "",
            imagePath = "",
        )
        assertEquals("TRF-42", req.transferId)
    }

    @Test
    fun `excepcion de email sin verificar`() {
        val e = EmailNotVerifiedException()
        assertTrue(e.message!!.contains("verificad", ignoreCase = true))
    }

    @Test
    fun `perfil incluye fcmToken para push`() {
        val profile = ProfileDto(userId = "u1", fcmToken = "fcm-abc", updatedAt = "2026-09-20")
        assertEquals("fcm-abc", profile.fcmToken)
    }

    @Test
    fun `categorias de foro`() {
        val cats = listOf(
            ForumCategoryDto(key = "ayuda", label = "Ayuda"),
            ForumCategoryDto(key = "spots", label = "Spots"),
        )
        assertEquals(2, cats.size)
        assertEquals("ayuda", cats.first().key)
    }
}
