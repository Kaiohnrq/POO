fun main(){
/*
    2) Crie uma classe avião e apresente os atributos e métodos referentes
    esta classe, em seguida crie um objeto avião, defina as instancias deste
    objeto e apresente as informações deste objeto no console.
*/
    var aviao1 = Aviao("Airbus a380", 500, "9000km", 500, "Gol")
    println("Informações sobre o avião 1: ")
    println(aviao1.modelo)
    println("Capacidade de ${aviao1.capacidade} pessoas.")
    println(aviao1.autonomia)
    println("Capacidade do tanque de gasolina ${aviao1.tanque}L")
    println()

    var aviao2 = Aviao("Airbus a320", 200, "5000km", 200, "AA")
    println("Informações sobre o avião 2: ")
    println(aviao2.modelo)
    println("Capacidade de ${aviao2.capacidade} pessoas")
    println(aviao2.autonomia)
    println("Capacidade do tanque de gasolina ${aviao2.tanque}L")
    println()

    println("Digite qual aviao deseja comprar?")
    val resp = readln().toInt()

    if(resp == 1){
    aviao1.comprarAviao()
    aviao1.abastecerAviao()
    } else if(resp == 2){
        aviao2.comprarAviao()
        aviao2.abastecerAviao()
    } else {
        println("Opção selecionada invalida!")
    }




}