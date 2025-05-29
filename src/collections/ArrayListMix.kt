package collections

fun main(args: Array<String>) {

    val listaMix=arrayListOf("Rafael",true,1,3.14,'p')


    for(n in listaMix){
        if (n is String){//samrt cast
            println(n.uppercase())
        }else{
            println(n)
        }
    }
}