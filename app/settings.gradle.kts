pluginManagement {
    repositories {
        google {
            content {
                includeGroupByRegex("com\\.android.*")
                includeGroupByRegex("com\\.google.*")
                includeGroupByRegex("androidx.*")
            }
        }
        mavenCentral()
        gradlePluginPortal()
    }
}

dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
    }
}

rootProject.name = "utiles"

// ---------------------------------------------------------------------------
// Módulos ACTIVOS (los que compila la CI):
//   :app      → application (shell de la app: manifiesto endurecido, recursos)
//   :core     → modelos de dominio (network, preferences) — Kotlin
//   :data     → contratos de repositorio (DTOs y interfaces) — Kotlin
//   :ui       → shell de UI (tema, colores, entrada) — Kotlin
//   :security → mitigaciones de seguridad (firmas, storage, update policy)
//
// Módulos :features/* (home, auth, nauta, settings, sms, forum, planes,
// precios, red, ayuda, infoutil, servicios, profile, registro, widget):
//   NO están incluidos en esta lista de forma deliberada. Contienen el código
//   decompilado (JVM Java) que referencia clases minificadas por R8
//   (defpackage/*) y, por tanto, no es compilable sin el source original o el
//   mapping de R8. Cada módulo trae build.gradle.kts listo y su README con la
//   responsabilidad y el grafo de dependencias; ver ARCHITECTURE.md §6.
// ---------------------------------------------------------------------------
include(":app")
include(":core")
include(":data")
include(":ui")
include(":security")
