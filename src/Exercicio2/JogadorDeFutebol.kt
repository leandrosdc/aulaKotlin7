package Exercicio2

class JogadorDeFutebol(var nome:String = "Sem Nome", var energia:Int = 50, var alegria:Int = 50, var gols:Int = 0, var experiencia:Int = 50) {

    fun fazerGol(){
        this.energia -= 5
        this.alegria += 10
        this.gols += 1
        println("GOL $gols DO $nome COM ENERGIA $energia ALEGIA $alegria e EXPERIENCIA $experiencia")
    }

    fun correr(){
        this.energia -= 10
        println("CANSEI (ENERGIA $energia)")
    }
}