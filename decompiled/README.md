# Descompilación de UtilEs v1.6.2

Resultado del paso 1 de la auditoría. Herramientas y parámetros:

| Herramienta | Versión | Uso |
|---|---|---|
| jadx | 1.1.0 (CLI, vía `@mishguru/jadx-node`) | `jadx -d decompiled/sources --no-res --show-bad-code --threads-count 2 UtilEs.apk` |
| apktool | 2.4.1 (jar oficial) | `apktool d -f -o out UtilEs.apk` |
| Java | Temurin JRE 21.0.12 | runtime de ambas herramientas |

> Las versiones concretas de jadx/apktool no son las más recientes (las
> distribuciones oficiales de 2026 no estaban accesibles desde el entorno de
> auditoría); los resultados se validaron cruzando ambos outputs + androguard.

## Estructura

```
decompiled/
├── sources/          # Código Java decompilado por jadx (10 487 archivos, ~67 MB)
│   ├── cu/lestebang/utiletecsa/   ← CÓDIGO PROPIO de la app (86 clases, ~19.7 k LOC)
│   │   ├── core/       (network, preferences, room)
│   │   ├── data/       (DTOs de repositories: account, forum, profile, spots, feedback)
│   │   ├── feature/    (auth, home, nauta, planes, precios, red, sms, settings, ...)
│   │   ├── messaging/  (servicio FCM)
│   │   ├── shortcuts/  (UssdShortcutActivity)
│   │   ├── sync/       (DownloadApkReceiver + WorkManager workers)
│   │   └── widget/     (6 widgets de pantalla de inicio)
│   ├── defpackage/   ← 9 748 clases RENOMBRADAS POR R8 (terceros minificados:
│   │                   androidx, Hilt/Koin, Compose, Firebase, Supabase, OkHttp, WireGuard…)
│   └── androidx/ com/ io/ kotlin/ kotlinx/ okhttp3/ retrofit2/ …  (paquetes no minificados)
└── resources/        # Salida de apktool
    ├── AndroidManifest.xml   # manifiesto decodificado (AXML → XML legible)
    ├── res/                  # recursos decodificados (values, drawables, xml…)
    ├── assets/               # dexopt profiles, PublicSuffixDatabase.list
    └── lib/                  # librerías nativas (4 ABIs, WireGuard)

smali/                # DASMALI del classes.dex (10 507 archivos, ~174 MB) — código Dalvik
```

## Notas de lectura

1. **La app está minificada con R8** (full mode): el 94 % de las clases
   (`defpackage/a, a0, a00, …`) tienen nombres de 1-3 caracteres. Las clases
   propias (`cu.lestebang.utiletecsa.*`) se conservan gracias a reglas `keep`.
   Cada archivo lleva el comentario `/* compiled from: r8-map-id-… */`.
2. **Los DTOs y modelos de `cu.lestebang.utiletecsa.core`/`.data` son casi
   legibles** (data classes con kotlinx.serialization). La lógica de negocio
   (parsers de SMS/USSD, clientes de API) vive en `defpackage` y requiere el
   mapping de R8 (no incluido en el APK) para identificarlo con precisión.
3. `decompiled/sources` usa `--no-res`: los recursos canónicos son los de
   `apktool` (`decompiled/resources`), que conserva IDs y nombres originales.
4. Los `R.java` generados y `$$serializer` son producto del build; no son
   "código muerto" de la app.
