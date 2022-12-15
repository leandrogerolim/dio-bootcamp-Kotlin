
fun customPrint(s: String) {
    print(s.uppercase())
}

fun main() {

    val empty = "test".let {               // 1 teste recebe o uppercase
        customPrint(it)                    // 2 função fora do escopo
        it.isEmpty()                       // 3 recebe o let
    }
    println(" is empty: $empty")


    fun printNonNull(str: String?) {
        println("Printing \"$str\":")

        str?.let {                         // 4 recebe string null  executa somente se a string não for nula
            print("\t")
            customPrint(it)
            println()
        }
    }

    fun printIfBothNonNull(strOne: String?, strTwo: String?) {
        strOne?.let { firstString ->       // 5 encadeamento de let  recebe duas string
            strTwo?.let { secondString ->
                customPrint("$firstString : $secondString")
                println()
            }
        }
    }

    printNonNull(null)
    printNonNull("my string")
    printIfBothNonNull("First","Second")

}