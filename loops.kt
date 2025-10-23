fun main(args: Array<String>) {
    var x = 0

    while (x <= 10) {
        println(x)
        x++

        if (x == 5) {
            println("Toma esse block no 5")
            break
        }
    }
}



fun main(args: Array<String>) {
    var x = 0

    while (x <= 10) {
        if (x == 5) {
            println("Toma esse block no 5")
            x++
            continue
        }

        println(x)
        x++
    }
}
