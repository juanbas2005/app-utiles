package cu.lestebang.utiletecsa.data.repository.spots

import cu.lestebang.utiletecsa.core.network.model.NetworkPost

/**
 * Contrato de la capa de spots (puntos de conexión). La implementación
 * original es minificada (R8); ver `src/reference`.
 */
interface SpotRepository {
    suspend fun spotFeed(province: String?, page: Int): List<NetworkPost>

    suspend fun insertSpot(spot: SpotInsertDto)
}
