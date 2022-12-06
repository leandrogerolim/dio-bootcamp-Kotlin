fun main() {

    var neverNull: String = "This can't be null"            // 1 variavel neverNull não deixa alterar para nula..
    // neverNull = null                                      // 2

    var nullable: String? =
        "You can keep a null here"      // 3 aceita a atribuição null com a interrogação pode ser uma String ou nula
    nullable = null                                         // 4

    var inferredNonNull =
        "The compiler assumes non-null"   // 5 inferencia atribuir o valor contra o que foi informado não pode necessario inserir o "?"
    //inferredNonNull = null                                // 6

    fun strLength(str: String?): Int {                      // 7 aguardando um valor não nulo
        return str?.length ?: 0
    }

    println(strLength(neverNull))                           // 8 imprime o tamanho da variavel nerverNull no caso 18 não o conteudo da val.
    println(strLength(nullable))                            // 9


    fun describeString(maybeString: String?): String {              // 1 pode ser uma String pelo "?".
        if (maybeString != null && maybeString.length > 0) {        // 2 se o length for maior que zero e tenha algo se for nulo retorna uma opção se não outra
            return "String of length ${maybeString.length}"
        } else {
            return "Empty or null string"                           // 3
        }
    }


        println(describeString(null))  // verifica se é null imprime a frase empty or null
        println(describeString("")) // está vazia
        println(describeString("dio.me")) // tamanha da string digitada.

}