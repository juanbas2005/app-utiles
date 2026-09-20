package cu.utiletecsa.feature.saldo

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.AlertDialog
import androidx.compose.material3.Card
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import kotlinx.coroutines.launch

/**
 * Consulta de saldo/datos por USSD con confirmación explícita.
 *
 * Mitigación del hallazgo M-1 (componentes exportados que marcaban USSD sin
 * interacción): aquí el usuario elige el código Y confirma en un diálogo antes
 * de que se marque nada.
 */
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun SaldoScreen(
    viewModel: SaldoViewModel,
    modifier: Modifier = Modifier,
) {
    val scope = rememberCoroutineScope()
    var pendiente by remember { mutableStateOf<String?>(null) }
    var ocupado by remember { mutableStateOf(false) }
    var respuesta by remember { mutableStateOf<String?>(null) }

    Scaffold(
        modifier = modifier.fillMaxSize(),
        topBar = { TopAppBar(title = { Text("Saldo y datos") }) },
    ) { padding ->
        Column(
            modifier = Modifier
                .padding(padding)
                .fillMaxSize()
                .padding(16.dp),
            verticalArrangement = Arrangement.spacedBy(12.dp),
        ) {
            viewModel.codigos.forEach { codigo ->
                Card(
                    modifier = Modifier.fillMaxWidth(),
                    onClick = { if (!ocupado) pendiente = codigo.id },
                ) {
                    Row(
                        modifier = Modifier.padding(16.dp),
                        verticalAlignment = Alignment.CenterVertically,
                    ) {
                        Column(Modifier.weight(1f)) {
                            Text(codigo.nombre, style = MaterialTheme.typography.titleMedium)
                            Text(
                                codigo.code,
                                style = MaterialTheme.typography.bodySmall,
                                color = MaterialTheme.colorScheme.onSurfaceVariant,
                            )
                        }
                        Text(codigo.categoria.name, style = MaterialTheme.typography.labelSmall)
                    }
                }
            }

            Spacer(Modifier.height(8.dp))
            if (ocupado) {
                Row(verticalAlignment = Alignment.CenterVertically) {
                    CircularProgressIndicator(Modifier.height(20.dp))
                    Text("  Marcando…", style = MaterialTheme.typography.bodySmall)
                }
            }
            respuesta?.let {
                Card(Modifier.fillMaxWidth()) {
                    Column(Modifier.padding(16.dp)) {
                        Text("Respuesta", style = MaterialTheme.typography.labelMedium)
                        Text(it, style = MaterialTheme.typography.bodyMedium)
                    }
                }
            }
        }
    }

    pendiente?.let { codeId ->
        val codigo = viewModel.codigos.first { it.id == codeId }
        AlertDialog(
            onDismissRequest = { pendiente = null },
            title = { Text("Confirmar consulta") },
            text = { Text("¿Marcar ${codigo.code} (${codigo.nombre})? Esta acción se hace desde tu línea.") },
            confirmButton = {
                TextButton(
                    onClick = {
                        pendiente = null
                        ocupado = true
                        scope.launch {
                            val result = viewModel.consultar(codigo.id)
                            respuesta = when (result) {
                                is cu.utiletecsa.core.ussd.UssdExecutor.Result.Success ->
                                    result.message.ifBlank { "(sin respuesta de la red)" }
                                is cu.utiletecsa.core.ussd.UssdExecutor.Result.Failure ->
                                    "Error: ${result.reason}"
                            }
                            ocupado = false
                        }
                    },
                ) { Text("Marcar") }
            },
            dismissButton = { TextButton(onClick = { pendiente = null }) { Text("Cancelar") } },
        )
    }
}
