package Exercicio1

class Conta (var numero:Int, var saldo:Float = 0.0F, var titular: Cliente) {

    fun deposito(saldo: Float, quantDinheiro:Float){
        this.saldo += quantDinheiro
        println("DEPOSITO DE " + this.saldo + " EFETUADO")
    }

    fun saque(saldo: Float, quantDinheiro: Float){
        if(quantDinheiro <= this.saldo) {
            this.saldo -= quantDinheiro
            println("SAQUE DE $quantDinheiro EFETUADO")
        } else{
            println("SALDO INSUFICIENTE")
        }
    }
}