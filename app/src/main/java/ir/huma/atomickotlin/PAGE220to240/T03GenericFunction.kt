package ir.huma.atomickotlin.PAGE220to240

//page 222
fun main() {

    println(identify("Yellow"))
    println(identify(452))
    println(identify(452))
    println(identify(Car()))

}

fun <T> identify(arg: T): T = arg

class Car {
    fun getValue() = "Amir"
}