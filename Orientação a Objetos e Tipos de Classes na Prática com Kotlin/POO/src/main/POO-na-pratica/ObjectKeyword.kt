import java.util.Random

class LuckDispatcher {                    //1 um tipo de dado com aplicação unica
    fun getNumber() {                     //2
        var objRandom = Random()
        println(objRandom.nextInt(90))
    }
}

fun main() {
    val d1 = LuckDispatcher()             //3
    val d2 = LuckDispatcher()

    d1.getNumber()                        //4
    d2.getNumber()
}