data class Configuration(val host: String, val port: Int)

fun main() {
    val configuration = Configuration(host = "127.0.0.1", port = 9000)   //sem variavel it tem  o this interno

    with(configuration) {   //acessa direto o configuration.
        println("$host:$port")
    }

    configuration.run {   //run e with funcionam da mesma forma nesse caso.
        println("$host:$port")
    }


    // ao invés de:
    println("${configuration.host}:${configuration.port}")

}