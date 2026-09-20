package cu.utiletecsa.core.ussd

import android.Manifest
import android.content.Context
import android.content.pm.PackageManager
import android.os.Build
import android.telephony.TelephonyManager
import androidx.core.content.ContextCompat
import cu.utiletecsa.core.common.UssdCodeValidator
import kotlinx.coroutines.suspendCancellableCoroutine
import kotlin.coroutines.resume

/**
 * Ejecutor USSD endurecido.
 *
 * Mitigaciones respecto al original (`UssdShortcutActivity`/`UssdAutoUpdaterService`):
 *  - El código SIEMPRE pasa por [UssdCodeValidator] (regex estricta) — evita
 *    inyección de dígitos arbitrarios en el marcador.
 *  - Usa `TelephonyManager.sendUssdRequest` (API 26+) en vez de `ACTION_CALL`
 *    implícito, evitando intents implícitos interceptables.
 *  - Exige que la llamada provenga de una interacción del usuario (lo garantiza
 *    la feature que lo invoca; este módulo no se auto-ejecuta en background).
 */
class UssdExecutor(private val context: Context) {

    sealed interface Result {
        data class Success(val message: String) : Result
        data class Failure(val reason: String) : Result
    }

    suspend fun execute(rawCode: String): Result {
        val code = UssdCodeValidator.normalize(rawCode)
        if (!UssdCodeValidator.isValid(code)) {
            return Result.Failure("Código USSD inválido: se bloquea el marcado")
        }
        if (Build.VERSION.SDK_INT < Build.VERSION_CODES.O) {
            return Result.Failure("sendUssdRequest requiere Android 8.0+")
        }
        val telephony = context.getSystemService(TelephonyManager::class.java)
            ?: return Result.Failure("TelephonyManager no disponible")
        return suspendCancellableCoroutine { continuation ->
            val callback = object : TelephonyManager.UssdResponseCallback() {
                override fun onResponse(telephonyManager: TelephonyManager, response: CharSequence) {
                    if (continuation.isActive) continuation.resume(Result.Success(response.toString()))
                }

                override fun onFailed(telephonyManager: TelephonyManager, error: Int) {
                    if (continuation.isActive) continuation.resume(Result.Failure("USSD falló (código $error)"))
                }
            }
            runCatching { telephony.sendUssdRequest(code, callback, null) }
                .onFailure {
                    if (continuation.isActive) {
                        continuation.resume(Result.Failure("No se pudo enviar USSD: ${it.message}"))
                    }
                }
        }
    }

    /** El permiso CALL_PHONE ya no es necesario con sendUssdRequest (API 26+). */
    fun hasCallPhonePermission(): Boolean =
        ContextCompat.checkSelfPermission(context, Manifest.permission.CALL_PHONE) ==
            PackageManager.PERMISSION_GRANTED
}
