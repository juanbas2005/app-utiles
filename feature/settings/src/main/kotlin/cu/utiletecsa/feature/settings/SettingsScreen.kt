package cu.utiletecsa.feature.settings

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Card
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Switch
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import kotlinx.coroutines.launch

/**
 * Ajustes. Muestra el estado de las garantías de seguridad del build endurecido
 * y comprueba actualizaciones con verificación de integridad (sin descarga
 * automática: solo informa al usuario).
 */
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun SettingsScreen(
    darkTheme: Boolean,
    onDarkThemeChange: (Boolean) -> Unit,
    checkUpdates: suspend () -> String,
    modifier: Modifier = Modifier,
) {
    val scope = rememberCoroutineScope()
    var updateMessage by remember { mutableStateOf<String?>(null) }
    var checking by remember { mutableStateOf(false) }

    Scaffold(
        modifier = modifier.fillMaxSize(),
        topBar = { TopAppBar(title = { Text("Ajustes") }) },
    ) { padding ->
        Column(
            modifier = Modifier
                .padding(padding)
                .fillMaxSize()
                .padding(16.dp),
            verticalArrangement = Arrangement.spacedBy(12.dp),
        ) {
            Card(Modifier.fillMaxWidth()) {
                Column(Modifier.padding(16.dp)) {
                    Text("Apariencia", style = MaterialTheme.typography.titleMedium)
                    androidx.compose.foundation.layout.Row(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(top = 8.dp),
                    ) {
                        Text("Tema oscuro", Modifier.weight(1f))
                        Switch(checked = darkTheme, onCheckedChange = onDarkThemeChange)
                    }
                }
            }

            Card(Modifier.fillMaxWidth()) {
                Column(Modifier.padding(16.dp)) {
                    Text("Actualizaciones", style = MaterialTheme.typography.titleMedium)
                    Text(
                        "El canal de actualizaciones exige HTTPS (allowlist), TLS 1.2+ y " +
                            "verificación SHA-256 del APK antes de instalar. No se descarga " +
                            "nada en segundo plano.",
                        style = MaterialTheme.typography.bodySmall,
                        color = MaterialTheme.colorScheme.onSurfaceVariant,
                    )
                    TextButton(
                        enabled = !checking,
                        onClick = {
                            checking = true
                            scope.launch {
                                updateMessage = checkUpdates()
                                checking = false
                            }
                        },
                    ) { Text(if (checking) "Comprobando…" else "Buscar actualizaciones") }
                    updateMessage?.let {
                        Text(
                            it,
                            style = MaterialTheme.typography.bodySmall,
                            color = MaterialTheme.colorScheme.onSurfaceVariant,
                        )
                    }
                }
            }

            Card(Modifier.fillMaxWidth()) {
                Column(Modifier.padding(16.dp)) {
                    Text("Seguridad", style = MaterialTheme.typography.titleMedium)
                    Text(
                        buildString {
                            append("• Tráfico en claro: PROHIBIDO (network_security_config)\n")
                            append("• Backups: desactivados y reglas de extracción restrictivas\n")
                            append("• Contraseñas Nauta: AES-GCM + AndroidKeyStore\n")
                            append("• Componentes exportados: solo el launcher\n")
                            append("• Logs: redacción de PII y silenciosos en release")
                        },
                        style = MaterialTheme.typography.bodySmall,
                        color = MaterialTheme.colorScheme.onSurfaceVariant,
                    )
                }
            }
        }
    }
}
