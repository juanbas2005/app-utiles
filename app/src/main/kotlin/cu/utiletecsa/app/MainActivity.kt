package cu.utiletecsa.app

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.rememberCoroutineScope
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import cu.utiletecsa.feature.home.HomeScreen
import cu.utiletecsa.feature.saldo.SaldoScreen
import cu.utiletecsa.feature.saldo.SaldoViewModel
import cu.utiletecsa.feature.settings.SettingsScreen
import cu.utiletecsa.feature.vpn.VpnScreen
import kotlinx.coroutines.launch

class MainActivity : ComponentActivity() {

    private val app get() = application as UtilEsApp

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

        val saldoViewModel = SaldoViewModel(app.ussdExecutor, app.database)
        val updateManager = UpdateManager(app.updateClient)

        setContent {
            val prefs by app.preferences.userProfile.collectAsState(initial = null)
            val dark = prefs?.darkTheme ?: isSystemInDarkTheme()
            val scope = rememberCoroutineScope()

            androidx.compose.material3.MaterialTheme(
                colorScheme = if (dark) {
                    androidx.compose.material3.darkColorScheme()
                } else {
                    androidx.compose.material3.lightColorScheme()
                },
            ) {
                val navController = rememberNavController()
                NavHost(navController = navController, startDestination = "home") {
                    composable("home") {
                        HomeScreen(onNavigate = { id ->
                            navController.navigate(id)
                        })
                    }
                    composable("saldo") {
                        SaldoScreen(viewModel = saldoViewModel)
                    }
                    composable("vpn") {
                        VpnScreen()
                    }
                    composable("settings") {
                        SettingsScreen(
                            darkTheme = dark,
                            onDarkThemeChange = { enabled ->
                                scope.launch { app.preferences.setDarkTheme(enabled) }
                            },
                            checkUpdates = { updateManager.check(BuildConfig.VERSION_NAME) },
                        )
                    }
                }
            }
        }
    }
}
