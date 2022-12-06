fun main() {
    cases("Hello")
    cases(1)
    cases(0L)
    cases(MyClass())
    cases("hello")



}
class MyClass
fun cases(obj: Any) {
    when (obj) {                                     // 1   semelhante ao switch case
        1 -> println("One")                          // 2 alguma opção de cima tem o número 1
        "Hello" -> println("Greeting")               // 3 tem o "Hello"
        is Long -> println("Long")                   // 4 tem um tipo long
        !is String -> println("Not a string")        // 5 myclass não é uma String
        else -> println("Unknown")                   // 6 "hello" minusculo imprime o unknown.
    }


    fun main() {

        println(whenAssign("Hello"))
        println(whenAssign(3.4))
        println(whenAssign(1))
        println(whenAssign(MyClass()))
    }



    }
    fun whenAssign(obj: Any): Any {
        val result = when (obj) {                   // 1
            1 -> "one"                              // 2
            "Hello" -> 1                            // 3
            is Long -> false                        // 4
            else -> 42                              // 5
        }
        return result
    }


