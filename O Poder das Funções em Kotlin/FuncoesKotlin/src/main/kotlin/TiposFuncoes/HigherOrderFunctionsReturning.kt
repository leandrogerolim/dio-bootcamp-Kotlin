fun operation(): (Int) -> Int {                                     // 1 retorna uma outra função
    return ::square
}

fun square(x: Int) = x * x                                          // 2 recebe um inteiro e retorna um inteiro  x multiplica x

fun main() {
    val func = operation()                                          // 3  variavel fun  recebe o operation
    println(func(2))                                                // 4 o valor de fun é 2 que faz 2*2 com resultado 4
}