package com.ktcourse.lesson8


fun main() {
    println(makePhraseFunny("Это невозможно выполнить за один день"))
    println(makePhraseFunny("Я не уверен в успехе этого проекта"))
    println(makePhraseFunny("Произошла катастрофа на сервере"))
    println(makePhraseFunny("Этот код работает без проблем"))
    println(makePhraseFunny("Удача"))
    getLogPhrase()
    makeDataPrivate()
    makeEmailTransform()
    getFileName()
    getAcronym("Объектно-ориентированное программирование")

    var counet = 10
    do (
            println(counet))
    while (--counet > 1)
    println(counet)
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


/**
 * Задание 1: Извлечение Даты из Строки Лога.
 * Используй indexOf или split для получения правой части сообщения.
 * Описание: У вас есть строка лога вида "Пользователь вошел в систему -> 2021-12-01 09:48:23".
 * Извлеките отдельно дату и время из этой строки и сразу распечатай их по очереди. */

fun getLogPhrase(logPhrase: String = "Пользователь вошел в систему -> 2021-12-01 09:48:23") {
    val indexOfSymbol = logPhrase.indexOf(">") + 2
    val date = logPhrase.substring(indexOfSymbol, indexOfSymbol + 10)
    val time = logPhrase.substring(indexOfSymbol + 12)

    return (println(
        "\n" + "----* Задание 1 *----"
                + "\n"
                + "Дата: $date"
                + "\n" + "Время: $time"
    ))

}


/**
 * Задание 2: Маскирование Личных Данных
 * Описание: Дана строка с номером кредитной карты "4539 1488 0343 6467".
 * Замаскируйте все цифры, кроме последних четырех, символами "*".
 */

fun makeDataPrivate(cardNum: String = "4539 1488 0343 6467") {
    val cardNumWithoutSpaces = cardNum.replace(" ", "")
    val indexOfCardNum = cardNumWithoutSpaces.takeLast(4)
    val dataPrivate = cardNumWithoutSpaces.length - indexOfCardNum.length
    val dataFinal = "*".repeat(dataPrivate)

    return (println(
        "\n" + "----* Задание 2 *----"
                + "\n"
                + "$dataFinal $indexOfCardNum"
    ))
}


/**
 * Задание 3: Форматирование Адреса Электронной Почты.
 * Используй replace
 * Описание: У вас есть электронный адрес "username@example.com". Преобразуйте его в строку "username [at] example [dot] com".
 */

fun makeEmailTransform(oldEmail: String = "username@example.com") {
    val result = oldEmail.replace("@", " [at] ")
        .replace(".", " [dot] ")
    println(
        "\n ----* Задание 3 *---- \n $result"
    )

}


/**
 * Задание 4: Извлечение Имени Файла из Пути
 * Описание: Дан путь к файлу "C:/Пользователи/Документы/report.txt". Извлеките название файла с расширением.
 */

fun getFileName(fileLink: String = "C:/Пользователи/Документы/report.txt") {
    val result =
        println(
            "\n ----* Задание 4 *----\n"
                    + fileLink.split("/")
                .last()
        )

}


/**
 * Задание 5: Создание Аббревиатуры из Фразы.
 * Используй split с набором символов для разделения. Используй for для перебора слов. Используй var переменную для накопления первых букв.
 * Описание: У вас есть фраза, например "Объектно-ориентированное программирование". Создайте аббревиатуру из начальных букв слов (например, "ООП").
 */

fun getAcronym(phraseForAcronym: String) {
    val words = phraseForAcronym.split(" ", "-", "—")
    //   val acronym = StringBuilder()                               //возможно ли вывести результат без этой переменной?
    var acronym = ""
    for (letter in words) {
        if (letter.isNotEmpty()) {                              //isNotBlank (?)
            acronym += letter[0].uppercase()
        }

    }
    println("\n ----* Задание 5 *---- \n $acronym")
}
