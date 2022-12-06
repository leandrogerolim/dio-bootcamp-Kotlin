    class Customer                                  // 1

    class Contact(val id: Int, var email: String)   // 2 classe com construtor com dois paramentros um imutavel "val" o outro pode ser alterado "var".

    fun main() {

        val customer = Customer()                   // 3 sem comando new já está instanciada.

        val contact = Contact(1, "mary@gmail.com")  // 4 atribuindo valor a variavel

        println(contact.id)                         // 5 imprime os dois elementos
        println(contact.email)
        contact.email = "jane@gmail.com"            // 6 muda o valor da classe contact.email para outro email por ela ser "var"
        println(contact.email)
    }
