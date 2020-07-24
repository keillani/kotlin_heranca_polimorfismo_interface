class Gerente(
    nome: String,
    cpf: String,
    salario: Double,
    senha: Int
): FuncionarioAdmin(
    nome = nome,
    salario = salario,
    cpf = cpf,
    senha = senha
), Autenticavel {
    override fun bonificacao(): Double {
        return salario
    }
}