package lambdas

class Produto(val nome: String, val preco: Double)

val materialEscolar =listOf(
    Produto("Fichario Escolar", 21.90),
    Produto("Lapis de cor",11.90),
    Produto("Borracha bicolor", 0.70),
    Produto("Apontador com deposito", 1.80)
)

fun main(args: Array<String>) {
//    reduce total e a variavel acumuladora e a atual a que soma
    val totalizador= {total: Double,atual: Double-> total + atual}

    val precoTotal= materialEscolar.map { it.preco }.reduce(totalizador)


    println(precoTotal)
    println(precoTotal/materialEscolar.size)

}