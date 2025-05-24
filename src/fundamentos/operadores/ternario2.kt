package fundamentos.operadores

fun obtarResultado(nota: Double):  String = if (nota>=7)"Aprovado" else "Reprovado"

fun main(args: Array<String>) {
println(obtarResultado(8.3))
}