package br.com.alura.bytebank.teste

import br.com.alura.bytebank.modelo.Cliente
import br.com.alura.bytebank.modelo.ContaCorrente
import br.com.alura.bytebank.modelo.ContaPoupanca

fun testaComportamentosConta() {
    val alex = Cliente(
        nome = "Alex",
        cpf = "111.111.111-11",
        senha = 1234
    )
    val contaAlex = ContaCorrente(titular = alex, numero = 1000)
    contaAlex.deposita(-200.0)

    println("=================")
    println(contaAlex.titular.nome)
    println(contaAlex.numero)
    println(contaAlex.saldo)
    println("=================")
    println()

    val fran = Cliente(nome = "Fran", cpf = "222.222.222-22", senha = 4321)
    val contaFran = ContaPoupanca(numero = 1001, titular = fran)
    contaFran.deposita(300.0)

    println("=================")
    println(contaFran.titular.nome)
    println(contaFran.numero)
    println(contaFran.saldo)
    println("=================")

    println("depositando na conta do Alex")
    contaAlex.deposita(50.0)
    println(contaAlex.saldo)

    println("sacando da conta do Alex")
    contaAlex.saca(250.0)
    println(contaAlex.saldo)

    println("depositando na conta da Fran")
    contaFran.deposita(70.0)
    println(contaFran.saldo)

    println("sacando da conta da Fran")
    contaFran.saca(100.0)
    println(contaFran.saldo)

    println("saque em excesso na conta do Alex")
    contaAlex.saca(100.0)
    println(contaAlex.saldo)

    println("saque em excesso na conta da Fran")
    contaFran.saca(500.0)
    println(contaFran.saldo)

    println("Transferência da conta da Fran para o Alex")
    if (contaFran.transfere(valor = 300.0, destino = contaAlex)) {
        println("Transferência sucedida")
    } else {
        println("Falha na tranferência")
    }
    println("saldo alex ${contaAlex.saldo}")
    println("saldo fran  ${contaFran.saldo}")
}