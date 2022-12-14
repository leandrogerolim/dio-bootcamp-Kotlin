const val POINTS_X_PASS: Int = 15                                               // constante imultavel  com a quandidade de pontos.
val EZPassAccounts: MutableMap<Int, Int> = mutableMapOf(1 to 100, 2 to 100, 3 to 100)   // 1 variavel o primeiro usuario tem 100 pontos o segundo e o 3 também.
val EZPassReport: Map<Int, Int> = EZPassAccounts                                        // 2 variavel somente leitura da variavel de cima.

fun updatePointsCredit(accountId: Int) {
    if (EZPassAccounts.containsKey(accountId)) {                                        // 3 recebe o id da conta
        println("Updating $accountId...")
        EZPassAccounts[accountId] = EZPassAccounts.getValue(accountId) + POINTS_X_PASS  // 4 função para adicionar pontas a ID
    } else {
        println("Error: Trying to update a non-existing account (id: $accountId)")
    }
}

fun accountsReport() {
    println("EZ-Pass report:")
    EZPassReport.forEach {                                                              // 5  k é o usuario e v é os pontos
            k, v -> println("ID $k: credit $v")
    }
}

fun main() {
    accountsReport()                                                                    // 6 imprime o map com todas as conas
    updatePointsCredit(1)                                                               // 7 dá o update nos valores das contas
    updatePointsCredit(1)
    updatePointsCredit(5)                                                               // 8 a 5 não existe é apra dar erro
    accountsReport()                                                                    // 9 gera novamente o relatorio com as ids e a nova pontuação.
}