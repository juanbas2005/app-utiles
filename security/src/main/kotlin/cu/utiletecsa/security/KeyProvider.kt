package cu.utiletecsa.security

import javax.crypto.SecretKey

/**
 * Fuente de claves simétricas. En producción lo implementa AndroidKeyStore
 * (la clave nunca abandona el hardware/TEE); en tests unitarios se inyecta una
 * clave en memoria.
 */
interface KeyProvider {
    fun getOrCreateKey(alias: String): SecretKey
}
