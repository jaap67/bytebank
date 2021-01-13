package br.com.alura.bytebank.teste

import br.com.alura.bytebank.modelo.Cliente
import br.com.alura.bytebank.modelo.ContaCorrente
import br.com.alura.bytebank.modelo.ContaPoupanca

fun testaCopiasEReferencias() {
    // Cópia de dados, não de referências
    val numeroX = 10
    var numeroY = numeroX
    numeroY++

    println("numeroX $numeroX")
    println("numeroY $numeroY")

    val joao = Cliente(nome = "João", cpf = "111.111.111-11",
        senha = 1000)
    val contaJoao = ContaCorrente(titular = joao, numero = 1002)
    val maria = Cliente(nome = "Maria", cpf = "222.222.222-22", senha = 2000)
    var contaMaria = ContaPoupanca(titular = maria, numero = 1003)
    contaMaria.titular.nome = "Maria"
    contaJoao.titular.nome = "João"

    println("titular conta joao: ${contaJoao.titular.nome}")
    println("titular conta maria: ${contaMaria.titular.nome}")
    println(contaJoao)
    println(contaMaria)

}