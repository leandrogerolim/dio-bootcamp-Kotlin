data class Also(var name: String, var age: Int, var about: String) {
    constructor() : this("", 0, "")
}

fun writeCreationLog(p: Also) {
    println("A new person ${p.name} was created.")
}

fun main() {

    val jake = Also("Jake", 30, "Android developer")   // 1
        .also {                                          // 2
            writeCreationLog(it)                         // 3 it é o person ou o jake
        }

}