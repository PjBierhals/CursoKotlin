package fundamentos.controllers

fun main(args: Array<String>) {
    for (i in 1..10) {
        if (i==5){
            continue
        }
        println("Atual: $i")
    }
    println("Fim")
}