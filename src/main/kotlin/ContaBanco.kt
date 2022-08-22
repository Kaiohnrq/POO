class ContaBanco(
    var titular: String,
    var agencia: Int,
    var conta: Int,
    var saldo: Double,
) {
    var limite = false
    var saldoLimite = 0.0

    constructor(
        titular: String,
        agencia: Int,
        conta: Int,
        saldo: Double,
        limite: Boolean,
        saldoLimite: Double
    ): this(titular, agencia, conta, saldo){
        this.limite = limite
        this.saldoLimite = saldoLimite
    }

    fun consultarSaldo(){
        println("O saldo da conta de ${titular} é R$$saldo ")
    }

    fun saque(valor: Double){
        if(saldo > 0.0 && valor <= saldo){
            saldo -= valor
            println("Saque de $valor na conta de ${titular} realizado com sucesso!")
        } else {
            println("Saque de $valor na conta de ${titular} impossivel de ser realizado!")
        }
    }

    fun depositar(valor: Double){
        if(valor > 0){
            saldo += valor
            println("Deposito no valor de R$$valor na conta de ${titular} realizado com sucesso!")
        } else {
            println("Deposito não realizado!")
        }
    }

    fun cadastrarConta(){
        println("Digite o nome do titular para cadastrar conta: ")
        this.titular = readln()
        println("Digite o numero da agencia: ")
        this.agencia = readln().toInt()
        println("Digite o numero da conta: ")
        this.conta = readln().toInt()
        println("Digite o saldo inicial: ")
        this.saldo = readln().toDouble()
    }
}