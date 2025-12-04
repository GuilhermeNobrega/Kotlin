class Carro(val modelo: String) {

    fun acelerar(): String {
        return "$modelo esta acelerando!"
    }

    fun frear() {
        println("$modelo esta freiando!")
    }
}


fun main(args: Array<String>){
  val meuModelo = Carro("BMW")
  println(meuModelo.acelerar())
  meuModelo.frear()
  
}
