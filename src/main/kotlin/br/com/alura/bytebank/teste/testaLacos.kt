package br.com.alura.bytebank.teste

fun testaLacos() {
    var i = 1
    while (i <= 5) {
        val titular: String = "Alex $i"
        val numeroConta: Int = 1000 + i
        var saldo: Double = i + 10.0

        println("titular $titular")
        println("numero $numeroConta")
        println("saldo $saldo")
        println()
        i += 1
    }

    loop@ for (i in 1..100) {
        println("i $i")
        for (j in 1..100) {
            println("j $j")
            if (j == 5) break@loop
        }
    }
    for (i in 5 downTo 1) {
        if (i == 4) {
            continue
        }
        val titular: String = "Alex $i"
        val numeroConta: Int = 1000 + i
        var saldo: Double = i + 10.0

        println("titular $titular")
        println("numero $numeroConta")
        println("saldo $saldo")
        println()
    }
}