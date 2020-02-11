/*
 Set -> não permite elementos duplicados, é mais rápido que o ArrayList,
    não mantém a ordem dos elementos
    Map -> é uma implementação chave/valor
*/
fun main(args: Array<String>) {
    
    var map = hashMapOf(
        "urso" to "Animal que hiberta",
        "cao" to "Melhor amigo do homem"
    )
    map.put("passaro", "Gosta de voar")
    map.remove("passaro")
    for( item in map.keys ){
    println(item)
    }
    
    //println(map)
    
    /*var itens = hashSetOf("a","b","c", "c")
    var itens = hashSetOf(10,20,30,50,70)
    
    for( item in itens ){
    println(item)
    }
    
    println(itens)*/
    
}
