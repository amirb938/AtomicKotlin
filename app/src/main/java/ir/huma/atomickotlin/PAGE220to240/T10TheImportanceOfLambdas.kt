package ir.huma.atomickotlin

//page 232
fun main() {
    val list = listOf(2, 4, 8, 9, 12, 15, 14)
    println(filterEven(list))
    println(list.filter { it % 2 == 0 })
    println(greaterThan(list))
    println(list.filter { it > 5 })

    println(list.filter { i: Int -> i > 10 })
}

fun filterEven(nums: List<Int>): List<Int> {
    val result = mutableListOf<Int>()
    for (i in nums) {
        if (i % 2 == 0) {
            result += i
//            result.add(i)
        }
    }
    return result
}

fun greaterThan(nums: List<Int>): List<Int> {
    val result = mutableListOf<Int>()
    for (i in nums) {
        if (i > 5) {
            result += i
        }
    }
    return result
}