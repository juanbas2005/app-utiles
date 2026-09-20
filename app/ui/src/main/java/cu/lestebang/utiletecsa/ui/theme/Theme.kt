package cu.lestebang.utiletecsa.ui.theme

/**
 * Paleta y constantes visuales de la app.
 *
 * ⚠️ PLACEHOLDER: la app original es Compose y su tema (Theme.kt + paletas)
 * vive en clases minificadas por R8 (no recuperable del APK sin el source).
 * Estos valores son un punto de partida documentado; recuperar la paleta real
 * desde el source original (`lestebang/utiles-landing`) es un pendiente.
 *
 * El manifiesto del original usa `Theme.Jetpack.Splash` (screen splash) y
 * soporte dinámico de color (ver `UserDataPreferences.useDynamicColor`).
 */
object AppColors {
    /** Azul ETECSA aproximado — pendiente de confirmar con el source. */
    val Primary: Long = 0xFF0095DA
    /** Verde de acción (saldo/ok). */
    val Action: Long = 0xFF1D873B
    /** Rojo de error. */
    val Error: Long = 0xFFFF5722
    /** Fondo claro. */
    val BackgroundLight: Long = 0xFFFFFFFF
    /** Fondo oscuro (modo AMOLED: negro puro). */
    val BackgroundDark: Long = 0xFF000000
}

/** Nombres de las secciones colapsables del home (claves de `homeCollapsedSections`). */
object HomeSections {
    const val USSD = "ussd"
    const val NAUTA = "nauta"
    const val CALLS = "llamadas"
    const val FORUM = "foro"
    const val SPOTS = "spots"
    const val PLANS = "planes"
    const val SERVICES = "servicios"
}

/** Acciones USSD soportadas por el atajo rápido (extra `ussd_action`, §F-05). */
object UssdActions {
    const val SALDO = "saldo"
    const val DATOS = "datos"
    const val VOZ = "voz"
    const val SMS = "sms"
}
