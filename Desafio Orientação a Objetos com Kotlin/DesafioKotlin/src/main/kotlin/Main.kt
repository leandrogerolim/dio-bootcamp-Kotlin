enum class Nivel { BASICO, INTERMEDIARIO, DIFICIL }

class Usuario

data class ConteudoEducacional(var nome: String, val duracao: Int = 60)

data class Formacao(val nome: String, var conteudos: List<ConteudoEducacional>) {

    var inscritos = mutableListOf<Usuario> (



    )

    fun matricular(usuario: Usuario): String {



        //TODO("Utilize o parâmetro $usuario para simular uma matrícula (usar a lista de $inscritos).")
    }
}

        fun main() {


            val nivel = Nivel.DIFICIL
            val message = when (nivel) {
                Nivel.DIFICIL -> "DIFICIL"
                Nivel.BASICO -> "DIFICIL"

                Nivel.INTERMEDIARIO -> "DIFICIL"
            }
            println(message)
        }








    //TODO("Analise as classes modeladas para este domínio de aplicação e pense em formas de evoluí-las.")
   // TODO("Simule alguns cenários de teste. Para isso, crie alguns objetos usando as classes em questão.")
