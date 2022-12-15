
data class User(val name: String, val id: Int) {           // 1
    override fun equals(other: Any?) =
        other is User && other.id == this.id               // 2 sobreescreve o id para verificar se é igual
}
fun main() {
    val user = User("Alex", 1)
    println(user)                                          // 3 printt no use alex id 1 data class

    val secondUser = User("Alex", 1)
    val thirdUser = User("Max", 2)

    println("user == secondUser: ${user == secondUser}")   // 4  compara os valores
    println("user == thirdUser: ${user == thirdUser}")

    // hashCode() function
    println(user.hashCode())                               // 5  user e second user tem o mesmo hash code o terceiro sai diferente.
    println(secondUser.hashCode())
    println(thirdUser.hashCode())

    // copy() function
    println(user.copy())                                   // 6  cria um copia com o valor de memoria diferente
    println(user === user.copy())                          // 7 comparação referencial do endereço de memoria vai dar diferente
    println(user.copy("Max"))                              // 8 posso copiar a varial user "alex" e colocar como max na copia
    println(user.copy(id = 3))                             // 9 posso dizer qual elemento eu quero alterar depois da copia.

    println("name = ${user.component1()}")                 // 10 posso imprimir qualquer componente o primeiro é o nome  segundo é o id
    println("id = ${user.component2()}")
}