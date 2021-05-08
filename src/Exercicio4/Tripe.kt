package Exercicio4

class Tripe (var dobrado:Boolean = false, val alturaMinima:Int, val alturaMaxima:Int, var alturaAtual:Int){

    fun novaAltura(altura:Int){
        if(altura <= this.alturaMaxima && altura >= this.alturaMinima) { this.alturaAtual = altura }
    }

    fun dobrar(){ if(!this.dobrado) { this.dobrado = true } }

    fun desdobrar(){ if(this.dobrado) { this.dobrado = false } }

    fun guardar():Boolean{ return alturaAtual == alturaMinima && this.dobrado }

    fun prontoParaGuardar(){
        if(guardar()){ println("Pode Guardar") }
        else{ println("Não pode guardar") }
    }

    fun usar():Boolean{
        return alturaAtual >= (alturaMaxima/2) && !dobrado
    }

    fun prontoParaUsar(){
        if(usar()){ println("Pronto para Usar") }
        else{ println("Não pronto para Usar") }
    }
}