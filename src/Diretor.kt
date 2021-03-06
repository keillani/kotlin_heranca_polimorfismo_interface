class Diretor(
    nome: String,
    cpf: String,
    salario: Double,
    senha: Int,
    val plr: Double
): FuncionarioAdmin(
    nome = nome,
    salario = salario,
    cpf = cpf,
    senha = senha
), Autenticavel {
    override fun bonificacao(): Double {
        return salario + plr
    }

}