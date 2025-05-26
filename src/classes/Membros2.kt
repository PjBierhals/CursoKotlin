package classes

class Calculadora{
    private var resultado: Int = 0
    fun somar(vararg valores:Int):Calculadora{
        valores.forEach {  resultado+=it }

        return this
    }
    fun multiplica(valor: Int): Calculadora{
        resultado*=valor
        return this
    }

    fun limpar(): Calculadora{
        resultado=0
        return this
    }
    fun print(): Calculadora{
        println(resultado)
        return this
    }
    fun obterResultado(): Int{
        return resultado
    }
}

fun main(args: Array<String>) {
    val calculadora = Calculadora()
    calculadora.somar(1,2,3).multiplica(3).print()
    calculadora.somar(7,10).print().limpar()
    println(calculadora.obterResultado())
}