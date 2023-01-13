// [Template no Kotlin Playground](https://pl.kotl.in/WcteahpyN)

enum class Nivel { FACIL, INTERMEDIARIO, DIFICIL }

data class Usuario(val nomeUsuario: String, val email: String)

data class ConteudoEducacional(var nome: String, val duracao: Int, val nivel: Nivel)

data class Formacao(val nome: String, var conteudos: List<ConteudoEducacional>) {

    val inscritos = mutableListOf<Usuario>()
    
    fun matricular(vararg usuarios: Usuario) {
        inscritos.addAll(usuarios)
        usuarios.forEach { println("${it.nomeUsuario} matriculado com sucesso em $nome") }
    }
}

fun main() {
    //  Criação de usuários
    val tobia = Usuario("Tobia", "tobia@gmail.com")
    val jacare = Usuario("Jacaré", "jacare@dio.com")
    val derp = Usuario("Derp", "derp@meme.com")

    // Criação de conteúdos educacionais
    val java = ConteudoEducacional("Java OO", 180, Nivel.INTERMEDIARIO)
    val kotlin = ConteudoEducacional("Kotlin Completo + API Rest", 240, Nivel.DIFICIL)
    val mysql = ConteudoEducacional("Comandos Básicos MySQL", 60, Nivel.FACIL)

    // Criação Formação
    val backend = Formacao("Formação Backend de sucesso!", listOf(java, kotlin, mysql))

    // Teste do método matricular()
    backend.matricular(tobia, jacare)
    backend.matricular(derp)

    println("Imprimindo inscritos no Formação Backend de sucesso!")
    backend.inscritos.forEach { println(it.nomeUsuario) }

    println(backend)
}
