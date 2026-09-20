package cu.utiletecsa.core.preferences

import android.content.Context
import androidx.datastore.preferences.core.edit
import androidx.datastore.preferences.core.stringPreferencesKey
import cu.utiletecsa.security.CryptoEngine
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.map

/**
 * Preferencias de usuario sobre DataStore Preferences.
 *
 * Cambios de seguridad frente al original (`UserDataPreferences` serializado en
 * claro):
 *  - Los datos sensibles (nombre de usuario real, token FCM) se guardan CIFRADOS
 *    con [CryptoEngine] (AES-GCM + AndroidKeyStore) antes de escribirse.
 *  - El tema visual es un dato no sensible y se guarda en claro.
 */
class UserPreferencesDataSource(
    context: Context,
    private val crypto: CryptoEngine,
) {

    private val dataStore = context.applicationContext.userDataStore

    val userProfile: Flow<UserProfile> = dataStore.data.map { prefs ->
        UserProfile(
            displayName = prefs[KEY_DISPLAY_NAME_ENCRYPTED]
                ?.let { runCatching { crypto.decryptString(it) }.getOrNull() }
                .orEmpty(),
            fcmTokenEncrypted = prefs[KEY_FCM_TOKEN_ENCRYPTED].orEmpty(),
            darkTheme = prefs[KEY_DARK_THEME] ?: false,
        )
    }

    suspend fun setDisplayName(plainName: String) {
        dataStore.edit { prefs ->
            prefs[KEY_DISPLAY_NAME_ENCRYPTED] = crypto.encryptString(plainName)
        }
    }

    suspend fun setFcmToken(token: String) {
        dataStore.edit { prefs ->
            // El token FCM se persiste cifrado; JAMÁS se escribe en logs (ver SECURITY.md F-2).
            prefs[KEY_FCM_TOKEN_ENCRYPTED] = crypto.encryptString(token)
        }
    }

    suspend fun setDarkTheme(enabled: Boolean) {
        dataStore.edit { prefs ->
            prefs[KEY_DARK_THEME] = enabled
        }
    }

    suspend fun clearSensitive() {
        dataStore.edit { prefs ->
            prefs.remove(KEY_DISPLAY_NAME_ENCRYPTED)
            prefs.remove(KEY_FCM_TOKEN_ENCRYPTED)
        }
    }

    data class UserProfile(
        val displayName: String,
        val fcmTokenEncrypted: String,
        val darkTheme: Boolean,
    )

    private companion object {
        val KEY_DISPLAY_NAME_ENCRYPTED = stringPreferencesKey("display_name_encrypted")
        val KEY_FCM_TOKEN_ENCRYPTED = stringPreferencesKey("fcm_token_encrypted")
        val KEY_DARK_THEME = stringPreferencesKey("dark_theme")
    }
}

private val Context.userDataStore by androidx.datastore.preferences.preferencesDataStore(
    name = "utiletecsa_secure_prefs",
)
