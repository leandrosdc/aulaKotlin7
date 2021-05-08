package Exercicio5

fun main(){
    var veiculoUm = Veiculo("Ford","Ka",2006, "Azul", 334)
    var clienteUm = Cliente("Leandro","Sena", "(11)93010-6560")
    var concessionariaUm = Concessionaria()
    concessionariaUm.registrarVenda(veiculoUm,clienteUm,7000F)
}