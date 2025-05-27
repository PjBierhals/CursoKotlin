package lambdas

fun main(args: Array<String>) {
    val alunos = arrayListOf("Pedro", "Tiago", "Jonas")
    alunos.map { it.uppercase() }.apply { println(this) }///função aply chama do array resultante
    val alunos2 = alunos.map { it.uppercase() }


    println(alunos2)
}