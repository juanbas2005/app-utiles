package cu.utiletecsa.feature.home

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Card
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import cu.utiletecsa.core.ussd.UssdCatalog

/**
 * Pantalla Home: catálogo de herramientas.
 *
 * A diferencia del original, NO hay atajos USSD ejecutables sin interacción:
 * toda consulta exige pasar por [cu.utiletecsa.feature.saldo.SaldoScreen] con
 * confirmación explícita del usuario (mitigación de hallazgo M-1).
 */
data class HomeItem(val id: String, val title: String, val subtitle: String)

private val herramientas = listOf(
    HomeItem("saldo", "Saldo y datos", "Consulta USSD con confirmación explícita"),
    HomeItem("vpn", "VPN (WireGuard)", "Estado y plan de integración del backend"),
    HomeItem("settings", "Ajustes", "Actualizaciones verificadas y política de seguridad"),
)

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun HomeScreen(
    onNavigate: (String) -> Unit,
    modifier: Modifier = Modifier,
) {
    Scaffold(
        modifier = modifier.fillMaxSize(),
        topBar = {
            TopAppBar(title = { Text("UtilEs · auditar y endurecer") })
        },
    ) { padding ->
        LazyColumn(
            modifier = Modifier
                .padding(padding)
                .fillMaxSize(),
            contentPadding = androidx.compose.foundation.layout.PaddingValues(16.dp),
            verticalArrangement = Arrangement.spacedBy(12.dp),
        ) {
            items(herramientas, key = { it.id }) { item ->
                Card(
                    modifier = Modifier.fillMaxWidth(),
                    onClick = { onNavigate(item.id) },
                ) {
                    Column(Modifier.padding(16.dp)) {
                        Text(item.title, style = MaterialTheme.typography.titleMedium)
                        Spacer(Modifier.height(4.dp))
                        Text(
                            item.subtitle,
                            style = MaterialTheme.typography.bodySmall,
                            color = MaterialTheme.colorScheme.onSurfaceVariant,
                        )
                    }
                }
            }
            item {
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.Center,
                    verticalAlignment = Alignment.CenterVertically,
                ) {
                    Text(
                        "Códigos USSD disponibles: " + UssdCatalog.ALL.joinToString { it.code },
                        style = MaterialTheme.typography.labelSmall,
                        color = MaterialTheme.colorScheme.onSurfaceVariant,
                    )
                }
            }
        }
    }
}
