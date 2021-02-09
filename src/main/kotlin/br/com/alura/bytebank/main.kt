package br.com.alura.bytebank

import br.com.alura.bytebank.modelo.Endereco

fun main() {

    val tipoFuncao: () -> Unit
    Endereco().let ({

    })
    // Higher Order Function

    "".let (::testeRecebeString)

    1.let {

    }
    teste (1) {}
}

fun testeRecebeString(valor: String){

}

fun teste(teste: Int, bloco: () -> Unit) : () -> Unit{
    return {}
}
