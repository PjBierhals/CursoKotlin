package classes

class Filme2 (
    val nome: String,
    val anoLancamento: Int,
    val genero: String,
)

fun main(args: Array<String>) {
    val filme= Filme2("O poderoso chefao",1972, "drama")
    println("A ${filme.nome} foi lançado ${filme.anoLancamento}")
}