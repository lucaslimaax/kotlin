/*
 Collections ou coleções -> são implementações de estruturas de dados
    - List -> Imutável, tamanho fixo, apenas para leitura
    - ArrayList-> Mutável, sem tamanho fixo, pode adicionar ou remover
*/
fun main(args: Array<String>) {
    
    var listaItens = arrayListOf("SP","RJ","MG")
    listaItens.add("BA")
    //listaItens[0] = "MA"
    //listaItens.remove("SP")
    //listaItens.removeAt(0)
    println(listaItens)
    //println(listaItens.size)
    //println(listaItens.isEmpty())
    
}
