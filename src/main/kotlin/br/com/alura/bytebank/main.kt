package br.com.alura.bytebank

fun main() {

//    val teste = Teste()
//    println(teste)
//    teste()

    val teste = Teste()
    teste(10)
    val testeFuncao: () -> Unit = Teste()
    testeFuncao()
}

//class Teste {
//    operator fun invoke() {
//        println("executa invoke do Teste")
//    }
//}

class Teste : () -> Unit {

    operator fun invoke(valor: Int){
        println(valor)
    }

    override fun invoke() {
        println("executa invoke do Teste")
    }
}
