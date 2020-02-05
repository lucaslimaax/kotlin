open class Animal {
    
    //private , protected, public
    internal var nome = "marley"
    
    fun dormir(){
        println("Dormir")
    }
    
}
class Cao : Animal() {
    fun exibeNome(){
        println( "Método exibe nome: $nome" )
    }
}
fun main(args: Array<String>) {
 
    val cao = Cao()
    cao.exibeNome()
    //println( animal.nome )
    
}