#!/usr/bin/env bash
# =============================================================================
# decompile.sh — Reproduce la descompilación completa del APK original.
#
# Este repositorio solo incluye el código first-party (cu/lestebang/**) por
# tamaño. Este script regenera el árbol COMPLETO (incluyendo dependencias
# third-party) en /tmp, a partir de apk-original/UtilEs.apk.
#
# Requisitos: java 17+, apktool 2.4.1+ y jadx 1.4.7+ en el PATH.
#   - apktool: https://apktool.org  (recursos/manifest/smali)
#   - jadx:    https://github.com/skylot/jadx  (código Java)
#
# Uso: ./tools/decompile.sh [/ruta/a/salida]
# =============================================================================
set -euo pipefail

REPO_ROOT="$(cd "$(dirname "${BASH_SOURCE[0]}")/.." && pwd)"
APK="$REPO_ROOT/apk-original/UtilEs.apk"
OUT="${1:-/tmp/app-utiles-decompiled}"

command -v apktool >/dev/null || { echo "ERROR: apktool no está en el PATH" >&2; exit 1; }
command -v jadx    >/dev/null || { echo "ERROR: jadx no está en el PATH" >&2; exit 1; }

echo "[1/3] Verificando integridad del APK..."
sha256sum -c "$REPO_ROOT/apk-original/CHECKSUMS.sha256"
( cd "$REPO_ROOT/apk-original" && sha256sum -c CHECKSUMS.sha256 ) >/dev/null

echo "[2/3] apktool -> $OUT/apktool (recursos + manifest + smali completo)..."
rm -rf "$OUT/apktool"
apktool d -f -o "$OUT/apktool" "$APK"

echo "[3/3] jadx -> $OUT/jadx (código Java completo)..."
rm -rf "$OUT/jadx"
jadx -j "$(nproc)" --no-res -d "$OUT/jadx" "$APK" || true

cat <<EOF

Listo. Árboles completos en:
  $OUT/apktool/           (AndroidManifest.xml, res/, assets/, smali/, smali_classes2..N)
  $OUT/jadx/sources/      (código Java de TODAS las clases, incluidas third-party)

En el repositorio se versionan solo los subconjuntos first-party:
  decompiled/resources/   <- \$OUT/apktool/{AndroidManifest.xml,res,assets,original,apktool.yml}
  decompiled/sources/cu/  <- \$OUT/jadx/sources/cu/lestebang
  smali/cu/               <- \$OUT/apktool/smali/cu/lestebang
EOF
