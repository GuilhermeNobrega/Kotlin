fun main(args: Array<String>) {
  var x  = 10
  val y = 50
  var novoValor = x + 50
  println("$novoValor")
  /*The difference between var and val is that variables declared with the var keyword can be changed/modified, 
  while val variables cannot.*/
}


var name: String = "John" // String
val birthyear: Int = 1975 // Int

println(name)
println(birthyear)

var name: String
name = "John"
println(name)
