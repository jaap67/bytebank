package br.com.alura.bytebank.teste

import br.com.alura.bytebank.modelo.Autenticavel
import br.com.alura.bytebank.modelo.SistemaInterno

fun testaHOF() {
    soma(1, 5, resultado = { valor: Int ->
        println(valor)
    })
    somaReceiver(1, 5, resultado = {
        println(this)
    })

    val autenticavel = object : Autenticavel {
        val senha = 1234
        override fun autentica(senha: Int) = this.senha == senha
    }

    val sistema = SistemaInterno()
    sistema.entra(autenticavel, 1234, autenticado = {
        println("Realizar pagamento")
    })
    sistema.entraReceiver(autenticavel, 1234, autenticado = {
        pagamento()
    })
}

fun soma(a: Int, b: Int, resultado: (Int) -> Unit) {
    println("antes da soma")
    resultado(a + b)
    println("depois da soma")
}

fun somaReceiver(a: Int, b: Int, resultado: Int.() -> Unit) {
    println("antes da soma receiver")
    val total = a + b
    total.resultado()
    println("depois da soma receiver")
}