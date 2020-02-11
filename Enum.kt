/*Enum (Enumeração) -> é um tipo de dados 
 * que consiste em um conjunto de constantes */
enum class StatusPedido {
    PROCESSANDO, APROVADO, REPROVADO 
}
class Pedido {
    
    var status: StatusPedido = StatusPedido.PROCESSANDO
    
}
fun main(args: Array<String>) {
    
    
    val pedido = Pedido()
    
    //Retorno verificação com a operadora do cartão
    val retorno = true
    
    if( retorno == true ){
        pedido.status = StatusPedido.APROVADO
    }else{
        pedido.status = StatusPedido.REPROVADO
    }
    
    if( pedido.status == StatusPedido.APROVADO ){
        println( "Pedido aprovado" )
    }else if(pedido.status == StatusPedido.REPROVADO){
        println( "Pedido reprovado" )
    }
    
    
    
}