fun main() {                                            // é como o this dentro do construtor.  chama a propriedade de maneira direta.

    fun getNullableLength(ns: String?) {
        println("for \"$ns\":")
        ns?.run {                                                  // 1 chama a função direta sem o it.isEmpty()
            println("\tis empty? " + isEmpty())                    // 2
            println("\tlength = $length")
            length                                                 // 3 retorna a propriedade direto
        }
    }
    getNullableLength(null)
    getNullableLength("")
    getNullableLength("some string with Kotlin")

}