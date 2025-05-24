package funcoes

inline fun<T> execultarComLog(nomeFuncao:String, funcao:()-> T):T{
    println("Entrandono metodo $nomeFuncao..")
    try {
        return funcao()
    }finally {
        println("metodo $nomeFuncao finalizado")
    }
}


fun somarr(a: Int, b: Int): Int{ return a + b }

fun main(args: Array<String>) {
   val resultado = execultarComLog("somar"){
       somarr(4,5)
   }
    print(resultado)
}