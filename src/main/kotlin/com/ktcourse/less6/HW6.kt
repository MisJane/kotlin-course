package com.ktcourse.less6


fun main() {
    getMonthByIf(5)
    getMonth(9)
    getMonthElse(3)
    getPeopleAge(1)
    getTransport(3.00)
    getBonuses(550F)
}

fun getMonthByIf(numOfTheMonth: Int) {
    if (numOfTheMonth == 1) {
        println("January")
    } else if (numOfTheMonth == 2) {
        println("February")
    } else if (numOfTheMonth == 3) {
        println("March")
    } else if (numOfTheMonth == 4) {
        println("April")
    } else if (numOfTheMonth == 5) {
        println("May")
    } else if (numOfTheMonth == 6) {
        println("June")
    } else if (numOfTheMonth == 7) {
        println("July")
    } else if (numOfTheMonth == 8) {
        println("August")
    } else if (numOfTheMonth == 9) {
        println("September")
    } else if (numOfTheMonth == 10) {
        println("October")
    } else if (numOfTheMonth == 11) {
        println("November")
    } else if (numOfTheMonth == 12) {
        println("December")
    } else {
        println("Wrong month!")
    }
}

fun getMonth(numOfTheMonth: Int): Any {
    return when (numOfTheMonth) {
        1 -> println("January")
        2 -> println("February")
        3 -> println("March")
        4 -> println("April")
        5 -> println("May")
        6 -> println("June")
        7 -> println("July")
        8 -> println("August")
        9 -> println("September")
        10 -> println("October")
        11 -> println("November")
        12 -> println("December")
        else -> "Wrong month!"

    }
}

fun getMonthElse(numOfTheMonth: Int) {
    val res = when (numOfTheMonth) {
        1 -> "January"
        2 -> "February"
        3 -> "March"
        4 -> "April"
        5 -> "May"
        6 -> "June"
        7 -> "July"
        8 -> "August"
        9 -> "September"
        10 -> "October"
        11 -> "November"
        12 -> "December"
        else -> "Wrong month!"

    }
    println(res)
}

fun getPeopleAge(dogAge: Int): Any {
    return when (dogAge) {
        in 0..2 -> println(10.5 * dogAge)
        else -> println(dogAge * 4)
    }
}

fun getTransport(length: Double): Any {
    return when (length) {
        in 0.00..0.99 -> println("You should walk")
        in 1.00..4.99 -> println("You should ride a bike")
        else -> println("You should go by car")
    }
}

fun getBonuses(sum: Float) {
    val bonuses = when (sum){
        in 0F .. 1000F -> ((sum / 100) * 2)
        else -> ((sum / 100) * 5)

    }
    println("You have $bonuses bonus points")
}