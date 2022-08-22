fun main(){
    val paciente1 = Paciente(
        "Vitor",
        23,
        "M",
        4,
        true,
        "Brasileiro"
    )

    val paciente2 = Paciente(
        "",
        0,
        "",
        0,
    )

    val paciente3 = Paciente(
        "Roberto",
        50,
        "M",
        2,
        false,
        "Brasileiro"
    )

    paciente2.cadastraPaciente()

    println(paciente1.nome)
    println(paciente1.idade)
    println(paciente1.sexo)
    println(paciente1.leito)
    println(paciente1.precisaTransfusao)
    println(paciente1.nacionalidade)
    paciente1.recebeAlta()
    println("**********************************")
    println(paciente2.nome)
    println(paciente2.idade)
    println(paciente2.sexo)
    println(paciente2.leito)
    println(paciente2.nacionalidade)
    println("**********************************")
    println(paciente3.nome)
    println(paciente3.idade)
    println(paciente3.sexo)
    println(paciente3.leito)
    println(paciente3.nacionalidade)
    paciente3.trocaLeito()
    println("***********************************")
}