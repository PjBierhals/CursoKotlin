package fundamentos.controllers

fun main(args: Array<String>) {
    var opcao: Int = 0

    do {
        var line =readLine()?:"0"
        opcao = readLine()!!.toIntOrNull() ?:0
        println("voce escolheu $opcao")
    }while (opcao != -1)
    println("até a proxima")
}