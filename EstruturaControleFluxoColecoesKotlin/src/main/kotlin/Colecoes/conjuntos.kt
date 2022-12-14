package Colecoes


    val openIssues: MutableSet<String> = mutableSetOf("uniqueDescr1", "uniqueDescr2", "uniqueDescr3") // 1

    fun addIssue(uniqueDesc: String): Boolean {
        return openIssues.add(uniqueDesc)                                                             // 2 não aceita elementos duplicados.
    }

    fun getStatusLog(isAdded: Boolean): String {
        return if (isAdded) "registered correctly." else "marked as duplicate and rejected."          // 3 se for duplicado retorna duplicado se não retorna que adicionou
    }

    fun main() {
        val aNewIssue: String = "uniqueDescr4"    // adiciona a string a variavel maior que o escopo que vai de 1 a 3

        val anIssueAlreadyIn: String = "uniqueDescr5" // aqui era para dar o erro mas eu coloquei um numero maior para não dar erro



        println("Issue $aNewIssue ${getStatusLog(addIssue(aNewIssue))}")                              // 4

        println("Issue $anIssueAlreadyIn ${getStatusLog(addIssue(anIssueAlreadyIn))}")                // 5
    }
