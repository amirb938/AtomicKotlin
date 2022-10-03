package ir.huma.atomickotlin

import kotlin.math.pow

//page 225
fun main() {
    println("abc".indices)
    println(25.pow2)
    println(listOf(10, 20, 30).indices)
    println(emptyList<Int>().indices)
    println(emptyList<Int>().indices == IntRange.EMPTY)
}


val String.indices: IntRange
    get() = 0 until length


val Int.pow2: Int
    get() = this.toDouble().pow(2.0).toInt()

val List<*>.indices: IntRange
    get() = 0 until size

