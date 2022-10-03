package ir.huma.atomickotlin

//page 232
fun main() {
    val list = listOf(1, 2, 3, 5, 8)
    val result01 = list.map { n: Int -> "$n" }
    val result02 = list.map { n: Int -> Pair(n, n * n) }
    val result03 = list.map { "value is : $it" }
    val result04 = list.mapIndexed { index, item ->
        "index:$index -> value:$item"
    }
    val result05 = list.indices.map { "[$it]" }
    println(result01)
    println(result02)
    println(result03)
    println(list.joinToString("/") { "$it +" })
    println(list.joinToString(", ") { "$it" })
    println(list.joinToString(separator = "-", transform = { "$it" }))
    println(result04)
    println(result05)

    run { println("Test 05") }
}