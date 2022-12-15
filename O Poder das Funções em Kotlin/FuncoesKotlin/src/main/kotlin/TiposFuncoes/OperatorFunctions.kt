fun main() {

    operator fun Int.times(str: String) = str.repeat(this)       // 1 certas funções podem ser atualizadas para operadores // um operador dentro da função
    println(2 *"Bye ")                                          // 2 executa e repete duas vezes

    operator fun String.get(range: IntRange) = substring(range)  // 3 toda vez que acessar no intervalo e chama o operator
    val str = "Always forgive your enemies; nothing annoys them so much."
    println(str[0..18])                                          // 4 do zero até o 18 imprime só metade da frase

}