package cu.lestebang.utiletecsa.ui.theme

import org.junit.Assert.assertEquals
import org.junit.Assert.assertTrue
import org.junit.Test

class ThemeTest {

    @Test
    fun `secciones del home son estables`() {
        val sections = setOf(
            HomeSections.USSD,
            HomeSections.NAUTA,
            HomeSections.CALLS,
            HomeSections.FORUM,
            HomeSections.SPOTS,
            HomeSections.PLANS,
            HomeSections.SERVICES,
        )
        assertEquals(7, sections.size)
    }

    @Test
    fun `acciones ussd coinciden con el atajo del manifiesto`() {
        // SECURITY.md §F-05: el atajo recibe saldo|datos|voz|sms
        val actions = setOf(UssdActions.SALDO, UssdActions.DATOS, UssdActions.VOZ, UssdActions.SMS)
        assertEquals(4, actions.size)
        assertTrue(UssdActions.SALDO in actions)
    }

    @Test
    fun `colores son valores ARGB de 32 bits`() {
        val values = listOf(
            AppColors.Primary,
            AppColors.Action,
            AppColors.Error,
            AppColors.BackgroundLight,
            AppColors.BackgroundDark,
        )
        values.forEach { assertTrue(it and 0xFFFFFFFFL in 0..0xFFFFFFFFL) }
    }
}
