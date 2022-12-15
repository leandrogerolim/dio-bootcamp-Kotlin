class EnumClass {
}enum class State {
    IDLE, RUNNING, FINISHED                           // 1 representa os estados carregando corrigindo...
}

fun main() {
    val state = State.RUNNING                         // 2  define um estado e executa o que é a opção igual o switch
    val message = when (state) {                      // 3
        State.IDLE -> "It's idle"
        State.RUNNING -> "It's running"
        State.FINISHED -> "It's finished"
    }
    println(message)
}