package Exercicio1

fun main (){
    //Exercicio1.Cliente Um
    var clienteUm = Cliente("Joao","Pedro")
    var contaUm = Conta(1,12f,clienteUm)
    contaUm.deposito(contaUm.saldo,5f)
    contaUm.saque(contaUm.saldo,15f)

    println("")

    //Exercicio1.Conta Dois
    var clienteDois = Cliente("Pedro","Henrique")
    var contaDois = Conta(2, 20F,clienteDois)
    contaDois.deposito(contaDois.saldo, 15F)
    contaDois.saque(contaDois.saldo,12F)
}