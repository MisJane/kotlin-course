package com.ktcourse.less7


fun main() {

    timeOfTheDay(7)

    for (i in 10 downTo 1 step 2) {
        println(i)
    }

    println("---------********--------")

    for (i in 1..10 step 2) {
        println(i)
    }

    println("---------********--------")

    val range = 1..10
    for (i in range) {
        println(i)
    }
    println("---------********--------")

    //постдекримент - сначала сравнивание с 0, а после -- (уменьшение на 1)
    var postCounter = 5
    while (postCounter-- > 0) {
        println(postCounter)
    }

    println("---------********--------")

    //предекремент - сначала -1 (--), а потом сравнение с 0
    var preCounter = 5
    while (--preCounter > 0) {
        println(preCounter)
    }
    println("---------********--------")

    do {
        println("+")
    } while (false)

    while (false) {
        println("-")
    }

    println("---------********--------")

    for (i in 10 downTo 1) {
        if (i == 2) continue
        if (i == 6) break
        println(i)
    }

    for (i in 20 downTo 2) {
        if (i % 2 == 0) {
            println("Четный")
        } else {
            println("Нечетный")
        }
    }

    for (i in 1..30 step 3) {
        println(i)
    }

    var count = 1
    var sum = 0
    while (count <= 10) {
        sum += count++
    }
    println(sum)

    var counter1 = 100
    while (counter1 > 1)
        println(counter1--.toString().length)

}

fun timeOfTheDay(hourOfDay: Int): String {
    return when (hourOfDay) {
        0, 1, 2, 3, 4, 5 -> "Раннее утро"
        6, 7, 8, 9, 10, 11 -> "Утро"
        12, 13, 14, 15, 16 -> "После полудня"
        17, 18, 19 -> "Вечер"
        20, 21, 22, 23 -> "Поздний вечер"
        else -> "НЕДЕЙСТВИТЕЛЬНЫЙ ЧАС!"
    }
}