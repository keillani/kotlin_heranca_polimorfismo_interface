class Analista(
    nome: String,
    cpf: String,
    salario: Double
): Funcionario(
    nome = nome,
    salario = salario,
    cpf = cpf
) {
    override fun bonificacao(): Double {
        return salario*0.1
    }

}