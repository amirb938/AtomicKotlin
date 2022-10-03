package ir.huma.atomickotlin

//page 220
fun main() {
    main1()
    main2()
    main3()

}

fun main3() {
    println("main3")
    val holder = AnyHolder(Dog())
    println((holder.getValue() as Dog).bark())

    val holder2 = GenericHolder(Dog())
    println(holder2.getValue().bark())

    println("check ${holder.getValue() == holder2.getValue()}")
}

fun main2() {
    println("main2")
    val h1 = GenericHolder(Automobile(brand = "BENZ"))
    println(h1.getValue())

    val h2 = GenericHolder(1)
    println(h2.getValue())

    val h3 = GenericHolder("Amir")
    println(h3.getValue())
}

fun main1() {
    println("main1")
    val holder = RigidHolder(Automobile(brand = "BMW"))
    println(holder.getValue().brand)
}

data class Automobile(val brand: String)

class RigidHolder(private val a: Automobile) {
    fun getValue() = a
}


class GenericHolder<T>(
    private val value: T
) {
    fun getValue(): T = value
}

class AnyHolder(
    private val value: Any
) {
    fun getValue(): Any = value
}

class Dog {
    fun bark() = "Ruff!"
}