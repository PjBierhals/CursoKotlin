package lambdas

fun main(args: Array<String>) {
    val nomes = arrayOf("Renata","Bernardo","Willian","Andreia", "Caio")
    val ordenados = nomes.sortedBy({it})//lambda expression
    val ordenados2 = nomes.sortedBy{it.reversed()}

    println(ordenados)
    println(ordenados2)



}
