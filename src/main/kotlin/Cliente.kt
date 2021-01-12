class Cliente(
    val nome: String,
    val cpf: String,
    override val senha: Int
) : Autenticavel

/**
 * Como temos a implementação padrão feita na própria interface, não há necessidade de
 * implementarmos mais o corpo da função aqui na classe Cliente. utilizaremos a de lá.
 * */