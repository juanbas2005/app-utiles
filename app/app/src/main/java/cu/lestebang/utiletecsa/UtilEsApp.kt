package cu.lestebang.utiletecsa

import android.app.Application

/**
 * Application de la reconstrucción.
 *
 * Diferencias vs `App.java` original (ver `ui/src/reference/java/…/App.java`):
 *
 *  - SIN inicialización de Firebase/Crashlytics/Analytics/Perf/Sessions/RC/
 *    Installations (mitigación §F-09): se reintroducirán solo los SDK que la
 *    feature correspondida necesite, con data collection desactivado por
 *    defecto y banner de aviso.
 *  - SIN `AppUpdateWorker` en cola al arrancar (mitigación §F-08): la
 *    comprobación de versiones pasa por [cu.lestebang.utiletecsa.security.UpdatePolicy]
 *    y solo la UI, con verificación de SHA-256/certificado, ofrece instalar.
 *  - SIN `UssdAutoBootReceiver` ni opt-out de battery optimizations
 *    (mitigación §F-11).
 */
class UtilEsApp : Application() {

    override fun onCreate() {
        super.onCreate()
        // Punto de partida deliberadamente vacío: los módulos se inicializan
        // cuando sus features se reconstruyan.
    }
}
