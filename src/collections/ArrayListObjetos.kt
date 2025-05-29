package collections

data class Fruta(var nome:String, var preco:Double)


fun main(args: Array<String>) {
    var frutas=arrayListOf(Fruta("BAnana",1.5),Fruta("MOrango",3.2))


    for (fruta in frutas) {
        println("Nome: ${fruta.nome} - Preco: ${fruta.preco}")
    }

    println(frutas.distinctBy { it.preco })
}