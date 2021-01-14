package br.com.alura.bytebank

import br.com.alura.bytebank.modelo.Cliente
import br.com.alura.bytebank.modelo.Endereco

fun main() {

    println()
    println(1)
    println(1.0)
    println(true)
    println("teste")

    val endereco = Endereco()
    println(endereco)
    println(Cliente("ze", "", endereco, 1))

    /**
     * Todas as classes no kotlin herdam de Any.
     */
    imprime()
    imprime(1)
    imprime(1.0)
    imprime(endereco)
}

fun imprime(){

}

fun imprime(valor: Int) {

}

fun imprime(valor: Double) {

}

fun imprime(endereco: Endereco){}