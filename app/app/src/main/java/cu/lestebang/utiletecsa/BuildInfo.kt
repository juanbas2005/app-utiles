package cu.lestebang.utiletecsa

/**
 * Metadatos de la reconstrucción.
 *
 * El original: versionName 1.6.2 / versionCode 10602 (ver
 * `apk-original/README.md`). Esta reconstrucción usa versionCode 10603 /
 * versionName "1.6.3-security.1" para que los tests y la CI puedan
 * afirmar "la versión instalada es la reconstruida".
 */
object BuildInfo {
    const val VERSION_NAME = "1.6.3-security.1"
    const val VERSION_CODE = 10603

    /** Huella SHA-256 del certificado original (evidencia F-01/F-08). */
    const val ORIGINAL_CERT_SHA256 =
        "187c763aad58634aaf6c65e8043525c159d6afe061c1ec3e51c962b4ca6519b8"
}
