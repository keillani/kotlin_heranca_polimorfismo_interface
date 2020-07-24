public fun testaContasDiferentes() {
    val contaCorrente = ContaCorrente(
        titular = "Alex",
        numero = 1111
    )
    val contaPoupanca = ContaPoupanca(
        titular = "Maria",
        numero = 2222
    )

    val contaSalario = ContaSalario(
        titular = "Gui",
        numero = 3333
    )

    contaCorrente.deposita(1000.0)
    contaPoupanca.deposita(1000.0)
    contaSalario.deposita(1000.0)

    println("saldo corrente: ${contaCorrente.saldo}")
    println("saldo poupanca: ${contaPoupanca.saldo}")
    println("saldo salario: ${contaSalario.saldo}")

    contaCorrente.saca(100.0)
    contaPoupanca.saca(100.0)
    contaSalario.saca(100.0)

    println("saldo corrente após saque: ${contaCorrente.saldo}")
    println("saldo poupança após saque: ${contaPoupanca.saldo}")
    println("saldo salario após saque: ${contaSalario.saldo}")

    contaCorrente.transfere(100.0, contaPoupanca)
    println("saldo corrente após transferencia poupança: ${contaCorrente.saldo}")
    println("saldo poupança após transferir corrente ${contaPoupanca.saldo}")

}
