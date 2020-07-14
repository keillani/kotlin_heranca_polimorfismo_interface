fun main() {
    println("Bem vindo ao Bytebank")

    val alex = Funcionario(
        nome = "Alex",
        cpf = "111.111.111.11",
        salario = 1000.0
    )

    println("nome: ${alex.nome}")
    println("cpf: ${alex.cpf}")
    println("salario: ${alex.salario}")
    println("bonificacao: ${alex.bonificacao()}")

    val fran = Gerente(
        nome = "Fran",
        cpf = "222.222.222.22",
        salario = 2000.0,
        senha = 1234
    )

    println("nome ${fran.nome}")
    println("cpf ${fran.cpf}")
    println("salario ${fran.salario}")
    println("bonificacao ${fran.bonificacao()}")
//    println("autenticacao ${fran.autenticacao()}")

    if (fran.autenticacao(1234)) {
        println("autenticou com sucesso")
    } else {
        println("falha na autenticacao")
    }

    val gui = Diretor(
        nome = "Gui",
        cpf = "333.333.333-33",
        salario = 4000.0,
        senha = 4000,
        plr = 200.0
    )

    println("nome ${gui.nome}")
    println("cpf ${gui.cpf}")
    println("salario ${gui.salario}")
    println("bonificacao ${gui.bonificacao()}")
    println("plr ${gui.plr}")

    if (gui.autenticacao(1234)) {
        println("autenticou com sucesso")
    } else {
        println("falha na autenticacao")
    }

}