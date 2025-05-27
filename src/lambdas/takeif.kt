package lambdas

fun main(args: Array<String>) {
    println("Digite uma mensagem")

    val entrada = readLine()

    val mensagem = entrada.takeIf { it !="" }?:"Sem mensagem"

    //eleiminando os espaços
    val mensagem1 = entrada.takeIf { it?.trim() !="" }?:"Sem mensagem"

    println(mensagem1)

}