fun main() {
    println("Bem-vindo ao Bytebank")
    val titular: String = "Alex"
    val numeroConta: Int = 1000
    var saldo: Double = 0.0
    saldo = 100 + 2.0
    saldo += 200
    saldo -= 1000

    println("titular $titular")
    println("numero $numeroConta")
    println("saldo $saldo")

//    if (saldo > 0) {
//        println("conta é positiva")
//    } else if (saldo == 0.0) {
//        println("conta é neutra")
//    } else {
//        println("conta é negativa")
//    }

    when {
        saldo > 0 -> println("conta é positiva")
        saldo == 0.0 -> println("conta é neutra")
        else -> println("conta é negativa")
    }

    // Duas expressões que são equivalentes, if e when
}