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
    /**
     * Aqui o autenticável foi adicionado para que no sistema interno possa se utilizar o polimorfismo,
     * também não foi preciso implementar o método autentica aqui, pois na herança isso já foi implementado
     * lá na classe mãe FuncionarioAdmin
     */
    override val bonificacao: Double
        get() {
            return salario
        }
}
