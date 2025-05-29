package collections

fun main(args: Array<String>) {
    val map = hashMapOf(1 to "Gui",2 to "Rebeca", 3 to "Cibalena")

    for ((key, value) in map) {
        println("$key -> $value")
    }
}