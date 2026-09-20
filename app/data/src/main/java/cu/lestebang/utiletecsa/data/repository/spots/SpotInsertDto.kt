package cu.lestebang.utiletecsa.data.repository.spots

/**
 * Punto de conexión ETECSA ("spot"). Reconstruido desde `SpotInsertDto.java`
 * decompilado.
 */
data class SpotInsertDto(
    val userId: String,
    val deviceId: String,
    val nick: String,
    val province: String,
    val address: String,
    val latitude: Double,
    val longitude: Double,
    val connectionType: String,
    val quality: String,
    val note: String,
)
