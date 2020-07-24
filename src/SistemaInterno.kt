class SistemaInterno {

    fun entra (funcionarioAdmin: Autenticavel, senha: Int){
        if(funcionarioAdmin.autenticacao(senha)){
            println("Seja bem vindo ao Bytebank")
        } else {
            println("Falha na autenticação!")
        }
    }
}