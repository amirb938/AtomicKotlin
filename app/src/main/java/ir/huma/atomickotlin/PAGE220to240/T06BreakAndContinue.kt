package ir.huma.atomickotlin

//page 228
fun main() {
    val num = mutableListOf(0)
    for (i in 1 until 15 step 1) {
        if (i == 4) continue //It goes to the next number and does not execute the continuation of the codes in the loop
        if (i == 7) break  //It is completely out of the loop
        num.add(i)
    }
    println(num)
}