package Kuliah.Praktikum

fun main() {

    var maybeNumber: Int? = 15
    println(maybeNumber!! * 2)
    maybeNumber = null
    println(maybeNumber!! * 2)

}

private operator fun Nothing.times(i: Int): Any? {
    return TODO("Provide the return value")
}
