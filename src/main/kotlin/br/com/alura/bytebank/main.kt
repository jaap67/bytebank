package br.com.alura.bytebank

import br.com.alura.bytebank.teste.testaNullable

fun main() {

    val minhaFuncao: () -> Unit = ::teste
    println(minhaFuncao())
    val minhaFuncaoClasses: () -> Unit = Teste()
    println(minhaFuncaoClasses())
}

fun teste() {
    println("executa teste")
}

class Teste : () -> Unit {
    override fun invoke() {
        println("executa invoke do Teste")
    }
}