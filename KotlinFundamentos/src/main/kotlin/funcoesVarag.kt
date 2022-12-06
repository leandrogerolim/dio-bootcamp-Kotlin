
    fun main() {

        fun printAll(vararg messages: String) {           // 1 cria um laço com o for.
            for (m in messages) println(m)  //imprime todas a mensagens no printall.
        }
        printAll("Hello", "Olá", "Salut", "Hola", "你好")                  // 2 um tipo de array

        fun printAllWithPrefix(vararg messages: String, prefix: String) {  // 3 pede para imprimir tudo com o prefixo mesmo tendo a string

            for (m in messages) println(prefix + m) // prefixo concatenado a mensagem no caso "m".
        }
        printAllWithPrefix(
            "Hello", "Olá", "Salut", "Hola", "你好",
            prefix = "Greeting: "                                      // 4
        )

        fun log(vararg entries: String) {
            printAll(*entries) //necessario o asterico para não imprimir o valor do array e sim o conteudo. no print all.                                           // 5
        }

    }
