fun testaAutenticacao() {
    val gerente = Gerente(
        "Alex",
        "111.111.111-11",
        1000.0,
        1000
    )

    val diretor = Diretor(
        nome = "Fran",
        cpf = "222.222.222-22",
        2000.0,
        2000,
        200.0
    )

    val cliente = Cliente(nome = "Gui", cpf = "333.333.333-33", 1234)

    val sistema = SistemaInterno()
    sistema.entra(gerente, 2000)
    sistema.entra(diretor, 1000)
    sistema.entra(cliente, 1234) // O erro ta aqui ao se retirar o método entra de sistema interno.
}