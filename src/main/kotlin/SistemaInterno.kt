class SistemaInterno {

    fun entra(admin: FuncionarioAdmin, senha: Int){
        if (admin.autentica(senha)) {
            println("Bem-vindo ao Bytebank")
        } else {
            println("Falha na autenticação")
        }
    }

    fun entra(cliente: Cliente, senha: Int){
        //Aqui ta quebrando a nossa regra de negócio, além de ta escrevendo,
        //código duplicado, pois já possuímos um método entra no sistema interno.
    }
}