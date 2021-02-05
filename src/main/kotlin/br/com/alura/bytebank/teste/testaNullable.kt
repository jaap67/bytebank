package br.com.alura.bytebank.teste

import br.com.alura.bytebank.modelo.Endereco

fun testaNullable() {
    var enderecoNulo: Endereco? = Endereco(logradouro = "Rua Vergueiro", complemento = "prédio")
//    enderecoNulo?.let {endereco ->
//        println(endereco.logradouro.length)
//    }
    enderecoNulo?.let {
        println(it.logradouro.length)
        val tamanhoComplemento: Int =
            it.complemento?.length ?: throw IllegalStateException("Complemento não pode ser vazio")
        println(tamanhoComplemento)
    }

//    val x = foo(enderecoNulo)
//    println(x)

    teste(5.0)
}

fun foo(endereco: Endereco?): String? {
//    val tamanho = endereco?.complemento ?: return null
    return endereco?.complemento ?: throw IllegalArgumentException("name expected")
}

fun teste(valor: Any) {
    val numero: Int? = valor as? Int
    println(numero)
}