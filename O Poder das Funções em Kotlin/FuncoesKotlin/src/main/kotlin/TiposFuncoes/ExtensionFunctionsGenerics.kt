
fun <T> T?.nullSafeToString() = this?.toString() ?: "NULL"  // 1 recebe para qualquer tipo que pode ser null

fun main() {
    println(null.nullSafeToString())   //mesmo chamando um variavel null ele vai imprimir outra coisa que eu queira. no caso foi NULL
    println("Kotlin".nullSafeToString()) //
}