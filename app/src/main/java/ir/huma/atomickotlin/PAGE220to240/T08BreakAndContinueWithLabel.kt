package ir.huma.atomickotlin

//page 230
fun main() {
    main01()
    main02()
}

fun main01() {
    val strings = mutableListOf<String>()
    var c = 'a' - 1
    outer@ while (c < 'f') {
        c += 1
        var i = 0
        do {
            i++
            if (i == 5) continue@outer
            if ("$c$i" == "f3") break@outer
            strings.add("$c$i")
        } while (i < 10)
    }
    listOf(
        "a1", "a2", "a3", "a4",
        "b1", "b2", "b3", "b4", "c1", "c2"
    )
    println(strings)
}

fun main02() {
    val strings = mutableListOf<String>()
    for (c in 'a'..'g') {
        for (i in 1..5) {
            val value = "$c$i"
            if (value < "c3") {
                strings.add(value)
            }
        }
    }
    println(strings)
}