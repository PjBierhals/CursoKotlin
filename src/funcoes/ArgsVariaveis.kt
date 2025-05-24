package funcoes

fun ordenar (vararg numeros:Int): IntArray{
    return numeros.sortedArray()
}

fun ordenarU (vararg numeros:Int, a: Int): IntArray{
println(a)
    return numeros.sortedArrayDescending()
}

fun main(args: Array<String>) {
    for (numeros in ordenar(38, 3, 456, 8, 51, 1, 88, 73)){
        print("$numeros ")
    }

    for (numerosr in ordenarU(38,3,456,8,51,1,88,73,a=199)){
        print("$numerosr ")
    }
}