package fundamentos.controllers

fun main() {
    val nota : Double = 6.0

    if (nota in 9.0..10.0) {
        println("exepcional")
    }else if (nota in 7.0..8.9) {
        println("parabens")
    }else if (nota in 5.0..6.9) {
        println("te vejo no proximo semestre")
    }else{
        println("Nota invalida")
    }
}