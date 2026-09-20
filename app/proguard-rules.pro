# Reglas R8 para la re-implementación endurecida.
# kotlinx-serialization, OkHttp, Coroutines y Compose ya traen consumer rules.

# Mantener los nombres de línea para stacktraces legibles (re-obfuscación mínima).
-keepattributes SourceFile,LineNumberTable
-renamesourcefileattribute SourceFile

# kotlinx-serialization: mantener serializadores generados (además de los consumer rules)
-keepclassmembers class cu.utiletecsa.core.model.** {
    *** Companion;
}
-keepclasseswithmembers class cu.utiletecsa.core.model.** {
    kotlinx.serialization.KSerializer serializer(...);
}
