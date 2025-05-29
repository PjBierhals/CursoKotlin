package collections

fun main(args: Array<String>) {
    val numeros=arrayListOf(1,2,3,4,5)
    val strings = arrayListOf("carro","moto","barco", "aviao")

    val uniao=numeros+strings

    for (item in uniao) {
        println(item)
    }
}