enum class Nivel { INICIANTE, INTERMEDIARIO, AVANCADO }

data class Usuario(val matricula: String)

data class ConteudoEducacional(var nomeConteudo: String, var duracao: Int = 60)

class Formacao(val nome: String, var conteudos: List<ConteudoEducacional>, var nivel: Nivel) {

    private val inscritos = mutableListOf<Usuario>()

    fun matricular(usuario: Usuario) {
        inscritos.add(usuario)
        println("Alunos matriculados: ${usuario.matricula}")
    }

    fun printFormacao() {
        println("Formações disponíveis: ")
        println(nome)
        printConteudos()
        println(nivel)
    }

    private fun printConteudos() {
        for (conteudo in conteudos) {
            println("conteúdo: ${conteudo.nomeConteudo}, duração: ${conteudo.duracao}")
        }
    }
}

fun main() {
    val usuario1 = Usuario("Leandro Gerolim")
    val usuario2 = Usuario("Gerolim Leandro")
    val usuario3 = Usuario("Roberto Bebeto")


    val materiaJava = listOf(
        ConteudoEducacional(nomeConteudo = "Java", duracao = 20),
        ConteudoEducacional(nomeConteudo = "POO com Java", duracao = 10),
        ConteudoEducacional(nomeConteudo = "Java EE", duracao = 30),

        )

    val materiaSpringBoot = listOf(
        ConteudoEducacional(nomeConteudo = "Melhore a produção", duracao = 10),
        ConteudoEducacional(nomeConteudo = "SpringBoot com Java", duracao = 20),
    )

    val materiaLogicaDeProgramacao = listOf(
        ConteudoEducacional(nomeConteudo = "Pensamento computacional", duracao = 20)
    )

    val formacao = Formacao(
        nome = "Java Fundamentos",
        conteudos = materiaJava,
        nivel = Nivel.INTERMEDIARIO
    )

    val formacao2 = Formacao(
        nome = "Spring Boot",
        conteudos = materiaSpringBoot,
        nivel = Nivel.AVANCADO
    )

    val formacao3 = Formacao(
        nome = "Logica de Programação",
        conteudos = materiaLogicaDeProgramacao,
        nivel = Nivel.INICIANTE
    )
    println("\nFormações DIO\n")
    formacao.printFormacao()
    formacao.matricular(usuario1)
    println("")
    formacao2.printFormacao()
    formacao2.matricular(usuario3)
    println("")
    formacao3.printFormacao()
    formacao3.matricular(usuario2)
    println("")

}