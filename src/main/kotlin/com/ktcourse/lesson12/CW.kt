package com.ktcourse.lesson12

fun main() {
    sayHello()
    greetUser("John")
    sum(3, -5)
    printSum(5, -5)
    multiply(-5, 5)
    finalPrice(250.5)
    findValue(listOf(-15, -5, 0, 5, 15), 5)


}

fun sayHello() {
    println("Hello, world!")
}

fun greetUser(name: String) {
    println("Hello, $name!")
}

fun sum(a: Int, b: Int): Int {
    return a + b
}

fun printSum(a: Int, b: Int) {
    println("Sum of $a and $b is ${a + b}")
}

fun multiply(a: Int, b: Int): Int = a * b


private fun calculateDiscount(price: Double): Double {
    return price * 0.1
}

fun finalPrice(price: Double): Double {
    val discount = calculateDiscount(price)
    return price - discount
}

fun findValue(numbers: List<Int>, target: Int) {
    for (number in numbers) {
        if (number == target) {
            println("Value found: $number")
            return
        }
        println(number)
    }
    println("Value not found")
}

