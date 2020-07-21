class Diretor(
    nome: String,
    cpf: String,
    salario: Double,
    val senha: Int,
    val plr: Double
): Funcionario(
    nome = nome,
    salario = salario,
    cpf = cpf
) {
    override fun bonificacao(): Double {
        return salario + plr
    }

    fun autenticacao(senha: Int): Boolean {
        if (this.senha == senha) {
            return true
        }
        return false
    }
}