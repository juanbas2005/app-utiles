# CONTRIBUTING — cómo trabajar en este repositorio

Gracias por contribuir a la auditoría y reconstrucción de UtilEs.

## 1. Ámbito y límite legal

Este repositorio existe para **auditar y reconstruir de forma segura** una
copia legítima y controlada de la app. Queda **prohibido** aportar código que:

- eluda licencias, DRM o el sistema de pago de la app;
- active funciones de pago sin autorización;
- reutilice material de terceros con licencia incompatible sin declarar.

El código original decompilado se trata como **evidencia de auditoría**: no
se modifica, se documenta y se conserva en `decompiled/`, `smali/` y en
`src/reference/java/…` de cada módulo.

## 2. Convenciones

- **Idioma**: toda la documentación, comentarios de arquitectura y
  **mensajes de commit en español**.
- **Commits atómicos**: un commit = una unidad coherente (p. ej. "añadir
  contrato de repositorio X" y no "arreglos varios").
- **Evidencia antes de afirmar**: cualquier afirmación de seguridad en
  `SECURITY.md` debe apuntar a código (ruta + línea en `decompiled/`) o a un
  PoC reproducible (`audit/`).
- **Sin stubs inventados**: si una clase no se puede reconstruir fielmente,
  se documenta como pendiente (como hacen los `:features/*`), no se
  "rellena" con código ficticio.

## 3. Habilitar un módulo `:features/<módulo>`

Los 15 módulos de features están **desactivados** en
`app/settings.gradle.kts` (código decompilado con referencias R8). Para
habilitar uno:

1. Disponer del **source original** (repo `lestebang/utiles-landing` o
   entrega del propietario) o del **mapping de R8** para resolver
   `defpackage/*`.
2. Sustituir `features/<módulo>/src/main/java/…` por el Kotlin compilable
   (conservar el decompilado en `src/reference/java/…`).
3. Añadir `include(":features:<módulo>")` a `app/settings.gradle.kts`.
4. Completar su `build.gradle.kts` con las dependencias reales (`:core`,
   `:data`, `:ui`, SDK de la feature).
5. Añadir tests mínimos y actualizar `ARCHITECTURE.md` §6.
6. Si la feature reintroduce permisos o componentes exportados, repasar la
   tabla de `ARCHITECTURE.md` §8 y no empeorar el estado mitigado.

## 4. Flujo de trabajo

1. Rama desde `main`: `feat/<descripción>` o `fix/<descripción>`.
2. `./gradlew assembleRelease test` en verde.
3. Pull request con: qué cambia, por qué, y evidencia (tests, salida de CI).
4. La CI verifica además la integridad del APK original (no debe cambiar su
   SHA-256: si lo hace, es un hallazgo de seguridad — abrir issue).

## 5. Checklist de seguridad para PRs que tocan `:security` o el manifiesto

- [ ] No se reintroduce `usesCleartextTraffic=true` sin NSC explícita (F-02).
- [ ] No se añade un componente `exported="true"` sin justificación (F-05/F-10).
- [ ] La auto-actualización sigue pasando por `UpdatePolicy`/`SignatureVerifier` (F-08).
- [ ] Los nuevos secretos usan `SecureStorage` (F-06).
- [ ] Si se toca `apk-original/`, se actualizan SHA-256 y la evidencia de firma.

## 6. Reportar hallazgos

1. Añadir una sección F-XX a `SECURITY.md` con: CVSS 3.1 (vector y
   justificación), PoC, impacto, mitigación.
2. Actualizar el checklist de remediation del documento.
3. Si es crítico/alto, añadir el PoC a `audit/` si es reproducible.
