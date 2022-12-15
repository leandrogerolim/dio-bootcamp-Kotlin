open class Tiger(val origin: String) {
    fun sayHello() {
        println("A tiger from $origin says: grrhhh!")
    }
}

class SiberianTiger : Tiger("Siberia")                  // 1 open function pode ser sobreescrita  fun normal não
//classe tigre passando a origem da siberia.  ":" dois pontos é a herança
fun main() {
    val tiger: Tiger = SiberianTiger()
    tiger.sayHello()
}