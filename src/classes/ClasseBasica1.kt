package classes

class Cliente {
    var nome: String=""

}


fun main(args: Array<String>) {
    val cliente = Cliente()
    cliente.nome="João"
    println("Nome do cliente é ${cliente.nome}")
}