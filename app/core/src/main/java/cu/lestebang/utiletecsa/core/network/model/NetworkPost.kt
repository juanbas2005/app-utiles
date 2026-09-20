package cu.lestebang.utiletecsa.core.network.model

/**
 * Modelo de post de red (foros y "spots" de conexión ETECSA).
 *
 * Reconstruido desde `NetworkPost.java` decompilado
 * (`decompiled/sources/cu/lestebang/utiletecsa/core/network/model/NetworkPost.java`).
 * El original era `@Serializable` (kotlinx.serialization); ver `core/README.md` §3.
 */
data class NetworkPost(
    val id: Int,
    val title: String,
    val url: String,
    val thumbnailUrl: String,
)
