fun main(){
    val conta1 = ContaBanco(
        "Kaio",
        233,
        2134,
        215.0,
        true,
        240.0
    )

    val conta2 = ContaBanco(
        "Igor",
        233,
        3421,
        250.0,
        true,
        300.0
    )

    val conta3 = ContaBanco(
        "",
        0,
        0,
        0.0,
        false,
        0.0
    )

    conta3.cadastrarConta()

    println("Contas cadastradas em nosso banco de dados: ")
    println("**********************************************")
    println(conta1.titular)
    println(conta1.agencia)
    println(conta1.conta)
    println(conta1.saldo)
    println(conta1.limite)
    println(conta1.saldoLimite)
    println("**********************************************")
    println(conta2.titular)
    println(conta2.agencia)
    println(conta2.conta)
    println(conta2.saldo)
    println(conta2.limite)
    println(conta2.saldoLimite)
    println("**********************************************")
    println(conta3.titular)
    println(conta3.agencia)
    println(conta3.conta)
    println(conta3.saldo)

    conta1.depositar(1500.0)

    conta1.saque(500.0)

    conta1.consultarSaldo()

    conta2.depositar(200.0)

    conta2.consultarSaldo()

    conta3.depositar(100.0)

    conta3.saque(50.0)

    conta3.consultarSaldo()
}