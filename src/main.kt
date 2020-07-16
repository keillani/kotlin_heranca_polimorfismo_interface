fun main() {
    println("Bem vindo ao Bytebank")

    val contaCorrente=ContaCorrente(
        titular = "Alex",
        numero = 1111
    )
    val contaPoupanca=ContaPoupanca(
        titular = "Maria",
        numero = 2222
    )

    contaCorrente.deposita(1000.0)
    contaPoupanca.deposita(1000.0)

    println("saldo corrente: ${contaCorrente.saldo}")
    println("saldo poupanca: ${contaPoupanca.saldo}")

    contaCorrente.saca(100.0)
    contaPoupanca.saca(100.0)

    println("saldo corrente após saque: ${contaCorrente.saldo}")
    println("saldo poupança após saque: ${contaPoupanca.saldo}")

    contaCorrente.transfere(100.0, contaPoupanca)
    println("saldo corrente após transferencia poupança: ${contaCorrente.saldo}")
    println("saldo poupança após transferir corrente ${contaPoupanca.saldo}")
}

