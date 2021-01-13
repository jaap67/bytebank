import modelo.Cliente
import novo_modelo.Cliente as NovoCliente
import teste.testaComportamentosConta
import java.lang.String as StringJava
fun main() {
    println("Bem-vindo ao Bytebank")

    val palavra: kotlin.String = ""
    val palavraJava: StringJava = StringJava("")

    val cliente = Cliente("Alex", "", 1)
    val clienteNovo = NovoCliente()
}

/**
 *
 * Aqui vemos os importes com aliáses, ou seja, apelidos para nomes de classes/arquivos iguais
 * e que entrem em conflito na hora de chamá-los. O kotlin pede sempre para que use os pacotes do kotlin,
 * porém é possível utilizar os do java, como no nosso exemplo utilizando o java.lang.String
 * */