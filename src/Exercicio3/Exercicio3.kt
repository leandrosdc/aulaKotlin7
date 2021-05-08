package Exercicio3

fun main(){
    //prova
    var prova = Prova(20,20)

    //atleta Um
    var atletaUm = Atleta("Jose",20, 20)
    println(prova.podeRealizar(atletaUm))
    println(prova.podeRealizar(atletaUm))
    println(prova.podeRealizar(atletaUm))

    //atleta dois
    var atletaDois = Atleta("Felipe",200, 200)
    println(prova.podeRealizar(atletaDois))
    println(prova.podeRealizar(atletaDois))
    println(prova.podeRealizar(atletaDois))

}