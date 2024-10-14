package com.ktcourse.lesson12

fun main() {
    println(multiplyByTwo(8))
    println(isEven(8))
    printNumbersUntil(8)
    println(findFirstNegative(listOf(8, 2, 0, -8)))
    processList(listOf("Kotlin", "Java", null, "8"))
    drawRectangle(10, 5)

}


fun multiplyByTwo(number: Int): Int {
    val calculatedNumber = number * 2
    return (calculatedNumber)
}


fun isEven(number: Int): Boolean {
    if (number % 2 == 0) {
        return true
    } else return false
}


fun printNumbersUntil(n: Int) {
    for (i in 1..n) {
        println(i)
    }

    if (n < 0) {
        return
    }
}

fun findFirstNegative(numbers: List<Int>): Int? {
    for (number in numbers) {
        if (number < 0) {
            return number
        }
    }
    return null
}


fun processList(strings: List<String?>) {
    for (string in strings) {
        if (string == null) {
            return
        }
        println(string)
    }
}


fun drawRectangle(width: Int, height: Int) {
    checkSize(width, height)

    drawHorizontalLine(width)
    drawMiddleLines(width, height)
    drawHorizontalLine(width)
}


private fun checkSize(width: Int, height: Int) {
    if (width <= 0) throw IllegalArgumentException("width должно быть положительным и больше нуля")
    if (height <= 0) throw IllegalArgumentException("height должно быть положительным и больше нуля")
}

// Нижняя и верхняя границы
private fun drawHorizontalLine(width: Int) {
    val line = "+" + "-".repeat(width - 2) + "+\n"
    print(line)
}

// Боковые границы
private fun drawMiddleLines(width: Int, height: Int) {
    for (i in 1 until height - 1) {
        val middleLine = "|" + " ".repeat(width - 2) + "|\n"
        print(middleLine)
    }
}