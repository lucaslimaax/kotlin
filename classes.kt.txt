/**
 * You can edit, run, and share this code. 
 * play.kotlinlang.org 
 */

class casa{
    var cor: String = ""
    
//     fun abrirJanela(){
//         println("Abrir janela")
        
//     }
    
     fun abrirJanela(qtdJanelas: Int){
        println("Abrir janela total:$qtdJanelas")
                }
        
    fun abirPorta(){
        println("Abrir porta")
        
        //o .this é usado para acessa um metodo dentro da propria classe
//         this.abrirJanela()
    }
    
   
}
fun main() {
   
   val casa = casa()
   casa.cor = "amarelo"
   casa.abrirJanela(2)
//    casa.abrirJanela()
    
//    val casa2 = casa()
//    casa.cor = "vermelho"
    
   println(casa.cor)
//    println(casa2.cor)
   
   
}