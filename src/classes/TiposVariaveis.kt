package classes

val diretamenteNoArquivo = "Bom dia!"


fun topLevel(){
    val local ="Fulano"
    println("$diretamenteNoArquivo $local")
}

class Coisa{
    var variavelDeInstancia: String ="Boa Noite"
    companion object{
        @JvmStatic val constanteDeClasse= "Ciclano"
    }

    fun fazer(){
        val local :Int=7
        if (local>3){
            val variaveDeBloco="Beltrano"
            println("$variavelDeInstancia, $constanteDeClasse, $local e $variaveDeBloco")
        }
    }
}

fun main(args: Array<String>) {
    topLevel()
   Coisa().fazer()
    println(Coisa.constanteDeClasse)
}


