package ir.huma.atomickotlin

fun main() {
    println(listOf(1, 2, 3).first())
    println(listOf(null, 5).first())
//    println(listOf<String>().first()) // Exception
    println(listOf(2, 4, 6).firstOrNull())
    println(listOf<String>().firstOrNull())

}

fun <T> List<T>.first(): T {
    if (isEmpty())
        throw NoSuchElementException("Empty List")
    return this[0]
}

fun <T> List<T>.firstOrNull(): T? = if (isEmpty()) null else this[0]
