/*
Loops
 while
    for
*/
fun main(args: Array<String>) {
 /*
    var numero = 1
    while( numero < 5 ){
        //códigos a serem executados
        println("Executado: $numero")
        numero++
    }*/
    
    /*
    for( numero in 1..5 ){
        println("Executado: $numero")
    }*/
    
    val postagens = arrayOf(
       "Descoberto novo método de tratamento para Diabetes!", 
       "Novo curso de Android foi lançado!",
       "Bolsa de valores opera em alta de 2%.",
        "Postagem adicionada"
    )
    
    for( (indice, postagem) in postagens.withIndex() ){
        println( "$indice - $postagem" )
    }
    
}