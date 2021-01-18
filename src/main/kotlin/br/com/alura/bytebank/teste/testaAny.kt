package br.com.alura.bytebank.teste

import br.com.alura.bytebank.modelo.Endereco

fun testaAny() {
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