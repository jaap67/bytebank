package teste

import modelo.ContaCorrente
import modelo.ContaPoupanca

fun testaCopiasEReferencias() {
    // Cópia de dados, não de referências
    val numeroX = 10
    var numeroY = numeroX
    numeroY++

    println("numeroX $numeroX")
    println("numeroY $numeroY")

    val contaJoao = ContaCorrente("João", 1002)
    var contaMaria = ContaPoupanca("Maria", 1003)
    contaMaria.titular = "Maria"
    contaJoao.titular = "João"

    println("titular conta joao: ${contaJoao.titular}")
    println("titular conta maria: ${contaMaria.titular}")
    println(contaJoao)
    println(contaMaria)

}