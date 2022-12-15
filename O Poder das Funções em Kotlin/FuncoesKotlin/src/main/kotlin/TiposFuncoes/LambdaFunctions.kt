
fun main() {

    // Todos os exemplos criam um objeto de função que executa letras maiúsculas.
    // So it's a function from String to String

    val upperCase1: (String) -> String = { str: String -> str.uppercase() } // 1 string retorna outra string

    val upperCase2: (String) -> String = { str -> str.uppercase() }         // 2 definição externa e dentro ele jásabe que é tring

    val upperCase3 = { str: String -> str.uppercase() }                     // 3 inferencia externa

    // val upperCase4 = { str -> str.uppercase() }                          // 4 não dá para saber o que entra e o que sai  não funciona

    val upperCase5: (String) -> String = { it.uppercase() }                 // 5 usando o it no lugar do parametro variavel de escopo

    val upperCase6: (String) -> String = String::uppercase                  // 6  chama o uppercase direto através do ::

    println(upperCase1("hello"))
    println(upperCase2("hello"))
    println(upperCase3("hello"))
    println(upperCase5("hello"))
    println(upperCase6("hello"))

}