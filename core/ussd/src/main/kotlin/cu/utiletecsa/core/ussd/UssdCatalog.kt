package cu.utiletecsa.core.ussd

import cu.utiletecsa.core.model.UssdCode

/**
 * Catálogo cerrado de códigos USSD de ETECSA (los mismos que usa el APK original,
 * verificados contra sus recursos: *222#, *234#, *99, *2266).
 * La UI solo ofrece códigos de esta lista: no hay entrada libre.
 */
object UssdCatalog {

    val ALL: List<UssdCode> = listOf(
        UssdCode("saldo", "Consulta de saldo", "*222#", UssdCode.Categoria.SALDO),
        UssdCode("bono", "Consulta de bono", "*222*266#", UssdCode.Categoria.SALDO),
        UssdCode("datos", "Consulta de datos", "*234#", UssdCode.Categoria.DATOS),
        UssdCode("cobro", "Cobro revertido (*99)", "*99#", UssdCode.Categoria.OTROS),
        UssdCode("buzon", "Buzón de voz (*2266)", "*2266#", UssdCode.Categoria.OTROS),
    )

    fun byId(id: String): UssdCode? = ALL.firstOrNull { it.id == id }
}
