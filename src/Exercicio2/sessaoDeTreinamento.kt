package Exercicio2

class sessaoDeTreinamento (){
    fun treinamento(jogadorDeFutebol: JogadorDeFutebol){
        jogadorDeFutebol.experiencia += 20
        println("TREINAMENTO REALIZADO: " + jogadorDeFutebol.experiencia)
    }

    fun treinar(jogadorDeFutebol: JogadorDeFutebol){
        jogadorDeFutebol.correr()
        jogadorDeFutebol.fazerGol()
        jogadorDeFutebol.correr()
        jogadorDeFutebol.experiencia += 1
        println("A EXPERIENCIA PASSADA FOI " + (jogadorDeFutebol.experiencia - 1) + " E A ATUAL É : ${jogadorDeFutebol.experiencia}")
    }
}