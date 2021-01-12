class Gerente(
    nome: String,
    cpf: String,
    salario: Double,
    senha: Int
) : FuncionarioAdmin(
    nome = nome,
    cpf = cpf,
    salario = salario,
    senha = senha
), Autenticavel {

    override val bonificacao: Double
        get() {
            return salario
        }
    /**
     * Como herdamos de uma classe que contém uma implementação do método autentica, e também
     * implementamos uma interface que tem uma implementação padrão do mesmo método, temos que optar
     * em um dos dois para que a classe Gerente possa definir com qual método ela se utilizará no
     * decorrer de sua vida. Nesse exemplo aqui utilizamos da interface, no caso Autenticavel.
     */
    override fun autentica(senha: Int): Boolean {
        return super<Autenticavel>.autentica(senha)
    }
}
