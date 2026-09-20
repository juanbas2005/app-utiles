package cu.lestebang.utiletecsa.data.repository.profile

import cu.lestebang.utiletecsa.core.preferences.model.PreferencesUserProfile

/**
 * Contrato de la capa de perfil. La implementación original es minificada
 * (R8); ver `src/reference`.
 */
interface ProfileRepository {
    suspend fun fetchProfile(userId: String): PreferencesUserProfile

    suspend fun fetchProfileRow(userId: String): ProfileRowDto?

    /** Publica el perfil con el FCM token para recibir notificaciones push. */
    suspend fun upsertProfile(profile: ProfileDto)
}
