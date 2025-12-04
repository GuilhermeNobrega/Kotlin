class Carro(val modelo: String, val ano: Int) {

    fun acelerar(): String {
        return "$modelo de $ano esta acelerando!"
    }

    fun frear() {
        println("$modelo de $ano  esta freiando!")
    }
}


fun main(args: Array<String>){
  val meuModelo = Carro("BMW",2004)
  println(meuModelo.acelerar())
  meuModelo.frear()
  
}

VS

import java.util.*;

class Carro {
    private String modelo;
    private int ano;

    // Construtor
    public Carro(String modelo, int ano) {
        this.modelo = modelo; // igual ao Kotlin fazendo automaticamente
        this.ano = ano;
    }

    public String acelerando() {
        return modelo + " está acelerando";
    }
    public void freiando(){
      System.out.println( modelo + "esta freiando");
    }
}

public class Main {
    public static void main(String[] args) {
        
        Carro meuModelo = new Carro("BMW", 2022);
        System.out.println(meuModelo.acelerando());
    }
}
