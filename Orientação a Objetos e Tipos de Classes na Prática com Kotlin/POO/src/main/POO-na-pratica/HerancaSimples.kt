
open class Dog {                // 1
    open fun sayHello() {       // 2
        println("wow wow!")
    }
}
class Mel : Dog() {
    override fun sayHello() {
        println("leandro wow leandro!")
    }

}
class Yorkshire : Dog() {       // 3 yorkshire herda cachorro
    override fun sayHello() {   // 4 sobre escrita função
        println("wif wif!")
    }
}

fun main() {
    val dog: Dog = Yorkshire()
    val dog2: Dog = Mel()
    dog.sayHello()
    dog2.sayHello()
}
