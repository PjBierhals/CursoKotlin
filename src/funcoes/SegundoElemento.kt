package funcoes

fun <E> List<E>.secondOrNull(): E? = if (size >= 2) this[1] else null

fun main(args: Array<String>) {
    val list= listOf("João","Maria","Pedro")
    println(list.secondOrNull())
}