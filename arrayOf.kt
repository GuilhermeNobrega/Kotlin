fun main(args: Array<String>) {
  val carros = arrayOf("Volvo", "BMW", "Ford", "Mazda")
  var tamanhoArray = carros.size
  if("Volvo" in carros){
    println("Tem Volvo")
  }
  else{
    println("Nao tem!")
  }
  println("$tamanhoArray")
  //println(carros[0])
  for(cars in carros){
    println("$cars")
  }
}

fun main(args: Array<String>) {
  val frutas = arrayOf("maca", "banana", "kiwi")
  for (i in frutas.indices) {
    println("indice $i eh ${frutas[i]}")
    println(i)
}
}
//ou..

fun main(args: Array<String>) {
  val frutas = arrayOf("maca", "banana", "kiwi")
  for (i in frutas) {
    //println("indice $i eh ${frutas[i]}")
    println("$i")
}
}


fun main(args: Array<String>) {
  for(x in 0..10){
  if(x == 5){
    println("Pulei esse valor")
    continue
  }
  println(x)
  }
}

fun main(args: Array<String>) {
  val items = listOf("maca", "banana", "kiwi")
  var index = 0
  while (index < items.size) {
   println("o item no indice $index eh ${items[index]}")
   index++
   }
}
