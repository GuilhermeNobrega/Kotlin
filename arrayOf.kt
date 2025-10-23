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
  for(x in 0..10){
  if(x == 5){
    println("Pulei esse valor")
    continue
  }
  println(x)
  }
}
