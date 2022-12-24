fun main() {
    val media = readLine()!!.toDouble();

    when {
        media < 5.0 -> println("REP");
        media in  5.0.. 6.9 -> println("REC");


    else -> {

        println("APR")
    }
}
}