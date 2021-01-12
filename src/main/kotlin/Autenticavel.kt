interface Autenticavel {

    val senha: Int

    /**
     * Aqui temos uma implementação do método autentica diretamente na interface, pois
     * interfaces no kotlin podem ter uma implementação padrão, o problema nisso é no nosso
     * casso da property senha, pois a mesma não poderá ser privada, sendo assim se tornando uma
     * informação sensível para o nosso sistema. O ideal é remover essa implementação e fazê-la
     * na classe que assina o contrato, pois só assim garantiremos a seguranca do código.
     * Aqui vai ficar para fins didáticos, mas irei remover e voltar ao código anterior.
     */

    fun autentica(senha: Int): Boolean {
        println("Autentica interface")
        if (this.senha == senha) {
            return true
        }
        return false
    }
}