package fundamentos.operadores

import java.util.Date

fun main(args: Array<String>) {
    println("banana"==="banana")
    println(3!==2)
    println(3<2)
    println(3>2)
    println(3<=2)
    println(3>=2)
    val d1 = Date(0)
    val d2 = Date(0)

//    iguadade referencial
    println("resultado comm'===' ${d1===d2}")
//    iguadade estrutura
    println("resultado comm'==' ${d1==d2}")
    println("resultado comm'==' ${d1.equals(d2)}")
}