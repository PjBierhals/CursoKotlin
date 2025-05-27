package lambdas

interface Operacao{
    fun execultar(a: Int, b: Int): Int
}


class Multiplicacao : Operacao{
    override fun execultar(a: Int, b: Int): Int {
        return a*b
    }
}

class calculadora{
 fun calcular(a: Int, b: Int): Int {
     return a+b
 }
fun calcular(a: Int, b: Int, operacao: Operacao): Int {
    return operacao.execultar(a,b)
}

    fun calcular(a: Int, b: Int, operacao: (Int,Int)->Int): Int {
        return operacao(a,b)
    }
}

fun main(args: Array<String>) {
    val calculadora = calculadora()
    val resultado = calculadora.calcular(2,5)
    val resultado2 = calculadora.calcular(2,5, Multiplicacao() )
    val subtracao = {a: Int, b: Int -> a-b }

    val resultado3= calculadora.calcular(12,4,subtracao )
    println("$resultado,$resultado2, $resultado3")
}