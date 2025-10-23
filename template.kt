fun main(args: Array<String>) {
    var a = 1
    val s1 = "a eh $a"
    a = 2
    val s2 = "${s1.replace("eh", "foi")}, mas agora eh $a"
    println(s2)
    //println(s1)
}
