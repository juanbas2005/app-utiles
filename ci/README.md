# ci/ — pipeline de CI en staging

`build.yml` es el pipeline completo (integridad del APK original, build
modular, tests, releases por tags). **Vive aquí — no en
`.github/workflows/`** porque la cuenta de CI con la que se gestionó este
repositorio (`arena-ai-coding-agent[bot]`, GitHub App) no tiene el permiso
`workflows`, y GitHub rechaza pushes que creen o actualicen ficheros bajo
`.github/workflows/`.

## Activación (una vez, ~30 segundos)

Cualquier cuenta con derecho a empujar al repo (usuario propietario o app
con permiso `workflows`):

```bash
git checkout main   # o la rama de trabajo
mkdir -p .github/workflows
cp ci/build.yml .github/workflows/build.yml
git add .github/workflows/build.yml
git commit -m "Activar CI: mover build.yml a .github/workflows"
git push
```

Tras ello:
1. La workflow `build` corre en push/PR a `main`, tags `v*` y
   `workflow_dispatch`.
2. Para publicar las 4 APK en GitHub Release:
   `git tag v1.6.3-security.1 && git push origin v1.6.3-security.1`
   (el job `release` genera la Release con los APK y sus SHA-256).

## Alternativas
- **Desde la web** (sin CLI): en la página del repo, navegar a
  `.github/workflows/` (creando la carpeta), *Create new file* →
  `build.yml`, pegar el contenido de `ci/build.yml`.
- **Habilitar el permiso**: en la configuración de la app
  `arena-ai-coding-agent[bot]` para este repo, activar *Workflows*; tras
  ello basta un push que incluya el fichero (la rama local `ci-wip`
  contiene ya ese commit listo para empujar).
- **En local**: ejecutar los pasos de cada job de `ci/build.yml` en una
  máquina con Android SDK (ver `BUILD.md` §1 y §8).
