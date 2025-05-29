package collections

fun main(args: Array<String>) {
    val aprovados= hashSetOf("João","Maria","Pedro","Ana","Joana")
    println("Sem Ordem.....")

    for (aprovado in aprovados) {
        aprovado.print()
    }

    val aprovadosNaOrdem= linkedSetOf("João","Maria","Pedro","Ana","Joana")
    println("Na Ordem Iserção....")

    for (aprovado in aprovadosNaOrdem) {
        aprovado.print()
    }

    val aprovadosOrdemAlfabetica= sortedSetOf("João","Maria","Pedro","Ana","Joana")
    println("Na Ordem Alfabetica....")
    for (aprovado in aprovadosOrdemAlfabetica) {
        aprovado.print()
    }

    println("Na Ordem Seu criteo....")
    aprovados.sortedBy { it.substring(startIndex = 1).reversed() }.print()
}

