class MutableStack<E>(vararg items: E) {              // 1 "E" paramentro generico vararg recebe lista

    private val elements = items.toMutableList()

    fun push(element: E) = elements.add(element)        // 2 recebe um elemento "E" e adicionaa lista

    fun peek(): E = elements.last()                     // 3

    fun pop(): E = elements.removeAt(elements.size - 1)

    fun isEmpty() = elements.isEmpty()

    fun size() = elements.size

    override fun toString() = "MutableStack(${elements.joinToString()})"
}


fun main() {
    val stack = MutableStack("A", "B", "C")  // inicia a pilha com esses elementos
    stack.push("D") //depois adiciona um novo elemento.
    println(stack) //imprime o resultado

    println("peek(): ${stack.peek()}") //só pega o ultimo elemento da pilha sem remover
    println(stack)

    for (i in 1..stack.size()) {   //for para remover os elementos da lista até não sobrar nenhum "pop".
        println("pop(): ${stack.pop()}")
        println(stack)
    }
}