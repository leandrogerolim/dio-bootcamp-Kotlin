
fun main() {
    val numeroRomano: String? = readLine()

    val numerosRomanos = mapOf(
        'I' to 1,
        'V' to 5,
        'X' to 10,
        'L' to 50,
        'C' to 100,
        'D' to 500,
        'M' to 1000
    )
    var resultado = 0

    for (i in numeroRomano!!.indices) {
        val atual = numerosRomanos.getValue(numeroRomano[i])

        resultado += if((i > 0) && (atual > numerosRomanos.getValue(numeroRomano[i - 1]))){
            atual - (2 * numerosRomanos.getValue(numeroRomano[i - 1]))

        }else{
            atual
        }

    }
    print(resultado)
}