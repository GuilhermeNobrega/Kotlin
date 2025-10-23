fun compara(a: Int, b: Int): String {
    return if (a < b) {
        "$b eh maior que $a"
    } else if (a > b) {
        "$b eh menor que $a"
    } else {
        "$a e $b sao iguais"
    }
}

fun main(args: Array<String>) {
    val resultado = compara(5, 54)
    println(resultado)
}
//or..

fun compara(a: Int, b: Int) {
    if (a < b) {
      println("$b eh maior que $a")
    } else if (a > b) {
        println("$b eh menor que $a")
    } else {
        println("$a e $b sao iguais")
    }
}

fun main(args: Array<String>) {
  compara(5, 5)
}

//when


val day = 4

val result = when (day) {
  1 -> "Monday"
  2 -> "Tuesday"
  3 -> "Wednesday"
  4 -> "Thursday"
  5 -> "Friday"
  6 -> "Saturday"
  7 -> "Sunday"
  else -> "Invalid day."
}
println(result)
