
    fun printMessage(message: String): Unit {                               // 1 imprime uma mensagem no console
        println(message)
    }

    fun printMessageWithPrefix(message: String, prefix: String = "Info") {  // 2 imprime mensagem com prefixo "info" valor padrão
        println("[$prefix] $message") // utiliza a variavel sem concatenar
    }

    fun sum(x: Int, y: Int): Int {     //recebe int devolve int                                     // 3
        return x + y //retorno é x mais y INT.
    }

    fun multiply(x: Int, y: Int) = x * y   //recebe dois valores int e faz a operação matematica na mesma linha.                                 // 4

    fun main() { //função main vazia.
        printMessage("Hello")                                               // 5  imprime a mensagem simples
        printMessageWithPrefix("Hello", "Log")                              // 6 imprime a mensgem e o prefixo no caso log
        printMessageWithPrefix("Hello")                                     // 7  imprime sem definir o prefixo mas ele imprime o padrão "info".
        printMessageWithPrefix(prefix = "Log", message = "Hello")           // 8 posso inverter a ordem msg e depois o prefixo
        println(sum(1, 2))                                                  // 9 retorna o resultado da operação.
        println(multiply(2, 4))                                     // preciso chamar a função sum(somar) e multiply (multiplicação).
    }