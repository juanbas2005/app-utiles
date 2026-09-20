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

rootProject.name = "app-utiles"

include(":app")
include(":core:model")
include(":core:common")
include(":core:network")
include(":core:preferences")
include(":core:database")
include(":core:ussd")
include(":security")
include(":feature:home")
include(":feature:saldo")
include(":feature:settings")
include(":feature:vpn")
