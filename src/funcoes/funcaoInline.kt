package funcoes

inline fun transacao(funcao:()-> Unit){
    println(" Abrindo transação")
    try {
        funcao()
    }finally {
        println("Fechar transacao")
    }
}

fun main(args: Array<String>) {
    transacao {
        println("execultando sql1")
        println("execultando sql2")
        println("execultando sql3")
    }
}