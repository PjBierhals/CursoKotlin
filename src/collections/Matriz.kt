package collections



fun main(args: Array<String>) {
 val matriz = Array(3){arrayOfNulls<Int>(3)}


    matriz[0][0]=1
    matriz[0][1]=2
    matriz[0][2]=3
    matriz[1][0]=4
    matriz[1][1]=5
    matriz[1][2]=6
    matriz[2][0]=7
    matriz[2][1]=8
    matriz[2][2]=9

//    for (i in matriz.indices) {
//        for (j in matriz[i].indices) {
//            matriz[i][j] = i + j
//        }
//    }
 //   for (linha in matriz) {
//        println(linha.joinToString())
//    }

    for (i in matriz.indices){
        for (j in matriz.indices){
            println(matriz[i][j])
        }
    }

 for ((linha,linhaArray)in matriz.withIndex()){
     for((coluna,valor    ) in linhaArray.withIndex()){
         println("[$linha][$coluna] -> ${matriz[linha][coluna]} == $valor")
     }

 }

    matriz.forEach {
        it.forEach {
            println(it)
        }
    }
    matriz.forEach { linha ->
        linha.forEach { valor->
            println(valor)
        }
    }
    matriz.forEachIndexed { i, linha ->
        linha.forEachIndexed { j, valor ->
            println("matriz[$i][$j] = $valor")
        }
    }

}