# Módulo `:ui` — shell de UI

## Responsabilidad
Constantes visuales y de navegación compartidas por todas las features:
paleta de color, secciones del home y acciones USSD.

```
:app ─▶ :ui ─▶ :core
```

## Contenido
- `theme/Theme.kt` — paleta **placeholder** (la original es Compose y está
  minificada por R8; ver el ⚠️ en la KDoc) + claves de secciones del home +
  acciones del atajo USSD (relacionadas con §F-05).
- `src/reference/java/…` — `App.java`, `MainActivity.java` y `R.java`
  decompilados (evidencia de la estructura original; no compilan).

## Pendientes
- [ ] Recuperar la paleta Compose real desde el source original.
- [ ] Migrar las screens de las `:features/*` a Compose compilable cuando se
      disponga del source (las features actuales son referencia).

## Tests
`src/test/java/…/ThemeTest.kt` — estabilidad de las claves de secciones y
acciones USSD.
