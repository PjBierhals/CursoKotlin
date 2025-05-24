package funcoes


fun <E> filtra(lista: List<E>, filtro:(E)-> Boolean): List<E>{
    val listaFiltrada = ArrayList<E>()
    for (e in lista){
        if (filtro(e)) listaFiltrada.add(e)
    }
    return listaFiltrada
}

fun conTresLetras(nome:String):Boolean{
    return nome.length ==3
}
fun main(args: Array<String>) {
    val nomes = listOf("Ana","Pedro","Bia","Gui","Rebeca")


    println(filtra(nomes,::conTresLetras))}