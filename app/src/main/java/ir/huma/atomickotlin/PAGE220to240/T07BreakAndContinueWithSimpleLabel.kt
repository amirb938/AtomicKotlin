package ir.huma.atomickotlin

fun main() {
    val strings = mutableListOf<String>()
    outer@ for (i in 1 until 15 step 1) {
        if (i == 4) continue@outer //It goes to the next number and does not execute the continuation of the codes in the loop
        if (i == 7) break@outer  //It is completely out of the loop
        strings.add("i:$i")
    }
    println(strings)
}