package collections

//set não é indexado
//formar de ordenar de ser feito atraves de criterito


fun Any.print() = println(this)


fun main(args: Array<String>) {
    val conjunto = hashSetOf(3,'a',"texto",true, 3,14)


    //conjunto.get(1) não funciona
    conjunto.add(3).print()//vai se false poque ele não insere um item que ja esta no conjunto
    conjunto.add(10).print()
    conjunto.size.print()
    conjunto.remove("a") //não remove porque a letra é armazenada como char "" é string
    conjunto.remove('a').print()
    conjunto.contains('a').print()
    conjunto.contains("Texto").print()
    conjunto.contains("texto").print()

    val nuns =setOf(1,2,3) //somente leitura

    (conjunto + nuns).print()
    (conjunto - nuns).print()
    conjunto.intersect(nuns).print()//não muda o conjunto
    conjunto.retainAll(nuns) //muda o cunjunto
    conjunto.print()
    conjunto.clear()
    conjunto.isEmpty().print()
}