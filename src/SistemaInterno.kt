class SistemaInterno {

    fun entra (funcionarioAdmin: FuncionarioAdmin, senha: Int){
        if(funcionarioAdmin.autenticacao(senha)){
            println("Seja bem vindo ao Bytebank")
        } else {
            println("Falha na autenticação!")
        }
    }
}