package Exercicio2

fun main() {
//Sessao de Treinamento
    var sessao = sessaoDeTreinamento()

    //jogadorUM
    var jogadorUm = JogadorDeFutebol("Cassio",50,50,0,50)

    jogadorUm.fazerGol()
    jogadorUm.correr()
    sessao.treinamento(jogadorUm)
    sessao.treinar(jogadorUm)

    //jogadorDois
    var jogadorDois = JogadorDeFutebol("Rogerio Ceni",50,50,0,50)
    jogadorDois.fazerGol()
    jogadorDois.correr()
    sessao.treinamento(jogadorDois)
    sessao.treinar(jogadorDois)
}