package Colecoes



    val systemUsers: MutableList<Int> = mutableListOf(1, 2, 3)        // variável não é multavél a  lista é  mutavél .
    val sudoers: List<Int> = systemUsers                              //  a sgunda variável recebe uma copia somente leitrua de systemUsers somente consulta.

    fun addSystemUser(newUser: Int) {                                 // 3 recebe um novo usuario e adiciona na lista.
        systemUsers.add(newUser)
    }

    fun getSysSudoers(): List<Int> {                                  // 4 retorna a variavel de leitura
        return sudoers
    }

    fun main() {
        addSystemUser(6)                                              // 5 adiciona 4 usuario.
        println("Tot sudoers: ${getSysSudoers().size}")               // 6 imprime o tamanho da lista
        getSysSudoers().forEach {                                     // 7
                i -> println("Some useful info on user $i")


        }
        //getSysSudoers().add(5)
                               // 8
    }
