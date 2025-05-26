package classes

class Data (var dia: Int, var mes: Int, var ano: Int) {

    fun formatar():String{
        return "$dia/$mes/$ano"
    }
}

fun main(args: Array<String>) {
    var nascimento: Data = Data(dia = 11, mes = 11, ano = 2003)
    println("Data nascimento ${nascimento.formatar()}")
}