class ContaPoupanca(
    titular: String,
    numero: Int
): Conta(
    titular = titular,
    numero = numero
) {
    override fun saca(valor: Double) {
        val valorComTaxa = valor * 0.1
        super.saca(valorComTaxa)

    }

    override fun toString(): String {
        return "titular: $titular" + "numero: $numero"
    }
}