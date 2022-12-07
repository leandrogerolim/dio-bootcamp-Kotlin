class Animal(val name: String)  //classe animal que recebe o nome

class Zoo(val animals: List<Animal>) { //classe zoo que recebe a lista de animais.

    operator fun iterator(): Iterator<Animal> {             // 1 cria uma lista e insere esse lista no classe.
        return animals.iterator()                           // 2 sem tamanha definido.
    }
}

fun main() {

    val animals = listOf(Animal("zebra"), Animal("papagaio"), Animal("lion"));
    val zoo = Zoo(animals)

    for (animal in zoo) {                                   // 3 percorrer os animais que existem na lista zoo.
        println("Watch out, it's a ${animal.name}")
    }

}