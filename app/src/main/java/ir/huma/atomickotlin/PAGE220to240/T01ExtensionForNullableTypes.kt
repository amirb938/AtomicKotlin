package ir.huma.atomickotlin


// page 217
fun main() {

    val s1: String? = null
    println("s1 $s1")
    println("isNullOrBlank ${s1.isNullOrBlank()}")
    println("isNullOrEmpty ${s1.isNullOrEmpty()}")

    val s2 = ""
    println("s2 $s2")
    println("isNullOrBlank ${s2.isNullOrBlank()}")
    println("isNullOrEmpty ${s2.isNullOrEmpty()}")

    val s3 = " \t\n"
    println("s3 $s3")
    println("isNullOrBlank ${s3.isNullOrBlank()}")
    println("isNullOrEmpty ${s3.isNullOrEmpty()}")

}

