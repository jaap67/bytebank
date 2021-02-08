package br.com.alura.bytebank

fun main() {

//    testaTipoFuncaoReferencia()
//    testaTipoFuncaoClasse()
    val minhaFuncaoLambda: () -> Unit = {
        println("Executa como lambda")
    }
    println(minhaFuncaoLambda) // sem executar
    println(minhaFuncaoLambda()) // executando a funcão

    val minhaFuncaoAnonima: () -> Unit = fun() {
        println("Executa como anônima")
    }
    println(minhaFuncaoAnonima)
    println(minhaFuncaoAnonima())
}

fun testaTipoFuncaoClasse() {
    val minhaFuncaoClasse: () -> Unit = Teste()
    println(minhaFuncaoClasse())
}

fun testaTipoFuncaoReferencia() {
    val minhaFuncao: () -> Unit = ::teste
    println(minhaFuncao())
}

fun teste() {
    println("executa teste")
}

class Teste : () -> Unit {
    override fun invoke() {
        println("executa invoke do Teste")
    }
}
