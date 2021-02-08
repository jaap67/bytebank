package br.com.alura.bytebank

fun main() {

    testaTipoFuncaoReferencia()
    testaTipoFuncaoClasse()
//    val minhaFuncaoLambda: () -> Unit = {
//        println("Executa como lambda")
//    }
//    println(minhaFuncaoLambda) // sem executar
//    println(minhaFuncaoLambda()) // executando a funcão
//
//    val minhaFuncaoAnonima: () -> Unit = fun() {
//        println("Executa como anônima")
//    }
//    println(minhaFuncaoAnonima)
//    println(minhaFuncaoAnonima())
}

fun testaTipoFuncaoClasse() {
    val minhaFuncaoClasse: (Int, Int) -> Int= Soma()
    println(minhaFuncaoClasse(10, 10))
}

fun testaTipoFuncaoReferencia() {
    val minhaFuncao: (Int, Int) -> Int = ::soma
    println(minhaFuncao(5, 10))
}

fun soma(a: Int, b: Int) : Int {
    return a + b
}

class Soma : (Int, Int) -> Int {
    override fun invoke(a: Int, b: Int): Int = a + b
}
