
fun main() {

    val authors = setOf("Shakespeare", "Hemingway", "Twain")  //tipo setOf não aceita elementos duplicados..


    val writers = setOf("Twain", "Shakespeare", "Hemingway")

    println(authors == writers)   // 1 são iguais possuem a mesma estrutura e os mesmos elementos.
    println(authors === writers)  // 2 referencial  não são iguais.

}