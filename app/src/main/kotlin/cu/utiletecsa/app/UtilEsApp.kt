package cu.utiletecsa.app

import android.app.Application
import cu.utiletecsa.core.database.UtilTecsDatabase
import cu.utiletecsa.core.network.UpdateCheckClient
import cu.utiletecsa.core.preferences.UserPreferencesDataSource
import cu.utiletecsa.core.ussd.UssdExecutor
import cu.utiletecsa.security.AndroidKeystoreKeyProvider
import cu.utiletecsa.security.CryptoEngine
import cu.utiletecsa.security.SafeLogger
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.SupervisorJob

/**
 * Application con contenedor de dependencias manual (sin Hilt a propósito:
 * menos superficie de generación de código en una base de re-implementación).
 */
class UtilEsApp : Application() {

    val applicationScope = CoroutineScope(SupervisorJob() + Dispatchers.Default)

    val logger: SafeLogger by lazy {
        SafeLogger(debugMode = BuildConfig.DEBUG)
    }

    val cryptoEngine: CryptoEngine by lazy {
        CryptoEngine(AndroidKeystoreKeyProvider())
    }

    val database: UtilTecsDatabase by lazy { UtilTecsDatabase.get(this) }

    val preferences: UserPreferencesDataSource by lazy {
        UserPreferencesDataSource(this, cryptoEngine)
    }

    val ussdExecutor: UssdExecutor by lazy { UssdExecutor(this) }

    val updateClient: UpdateCheckClient by lazy { UpdateCheckClient() }

    override fun onCreate() {
        super.onCreate()
        // Nota deliberada: NO hay consultas automáticas en background, NO se
        // planta un logger global, NO se inicia ningún service al arranque.
        logger.d("UtilEsApp", "Arranque de la app (build debug=${BuildConfig.DEBUG})")
    }
}
