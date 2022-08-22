class Paciente (
    var nome: String,
    var idade: Int,
    var sexo: String,
    var leito: Int
) {
    var precisaTransfusao = false
    var nacionalidade = ""

    constructor(
        nome: String,
        idade: Int,
        sexo: String,
        leito: Int,
        precisaTransfusao: Boolean,
        nacionalidade: String
    ): this(nome, idade, sexo, leito){
        this.precisaTransfusao = precisaTransfusao
        this.nacionalidade = nacionalidade
    }

    fun cadastraPaciente(){
        println("Digite o nome do paciente para adicionar: ")
        this.nome = readln()
        println("Digite a idade: ")
        this.idade = readln().toInt()
        println("Digite o leito: ")
        this.leito = readln().toInt()
        println("Qual o sexo do funcionario: ")
        this.sexo = readln()
        println("Qual a nacionalidade: ")
        this.nacionalidade = readln()
    }

    fun trocaLeito(){
        println("Digite o novo leito para qual o paciente sera enviado: ")
        this.leito = readln().toInt()
        println("O paciente ${this.nome} foi transferido para o leito $leito !")
    }

    fun recebeAlta(){
        println("O paciente ${this.nome} recebeu alta, e esta liberado para ir embora!")
    }


}