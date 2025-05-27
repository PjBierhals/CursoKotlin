package lambdas

data class casa(var endereco: String="", var num:Int=0)

fun main(args: Array<String>) {
    var casa= casa()
    casa.run {
        endereco="RuaABC"
        num=1536
    }

    println(casa)
}