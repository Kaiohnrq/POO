fun main(){
    var funcionario1 = Funcionario(
        "Joao",
        24,
        "Repositor",
        "M",
        2
    )
    println(funcionario1.nome)
    println("Idade ${funcionario1.idade} anos")
    println(funcionario1.funcao)
    println(funcionario1.sexo)
    println("Tempo de contrato ${funcionario1.tempoContrato} anos ")
    println("****************************************************")

    var funcionario2 = Funcionario(
        "",
        0,
        "",
        "",
        0
    )
    funcionario2.adicionaFuncionario()
    println(funcionario2.nome)
    println("Idade ${funcionario2.idade} anos")
    println(funcionario2.funcao)
    println(funcionario2.sexo)
    println("Tempo de contrato ${funcionario2.tempoContrato} anos ")
    println("****************************************************")

    var funcionario3 = Funcionario(
        "Fernanda",
        27,
        "Repositor",
        "F",
        5
    )
    println(funcionario3.nome)
    println("Idade ${funcionario3.idade} anos")
    println(funcionario3.funcao)
    println(funcionario3.sexo)
    println("Tempo de contrato ${funcionario3.tempoContrato} anos ")
    println("****************************************************")
    funcionario3.trocaFuncao()
    funcionario3.funcao
}