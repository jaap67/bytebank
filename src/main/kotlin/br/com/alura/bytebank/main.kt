package br.com.alura.bytebank

import br.com.alura.bytebank.modelo.Endereco

fun main() {

    var enderecoNulo: Endereco? = Endereco(logradouro = "Rua Vergueiro")
//    enderecoNulo?.let {endereco ->
//        println(endereco.logradouro.length)
//    }
    enderecoNulo?.let {
        println(it.logradouro.length)
    }
}

