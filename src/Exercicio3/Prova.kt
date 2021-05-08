package Exercicio3

class Prova (var dificuldade:Int = 20, var energiaNecessaria:Int = 20) {

    fun podeRealizar(atleta: Atleta):Boolean{
        return atleta.nivel >= this.dificuldade && atleta.energia >= this.energiaNecessaria
    }


}