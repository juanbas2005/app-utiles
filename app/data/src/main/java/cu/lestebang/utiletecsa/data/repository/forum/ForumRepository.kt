package cu.lestebang.utiletecsa.data.repository.forum

import cu.lestebang.utiletecsa.core.network.model.NetworkPost

/**
 * Contrato de la capa de foros. La implementación original es minificada
 * (R8); ver `src/reference` (DTOs completos: feeds, comentarios, votos…).
 */
interface ForumRepository {
    suspend fun categories(): List<ForumCategoryDto>

    suspend fun postFeed(category: String, page: Int): List<NetworkPost>

    suspend fun insertPost(post: ForumPostInsertDto)
}
