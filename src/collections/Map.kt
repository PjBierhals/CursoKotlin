package collections

fun main(args: Array<String>) {
    var map = hashMapOf< Long,String>()

    map.put(10020030040,"João")
    map.put(10020050060,"Pedro")
    map.put(60020050080,"Maria")

    map.put(60020050080,"Pedro FiLho")

    for (par in map) {
        println(par)
    }
    for (par in map.entries) {
        println(par)
    }

    for (nome in map.values) {
        println(nome)
    }
    for(cpf in map.keys) {
        println(cpf)
    }
    for ((cpf, nome) in map){
        println("$nome : $cpf")
    }


    map.size.print()

    map.get(60020050080)?.print()
    map[60020050080]?.print()
    map.contains(60020050080).print()

    map.remove(60020050080)?.print()
    map.clear().print()
    map.isEmpty().print()
}