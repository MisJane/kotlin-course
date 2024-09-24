package com.ktcourse.less6

fun main() {
    getMonthByIf(5)
    getMonth(9)
    getMonthElse(3)
    getPeopleAge(1)
    getTransport(3.00)
    getBonuses(550F)
    getFileExtension("txt")
    getFileExt("jpg")
    temperatureConversion(1.00, "F")
    getOutfit(12)
    movieChoice(33)
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
    val bonuses = when (sum) {
        in 0F..1000F -> ((sum / 100) * 2)
        else -> ((sum / 100) * 5)

    }
    println("You have $bonuses bonus points")
}

fun getFileExtension(extension: String) {
    if (extension contentEquals "txt") {
        println("This is a text file")
    } else if (extension contentEquals "doc") {
        println("This is a text file")
    } else if (extension contentEquals "bmp") {
        println("This is an image file")
    } else if (extension contentEquals "jpg") {
        println("This is an image file")
    } else if (extension contentEquals "jpeg") {
        println("This is an image file")
    } else if (extension contentEquals "xls") {
        println("This is a table file")
    } else if (extension contentEquals "xlsx") {
        println("This is a table file")
    } else println("Unknown format")
}

fun getFileExt(ext: String): String {
    return when (ext) {
        "txt", "doc" -> "text"
        "jpeg", "jpg" -> "pic"
        else -> "unk"
    }
}


fun temperatureConversion(temp: Double, format: String) {

    val сelsius = String.format("%.2f", ((temp - 32) / 1.8))
    val fahrenheit = String.format("%.2f", ((temp * 1.8) + 32))
    if (format == buildString { append("F") }) {
        if (temp > -459.67) {
            println("$сelsius C")
        } else {
            println("There is no temperature below this value. At least in our universe.")
        }
    } else if (format == buildString { append("C") }) {
        if (temp > 273.15) {
            println("$fahrenheit F")
        } else {
            println("There is no temperature below this value. At least in our universe.")
        }
    } else {
        println("Unknown format")
    }
}

fun getOutfit(temperature: Int) : String{
    return when (temperature) {
        in -30 until  0 -> "You need to put on a jacket and a hat."
        in 0..15 -> "You need to put on a windbreaker."
        in 15..35 -> "You need to put on a T-shirt and shorts."
        else -> "You should stay at home."
    }
}

fun movieChoice(age: Int) {
    if (age < 10) {
        println("We offer to watch children's films")
    } else if (age in 10..17) {
        println("We offer to watch children's or teen movies")
    } else (println("You can choose to watch any movies"))
}