package cu.lestebang.utiletecsa.core

import cu.lestebang.utiletecsa.core.network.model.NetworkPost
import cu.lestebang.utiletecsa.core.preferences.model.DarkThemeConfigPreferences
import cu.lestebang.utiletecsa.core.preferences.model.PreferencesUserProfile
import cu.lestebang.utiletecsa.core.preferences.model.UserDataPreferences
import org.junit.Assert.assertEquals
import org.junit.Assert.assertNotEquals
import org.junit.Assert.assertTrue
import org.junit.Test

/**
 * Tests mínimos de los modelos del dominio (módulo :core).
 */
class ModelsTest {

    @Test
    fun `network post inmutabilidad y copy()`() {
        val post = NetworkPost(id = 1, title = "T", url = "u", thumbnailUrl = "t")
        assertEquals(1, post.id)
        val copy = post.copy(title = "T2")
        assertEquals("T2", copy.title)
        assertEquals(post.url, copy.url)
        assertNotEquals(post, copy)
    }

    @Test
    fun `user data preferences defaults seguros()`() {
        val prefs = UserDataPreferences()
        // Los campos sensibles nacen vacíos: nada sensible por defecto.
        assertEquals("", prefs.transferPin)
        assertTrue(prefs.nautaCookies.isEmpty())
        assertEquals("", prefs.licenseTransferId)
        // El intervalo USSD por defecto no debe ser 0 (no sentido real).
        assertTrue(prefs.ussdAutoIntervalMinutes > 0)
        // La lista de campos sensibles incluye a los críticos.
        assertTrue(
            setOf("transferPin", "nautaCookies", "licenseTransferId")
                .all { it in prefs.secureFields }
        )
    }

    @Test
    fun `sanitized vacia campos sensibles pero conserva el resto()`() {
        val prefs = UserDataPreferences(
            transferPin = "1234",
            nautaCookies = listOf("a=b"),
            licenseTransferId = "TRF-1",
            accountEmail = "x@y.cu",
            userName = "ana",
        )
        val clean = prefs.sanitized()
        assertEquals("", clean.transferPin)
        assertTrue(clean.nautaCookies.isEmpty())
        assertEquals("", clean.licenseTransferId)
        assertEquals("", clean.accountEmail)
        assertEquals("ana", clean.userName)
    }

    @Test
    fun `tema por defecto sigue el sistema()`() {
        assertEquals(
            DarkThemeConfigPreferences.FOLLOW_SYSTEM,
            UserDataPreferences().darkThemeConfigPreferences
        )
        assertEquals(4, DarkThemeConfigPreferences.values().size)
    }

    @Test
    fun `perfil minimo`() {
        val profile = PreferencesUserProfile(id = "u1", profilePictureUriString = "", userName = "ana")
        assertEquals("ana", profile.userName)
    }
}
