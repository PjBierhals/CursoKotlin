package fundamentos.controllers

fun main() {
    val num1 = 4
    val num2 = 3
    val maiorValor = if (num1 > num2){
        println("proccessando if....")
        num1
    } else{
        println("processando else...")
        num2
    }
    //val maiorValor = if (num1 > num2) num1 else num2
println("o valor é $maiorValor")
}