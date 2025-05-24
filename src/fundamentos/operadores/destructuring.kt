package fundamentos.operadores


data class Carro(val marca: String, val modelo: String)
fun main(args: Array<String>) {
    val (marca, modelo) = Carro("Ford", modelo = "Fusion")
    println(marca)
    println(modelo)

    val(marido, mulher)= listOf("João", "Maria")
    println("$marido e $mulher")

    val(_,_, terceiro) = listOf("kimi","hamilton","Alonso")
    println("$terceiro")
}