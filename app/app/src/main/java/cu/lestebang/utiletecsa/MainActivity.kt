package cu.lestebang.utiletecsa

import android.app.Activity
import android.os.Bundle
import android.widget.TextView

/**
 * Placeholder del shell reconstruido.
 *
 * `MainActivity` del original es una pantalla Compose con navigation graphs
 * de todas las features (ver `ui/src/reference/java/…/MainActivity.java`);
 * aquí solo se comprueba que el shell duro (tema, NSC, permisos) arranca.
 */
class MainActivity : Activity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val label = TextView(this).apply {
            text = "UtilEs ${BuildInfo.VERSION_NAME} (reconstrucción de seguridad)\n" +
                "Shell base: NSC sin cleartext, backup desactivado, sin SDKs de telemetría.\n" +
                "Ver SECURITY.md para el detalle de mitigaciones."
            setPadding(48, 96, 48, 48)
            textSize = 16f
        }
        setContentView(label)
    }
}
