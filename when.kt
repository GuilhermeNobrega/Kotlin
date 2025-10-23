fun main() {
    val classe = ?  // valor que vamos testar
    val resposta = when (classe) {
        1 -> "Premium"
        2 -> "Superior"
        3 -> "Econômica"
        4, 5 -> when (classe % 2 == 0) {
            true -> "Gold"
            false -> "Iron"
        }
        else -> "Dado inválido."
    }
    println(resposta)
}
