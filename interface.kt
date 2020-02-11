interface Presidente {
    fun ganharEleicao()
}
interface Pai {
    fun temFilho()
}
open class Cidadao {
    fun direitosDeveres(){
        println("Todo cidadao tem direitos e deveres!")
    }
}
class Obama: Cidadao(), Presidente, Pai {
    override fun ganharEleicao(){
        println("Ganhar Eleicao")
    }
    override fun temFilho(){
        println("Tem filho!")
    }
}
class Jamilton: Cidadao(), Pai {
    fun darAulas(){
        println("Dá aulas!")
    }
    override fun temFilho(){
        println("Tem filho!")
    }
}
fun main(args: Array<String>) {
    
    
    val cao = Cao()
    cao.nome = "Aveia"
    println(cao.nome)
    
    
    val obama: Presidente = Obama()
    obama.direitosDeveres()
    obama.ganharEleicao()
    obama.temFilho()
    
    println("-----------")
    
    val jamilton = Jamilton()
    jamilton.direitosDeveres()
    jamilton.darAulas()
    
 
    
}