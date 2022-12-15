fun calculate(x: Int, y: Int, operation: (Int, Int) -> Int): Int {  // 1  recebe x e y do tipo inteiro e tem uma operação que tem uma declaração de função
    return operation(x, y)                                          // 2 recebe x e y do tipo inteiro e retorna outro inteiro
}

fun sum(x: Int, y: Int) = x + y                                     // 3 passo dois numero e ela soma

fun main() {
    val sumResult = calculate(4, 5, ::sum)                          // 4
    val mulResult = calculate(4, 5) { a, b -> a * b }               // 5 receb o novo paramtro de multiplicação.
    println("sumResult $sumResult, mulResult $mulResult")
}