data class Person(var name: String, var age: Int, var about: String) {
    constructor() : this("", 0, "")  //blocos de atribuições.
}

fun main() {

    val jake = Also()                                     // 1
    val stringDescription = jake.apply {                    // 2 atribui um to string
        name = "Jake"                                       // 3
        age = 30
        about = "Android developer"
    }.toString()                                            // 4

    println(stringDescription)
}