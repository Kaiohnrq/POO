class Aviao(
    var modelo: String,
    var capacidade: Int,
    var autonomia: String,
    var tanque: Int,
){
    var empresaAerea = ""

    constructor(
        modelo: String,
        capacidade: Int,
        autonomia: String,
        tanque: Int,
        empresaAerea: String
    ): this(modelo, capacidade, autonomia, tanque){
        this.empresaAerea = empresaAerea
    }

    fun comprarAviao(){
            println("Parabens, voce acaba de adquirir um avião!")
    }

    fun abastecerAviao(){
        println("Digite quanto deseja abastecer")
        var litros = readln().toInt()
        tanque += litros
        println("Voce abasteceu $litros L, voce tem $tanque L no tanque agora!")
    }

    fun venderAviao(){
        println("Voce deseja vender o avião?")
        println("Digite 1 para Sim, e qualquer outro botão para Não!")
        var resp = readln().toInt()
        if(resp == 1){
            println("Parabens, voce vendeu seu avião!")
        } else {
            println("Voce desistiu da venda do avião!")
        }
    }

}