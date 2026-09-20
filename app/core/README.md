# Módulo `:core` — modelos de dominio

## Responsabilidad
Modelos puros (sin dependencias de framework) del dominio de UtilEs:
datos de red (posts de foros/spots) y preferencias de usuario. Es el módulo
más bajo del grafo: no depende de ningún otro módulo del proyecto.

```
:ui ─┐
:data─┼─▶ :core ◀── (nada)
:app ─┘        :security
```

## Contenido
- `src/main/java/…/core/network/model/NetworkPost.kt` — modelo de post
  (id, título, url, miniatura), reconstruido desde
  `decompiled/sources/cu/lestebang/utiletecsa/core/network/model/NetworkPost.java`.
- `src/main/java/…/core/preferences/model/UserDataPreferences.kt` —
  preferencias de usuario (reconstrucción fiel de los 59 campos decompilados).
  ⚠️ Incluye `transferPin`, `nautaCookies` y `licenseTransferId`: en el
  original residen en DataStore **sin cifrar** (SECURITY.md §F-06). En la
  reconstrucción la persistencia de estos campos DEBE ir por
  `cu.lestebang.utiletecsa.security.SecureStorage` (módulo `:security`).
- `src/main/java/…/core/preferences/model/DarkThemeConfigPreferences.kt` —
  enum del tema (FOLLOW_SYSTEM | LIGHT | DARK | AMOLED).
- `src/main/java/…/core/preferences/model/PreferencesUserProfile.kt` —
  perfil mínimo (id, foto, usuario).
- `src/reference/java/…` — **código decompilado original** (Java, jadx)
  conservado como evidencia; NO participa en la compilación.

## 3. Decisiones
| Decision | Motivo |
|---|---|
| `@Serializable` retirado de las data classes | El build no incorpora el plugin `kotlinx-serialization` hasta que se recupere el source original; la forma de los datos no cambia. |
| Los DAO de Room (`JetpackDatabase` + `xk3`, `fr4`, …) no se incluyen | Los DAO son clases minificadas por R8 (ver `src/reference`); se reconstruirán con el source original. |

## Tests
`src/test/java/…/ModelsTest.kt` — invarianzas básicas de los modelos
(defectos, inmutabilidad, serialización estable del enum).
