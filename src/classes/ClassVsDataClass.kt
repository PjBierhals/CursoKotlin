package classes

class Geladeira(val marca:String, val litros: Int) {}
data class Televisao(val marca:String, val polegadas:Int) {}

fun main(args: Array<String>) {
    val g1 = Geladeira("Geladira",320)
    val g2 = Geladeira("Geladira",320)
    println(g1==g2)//referencia de memoria

    val tv1 = Televisao(marca = "Samsung", polegadas = 32)
    val tv2 = Televisao(marca = "Samsung", polegadas = 32)

    //dataclass
    println(tv1 == tv2)
    println(tv1===tv2)//referencia de memoria
    println(tv1.toString())
    println(tv1.copy(polegadas = 42))


    //destructor apenas em cima de dataclass

    val (marca, pol)=tv1

    println("$marca $$pol")
}