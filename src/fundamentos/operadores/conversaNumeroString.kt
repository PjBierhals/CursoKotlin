package fundamentos.operadores

fun main(args: Array<String>) {
    val a =2
    println(a.toString()+1)

    println("1.9".toDouble()+3)

    println("teste".toIntOrNull())
    println("teste".toIntOrNull()?:0)
    println("1".toInt())
}