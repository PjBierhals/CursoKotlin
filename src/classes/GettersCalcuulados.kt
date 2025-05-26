package classes

class Produto(var nome:String, var preco:Double, var desconto:Double, var ativo: Boolean) {

    val inativo: Boolean get() = !ativo
    val precoDesconto: Double get() = preco * (1- desconto)
}

fun main(args: Array<String>) {
    val p1 = Produto("Ipad", 2349.90, 0.2,true)

    println(p1.precoDesconto)

    val p2 = Produto("Galaxi", 2699.49, 0.5,false)
    println("${p2.nome}\nn\tDe: R$ ${p2.preco}\n\tPor: R$ ${p2.precoDesconto}")


    if (p2.inativo){
        p2.preco = 0.0
        println("DEPOIS DE INATIVO: R$ ${p2.precoDesconto}")
    }
}