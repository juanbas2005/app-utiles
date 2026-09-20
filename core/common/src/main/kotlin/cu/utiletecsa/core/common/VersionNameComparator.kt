package cu.utiletecsa.core.common

/**
 * Comparador de nombres de versión estilo semver laxo ("1.10.0" > "1.9.9").
 * Ignora sufijos (-beta, -rc.1) comparando primero los componentes numéricos.
 */
object VersionNameComparator {

    /** Devuelve > 0 si [a] es mayor, < 0 si es menor, 0 si equivalentes. */
    fun compare(a: String, b: String): Int {
        val pa = components(a)
        val pb = components(b)
        for (i in 0 until maxOf(pa.size, pb.size)) {
            val va = pa.getOrNull(i) ?: 0
            val vb = pb.getOrNull(i) ?: 0
            if (va != vb) return va.compareTo(vb)
        }
        return 0
    }

    fun isNewer(candidate: String, current: String): Boolean =
        compare(candidate, current) > 0

    private fun components(version: String): List<Int> =
        version.substringBefore('-').substringBefore('+')
            .split('.')
            .map { it.filter(Char::isDigit).ifEmpty { "0" }.toInt() }
}
