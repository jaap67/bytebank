package br.com.alura.bytebank

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
