package cu.lestebang.utiletecsa.core.preferences.model

/**
 * Preferencias de usuario (reconstrucción de los 59 campos del
 * `UserDataPreferences.java` decompilado).
 *
 * ⚠️ SEGURIDAD (SECURITY.md §F-06): en la app original este objeto se
 * persistía íntegro en DataStore **sin cifrar**, incluyendo `transferPin`,
 * `nautaCookies`, `licenseTransferId` y el correo. En la reconstrucción, los
 * campos listados en [secureFields] NO deben persistirse en DataStore plano:
 * usar `cu.lestebang.utiletecsa.security.SecureStorage` (Android Keystore + Tink).
 *
 * Los valores por defecto se infirieron del constructor sintético decompilado
 * (toda la lista entraba en la máscara de defaults); donde el sentido del
 * campo lo sugiere se usa un default semántico (p. ej. `usdAutoIntervalMinutes`).
 */
data class UserDataPreferences(
    // --- Cuenta ---
    val accountAvatarUrl: String = "",
    val accountEmail: String = "",
    val accountId: String = "",
    val accountName: String = "",
    val userName: String = "",
    val profilePictureUriString: String = "",
    val invitationCode: String = "",

    // --- Licencia (sensible: ver F-06) ---
    val licenseStatus: String = "",
    val licenseCouponCode: String = "",
    val licenseActivatedAt: Long = 0L,
    val licenseLastCheckMillis: Long = 0L,
    val licenseDiscountPercent: Int = 0,
    val licenseDiscountSource: String = "",
    val licensePriceSaldoCup: Int = 0,
    val licensePriceTransferCup: Int = 0,
    val licenseTransferId: String = "",

    // --- App lock / temas ---
    val appLockEnabled: Boolean = false,
    val useDynamicColor: Boolean = false,
    val darkThemeConfigPreferences: DarkThemeConfigPreferences =
        DarkThemeConfigPreferences.FOLLOW_SYSTEM,

    // --- Actualización de app ---
    val appUpdateNotifiedVersion: String = "",

    // --- Llamadas: alertas y bloqueo (feature CallBlock/CallAlert) ---
    val callAlertAllCalls: Boolean = false,
    val callAlertRevertidaCalls: Boolean = false,
    val blockAllCalls: Boolean = false,
    val blockAnonymousCalls: Boolean = false,
    val blockFijoCalls: Boolean = false,
    val blockRevertidaCalls: Boolean = false,
    val blockUnknownCalls: Boolean = false,
    val voiceNotificationsIncomingEnabled: Boolean = false,
    val voiceNotificationsUssdEnabled: Boolean = false,

    // --- USSD: histórico y auto-consultas ---
    val asterisco99History: List<String> = emptyList(),
    val saldoUssdSim1: String = "",
    val saldoUssdSim2: String = "",
    val defaultSimSlot: Int = 0,
    val balanceSecondaryInfo: String = "",
    val ussdAutoEnabled: Boolean = false,
    val ussdAutoIntervalMinutes: Int = 15,
    val ussdAutoPeriodicEnabled: Boolean = false,
    val ussdAutoPeriodicQuery: String = "",
    val ussdAutoAfterCallEnabled: Boolean = false,
    val ussdAutoAfterDataOffEnabled: Boolean = false,
    val ussdAutoAfterSmsEnabled: Boolean = false,
    val ussdAutoDataCode: String = "",
    val ussdAutoSmsCode: String = "",
    val ussdAutoVoiceCode: String = "",
    val ussdRefreshModeEnabled: Boolean = false,

    // --- Nauta (VPN/WiFi ETECSA) — sensible: ver F-06 ---
    val nautaSessionUser: String = "",
    val nautaSessionAvailableTime: String = "",
    val nautaCookies: List<String> = emptyList(),
    val nautaSavedAccounts: List<String> = emptyList(),
    val nautaLogoutUrl: String = "",

    // --- Planes ---
    val planExpiryNotifyEnabled: Boolean = false,
    val planExpiryNotified: List<String> = emptyList(),
    val planesSinConfirmacion: Boolean = false,

    // --- UI ---
    val homeCollapsedSections: List<String> = emptyList(),
    val showEtecsaBanner: Boolean = true,
    val speedOverlayAutoEnabled: Boolean = false,

    // --- Foros / spots ---
    val forumTermsAccepted: Boolean = false,
    val termsAccepted: Boolean = false,
    val spotsDeviceId: String = "",
    val spotsNick: String = "",
    val spotsLastPublishMillis: Long = 0L,

    // --- PIN de transferencia — SENSIBLE: nunca en DataStore plano (F-06) ---
    val transferPin: String = "",

    // --- Metadatos ---
    val id: String = "",
    val permissionsRequestedOnce: Boolean = false,
) {
    /**
     * Marca de seguridad: campos que requieren persistencia cifrada
     * (módulo `:security`, `SecureStorage`).
     */
    val secureFields: Set<String> = setOf(
        "transferPin",
        "nautaCookies",
        "licenseTransferId",
        "licenseCouponCode",
        "accountEmail",
    )

    /** Versión con los campos sensibles vaciados (para logs/telemetría). */
    fun sanitized(): UserDataPreferences = copy(
        transferPin = "",
        nautaCookies = emptyList(),
        licenseTransferId = "",
        licenseCouponCode = "",
        accountEmail = "",
    )
}
