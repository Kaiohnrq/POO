class Funcionario (
    var nome: String,
    var idade: Int,
    var funcao: String,
    var sexo: String
        ) {
    var tempoContrato = 0

    constructor(
        nome: String,
        idade: Int,
        funcao: String,
        sexo: String,
        tempoContrato: Int
    ): this(nome, idade, funcao, sexo){
        this.tempoContrato = tempoContrato
    }

    fun adicionaFuncionario(){
    println("Digite o nome do funcionario para adicionar: ")
    this.nome = readln()
    println("Digite a idade: ")
    this.idade = readln().toInt()
    println("Digite a função: ")
    this.funcao = readln()
    println("Qual o sexo do funcionario: ")
    this.sexo = readln()
    println("Qual o tempo de contrato? ")
    this.tempoContrato = readln().toInt()
    }

    fun trocaFuncao(){
        println("Digite qual a nova função do funcionario $nome: ")
        this.funcao = readln()
        println("O funcionario $nome agora é $funcao")
    }
}