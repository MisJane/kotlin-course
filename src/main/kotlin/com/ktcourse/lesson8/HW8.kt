package com.ktcourse.lesson8

fun main() {
    println(makePhraseFunny("Это невозможно выполнить за один день"))
    println(makePhraseFunny("Я не уверен в успехе этого проекта"))
    println(makePhraseFunny("Произошла катастрофа на сервере"))
    println(makePhraseFunny("Этот код работает без проблем"))
    println(makePhraseFunny("Удача"))
    getLogPhrase()
}

fun makePhraseFunny(phrase: String): String {
    var newPhrase = phrase

    // Проверка если фраза содержит слово "невозможно"
    if (phrase.contains("невозможно")) {
        newPhrase = phrase.replace("невозможно", "совершенно точно возможно, просто требует времени", true)
    }

    // Проверка если фраза начинается с "Я не уверен"
    if (phrase.startsWith("Я не уверен")) {
        newPhrase += ", но моя интуиция говорит об обратном"
    }

    // Проверка если фраза содержит слово "катастрофа"
    if (phrase.contains("катастрофа")) {
        newPhrase = phrase.replace("катастрофа", "интересное событие", true)
    }

    // Проверка фраза заканчивается на "без проблем"
    if (phrase.endsWith("без проблем")) {
        newPhrase = phrase.replace("без проблем", "с парой интересных вызовов на пути", true)
    }

    // Проверка если фраза содержит только одно слово
    if (phrase.split(" ").size == 1) {
        newPhrase = "Иногда, $phrase, но не всегда"
    }

    return newPhrase
}

fun getLogPhrase(logPhrase: String = "Пользователь вошел в систему -> 2021-12-01 09:48:23") {
    val indexOfSymbol = logPhrase.indexOf(">")
    val indexOfDateAndTime = logPhrase.substring(indexOfSymbol + 2)
    val dateAndTimeSplit = indexOfDateAndTime.split(" ")
    val date = dateAndTimeSplit[0]
    val time = dateAndTimeSplit[1]

    return (println(
        "\n" + "----* Задание 1 *----"
                + "\n"
                + "Дата: $date"
                + "\n" + "Время: $time"
    ))

}


