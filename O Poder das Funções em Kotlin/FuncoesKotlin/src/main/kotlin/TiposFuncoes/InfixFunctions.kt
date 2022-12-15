fun main() {

    infix fun Int.times(str: String) = str.repeat(this)        // 1 infix function vai ser aplicada ao tipo inteiro a time
    println(8 times "Bye, ")                                    // 2 recebe a string e repete a quantidade de vezes inteiro  no caso 2 vezes bye

    val pair = "Ferrari" to "Katrina"                          // 3 faz um par das duas strings imprime junto como se fosse concatenar...
    println(pair)

    infix fun String.onto(other: String) = Pair(this, other)   // 4 onto recebe uma string e outra string e faz o par
    val myPair = "McLaren" onto "Lucas"
    println(myPair)

    val sophia = InfixFunctions("Sophia")
    val claudia = InfixFunctions("Claudia")
    sophia likes claudia                                       // 5  chama a infix
}

class InfixFunctions(val name: String) {
    val likedPeople = mutableListOf<InfixFunctions>()
    infix fun likes(other: InfixFunctions) { likedPeople.add(other) }  // 6 recebe uma pessoa como parametro e adiciona dentro da lista multavel
}