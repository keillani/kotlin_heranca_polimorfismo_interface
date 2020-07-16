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
        println("bonificacao analista")
        return super.bonificacao()+salario*0.1
    }

}