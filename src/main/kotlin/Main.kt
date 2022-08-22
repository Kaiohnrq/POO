fun main() {
/*
    1) Crie uma classe cliente e apresente os atributos e métodos referentes
    esta classe, em seguida crie um objeto cliente, defina as instancias deste
    objeto e apresente as informações deste objeto no console.
*/
    println("Digite o nome do cliente: ")
    var nome = readln()

    println("Digite a idade do cliente: ")
    var idade = readln().toInt()

    println("Digite o sexo do cliente: ")
    var sexo = readln()

    println("Digite a nacionalidade: ")
    var nacionalidade = readln()

    println("Digite o cpf: ")
    var cpf = readln()

    var cliente1 = Cliente(
        nome, idade, sexo, nacionalidade, cpf
    )
        println("Dados do cliente 1: ")
        println()
        println(cliente1.nome)
        println(cliente1.idade)
        println(cliente1.cpf)
        println(cliente1.sexo)
        println(cliente1.nacionalidade)

    cliente1.trocarNome()
    println(cliente1.nome)
}