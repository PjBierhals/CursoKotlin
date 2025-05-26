package classes

class Filme3 (nome: String, anoLancamento: Int, genero: String){
    val nome: String
    val anoLancamento: Int
    val genero: String

    init {
        this.nome = nome
        this.anoLancamento = anoLancamento
        this.genero = genero

    }
}

fun main(args: Array<String>) {
    val  filme= Filme3("Os incriveis",2000,"animação")
    println("A ${filme.nome} foi lançado ${filme.anoLancamento}")
}