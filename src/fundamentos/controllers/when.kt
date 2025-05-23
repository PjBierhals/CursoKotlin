package fundamentos.controllers

fun main (args:Array<String>){
    val  nota = 9
    when (nota) {
        10, 9 ->println( "exepcional")
        8, 7 ->println( "parabens")
        6, 5, 4 ->println( "te vejo no proximo semestre")
        in 0..3 ->println( "te vejo no proximo semestre")
        else ->println( "nota infalida")
    }
}