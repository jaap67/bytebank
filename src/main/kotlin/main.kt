fun main() {
    println("Bem-vindo ao Bytebank")

    var i = 1
    while (i <= 5){
        val titular: String = "Alex $i"
        val numeroConta: Int = 1000 + i
        var saldo: Double = i + 10.0

        println("titular $titular")
        println("numero $numeroConta")
        println("saldo $saldo")
        println()
        i += 1
    }
//    for (i in 5 downTo 1) {
//        if (i == 4) {
//            continue
//        }
//        val titular: String = "Alex $i"
//        val numeroConta: Int = 1000 + i
//        var saldo: Double = i + 10.0
//
//        println("titular $titular")
//        println("numero $numeroConta")
//        println("saldo $saldo")
//        println()
//    }
//    testaCondicoes(saldo)
}

fun testaCondicoes(saldo: Double) {
    if (saldo > 0) {
        println("conta é positiva")
    } else if (saldo == 0.0) {
        println("conta é neutra")
    } else {
        println("conta é negativa")
    }

    when {
        saldo > 0 -> println("conta é positiva")
        saldo == 0.0 -> println("conta é neutra")
        else -> println("conta é negativa")
    }
}