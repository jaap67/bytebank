package br.com.alura.bytebank.teste

import br.com.alura.bytebank.modelo.Cliente
import br.com.alura.bytebank.modelo.ContaCorrente
import br.com.alura.bytebank.modelo.ContaPoupanca
import br.com.alura.bytebank.modelo.Endereco

fun testaContasDiferentes() {
    val alex = Cliente(
        nome = "Alex",
        cpf = "111.111.111-11",
        endereco = Endereco(logradouro = "Rua Vergueiro"),
        senha = 1234
    )

    val fran = Cliente(
        nome = "Fran",
        cpf = "222.222.222-22",
        senha = 4321
    )

    val contaCorrente = ContaCorrente(titular = alex, numero = 1000)
    val contaPoupanca = ContaPoupanca(titular = fran, numero = 1001)

    println("titular")
    println("nome do titular ${contaCorrente.titular.nome}")
    println("cpf do titular ${contaCorrente.titular.cpf}")
    println("endereço titular ${contaCorrente.titular.endereco.logradouro}")


    contaCorrente.deposita(1000.0)
    contaPoupanca.deposita(1000.0)

    println("saldo corrente: ${contaCorrente.saldo}")
    println("saldo poupanca: ${contaPoupanca.saldo}")

    contaCorrente.saca(100.0)
    contaPoupanca.saca(100.0)

    println("saldo corrente após saque: ${contaCorrente.saldo}")
    println("saldo poupanca após saque: ${contaPoupanca.saldo}")

    contaCorrente.transfere(100.0, contaPoupanca, 1000)

    println("saldo corrente após transferir para poupança: ${contaCorrente.saldo}")
    println("saldo poupanca após receber transferência: ${contaPoupanca.saldo}")

    contaPoupanca.transfere(100.0, contaCorrente, 1001)

    println("saldo poupança após transferir para corrente: ${contaPoupanca.saldo}")
    println("saldo corrente após receber transferência: ${contaCorrente.saldo}")
}