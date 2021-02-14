package br.com.alura.bytebank.teste

import br.com.alura.bytebank.modelo.Endereco

fun testaScopeFunctions() {
    //    val endereco = Endereco(logradouro = "Rua vergueiro", numero = 3185)
//    val enderecoEmMaiusculo = "${endereco.logradouro}, ${endereco.numero}".toUpperCase()
//    println(enderecoEmMaiusculo)

    val endereco = Endereco()
        .also { println("Criando endereço") }
        .apply {
            logradouro = "Rua vergueiro"
            numero = 3185
        }

    with(endereco) {
        "$logradouro, $numero".toUpperCase()
    }.let { enderecoEmMaiusculo: String ->
        println(enderecoEmMaiusculo)
    }

    listOf(
        Endereco(complemento = "casa"),
        Endereco(),
        Endereco(complemento = "apartamento")
    ).filter(predicate = { endereco -> endereco.complemento.isNotEmpty() })
        .let(block = (::println))
}