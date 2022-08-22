class Cliente(
    var nome: String,
    var idade: Int,
    var sexo: String,
    var nacionalidade: String,
    var cpf: String
        ){
    var email = ""

    constructor(
        nome: String,
        idade: Int,
        sexo: String,
        nacionalidade: String,
        cpf: String,
        email: String
    ): this(nome, idade, sexo, nacionalidade, cpf){
        this.email = email
    }

    fun trocarNome(){
        println("Digite o novo nome: ")
        this.nome = readln()
        println("Parabens, o novo nome é $nome !")
    }

    fun trocarIdade(){
        println("Digite a nova idade do cliente: ")
        var idade = readln().toInt()
    }

    fun trocarSexo(){
        println("Digite o novo sexo do cliente: ")
        var sexo = readln()
    }
}