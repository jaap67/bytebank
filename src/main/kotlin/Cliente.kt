class Cliente(
    val nome: String,
    val cpf: String,
    val senha: Int
) {
    /**
     * Criada para testar a necessidade de interfaces em lugar de herança. tendo em vista
     * que a herança não supri todas as regras de negócio de determinado sistema. No caso aqui,
     * a classe cliente precisa se autenticar no sistema, porém cliente não é um tipo funcionário.
     */
}