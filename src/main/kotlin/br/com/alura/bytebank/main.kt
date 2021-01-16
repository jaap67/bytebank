package br.com.alura.bytebank

import br.com.alura.bytebank.modelo.Cliente
import br.com.alura.bytebank.modelo.Endereco
import br.com.alura.bytebank.teste.testaAutenticacaoTiposDiferentes
import br.com.alura.bytebank.teste.testaFuncionarios

fun main() {

    val endereco = Endereco(
        logradouro = "Rua Vergueiro",
        complemento = "Alura",
        cep = "00000-000"
    )
    val enderecoNovo = Endereco(
        logradouro = "Rua Vergueiro",
        complemento = "Alura",
        cep = "00000-000"
    )
    println(endereco.equals(enderecoNovo)) // Equals()

    println(endereco.hashCode())
    println(enderecoNovo.hashCode()) // HashCode()

    println(endereco.toString())
    println(enderecoNovo.toString()) // toString()

    println("${endereco.javaClass}@${Integer.toHexString(endereco.hashCode())}")



}

fun imprime(valor: Any) : Any{
    println(valor)
    return valor
}