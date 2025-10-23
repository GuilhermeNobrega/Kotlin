fun main(args: Array<String>) {
    var a = 1
    val s1 = "a eh $a"
    a = 2
    val s2 = "${s1.replace("eh", "foi")}, mas agora eh $a"
    println(s2)
    //println(s1)
}

fun main(args: Array<String>) {
    var nome: String = "Mas eu sempre volto!"
    if("Massss" in nome){
      println("Mas presente na String!")
    }
    else if(nome.contains("eu")){
      println("Eu presente!")
    }
}


fun main(args: Array<String>) {
  val x = 5
  val y = 5
  println("$x + $y = ${x+y}")
}
