package Kuliah.Praktikum

fun main() {
    //Safe calling
    //?.let
    var maybeNumber: Int? = 15
    maybeNumber?.let { println(it) }
    //The ?. chaining
    //student?.teacher?.supervisor?.name = "Seymour Skinner"
}