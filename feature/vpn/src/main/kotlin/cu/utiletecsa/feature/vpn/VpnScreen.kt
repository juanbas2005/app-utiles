package cu.utiletecsa.feature.vpn

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Card
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

/**
 * Pantalla de VPN (WireGuard) — estado actual.
 *
 * El APK original integra el backend Go de WireGuard (`libwg-go.so`, paquete
 * `com.wireguard.android.backend`). La re-implementación endurecida aún NO incluye
 * las librerías nativas: este módulo documenta el plan de integración y sirve de
 * ancla de navegación. Ver ARCHITECTURE.md → "Módulo :feature:vpn".
 */
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun VpnScreen(modifier: Modifier = Modifier) {
    Scaffold(
        modifier = modifier.fillMaxSize(),
        topBar = { TopAppBar(title = { Text("VPN · WireGuard") }) },
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
                    Text("Estado: no disponible", style = MaterialTheme.typography.titleMedium)
                    Text(
                        "El backend WireGuard (libwg-go) se re-integra como dependencia " +
                            "versionada, no desde el binario original, para poder auditar " +
                            "su procedencia. Plan de integración en ARCHITECTURE.md.",
                        style = MaterialTheme.typography.bodySmall,
                        color = MaterialTheme.colorScheme.onSurfaceVariant,
                    )
                }
            }
            Card(Modifier.fillMaxWidth()) {
                Column(Modifier.padding(16.dp)) {
                    Text("Por qué no se copió el .so", style = MaterialTheme.typography.titleMedium)
                    Text(
                        "Copiar binarios de una app decompilada impide garantizar su " +
                            "procedencia. La integración correcta usa el artefacto oficial " +
                            "com.wireguard.android:tunnel de Maven Central.",
                        style = MaterialTheme.typography.bodySmall,
                        color = MaterialTheme.colorScheme.onSurfaceVariant,
                    )
                }
            }
        }
    }
}
