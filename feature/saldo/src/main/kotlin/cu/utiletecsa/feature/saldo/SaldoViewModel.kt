package cu.utiletecsa.feature.saldo

import cu.utiletecsa.core.database.UtilTecsDatabase
import cu.utiletecsa.core.ussd.UssdCatalog
import cu.utiletecsa.core.ussd.UssdExecutor
import kotlinx.coroutines.CoroutineDispatcher
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

/**
 * Lógica de consulta de saldo/datos.
 *
 * Flujo endurecido: código del catálogo cerrado -> validación -> ejecución USSD ->
 * persistencia local del resultado. Ninguna consulta sale del dispositivo y
 * ninguna se dispara sin interacción del usuario.
 */
class SaldoViewModel(
    private val ussd: UssdExecutor,
    private val db: UtilTecsDatabase,
    private val ioDispatcher: CoroutineDispatcher = Dispatchers.IO,
) {

    val codigos = UssdCatalog.ALL

    suspend fun consultar(codeId: String): UssdExecutor.Result = withContext(ioDispatcher) {
        val code = UssdCatalog.byId(codeId)
            ?: return@withContext UssdExecutor.Result.Failure("Código desconocido")
        when (val result = ussd.execute(code.code)) {
            is UssdExecutor.Result.Success -> {
                db.insertUssdResponse(code.code, result.message, System.currentTimeMillis())
                result
            }
            is UssdExecutor.Result.Failure -> result
        }
    }
}
