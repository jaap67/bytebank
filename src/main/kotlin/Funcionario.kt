open class Funcionario(
    val nome: String,
    val cpf: String,
    val salario: Double
) {
    /**
     * Aqui foi simplificado a conversão de uma função para property, porém vale lembrar,
     * que nesse tipo de property não temos o backing field, pois a mesma foi gerada fora
     * do escopo dos atributos da classe, aqui ela está no corpo da mesma. Olhe as mesmas implementações
     * nas classes Gerente, Diretor.
     * O formato abaixo pode até mesmo ser substituido por: open val bonificacao get() = salario * 0.1
     * */
    open val bonificacao: Double get() {
        println("Bonificação Funcionário")
        return salario * 0.1
    }
}