package com.ktcourse.lesson11

fun main() {

    /**
     * Задание 1: Создание Пустого Словаря.
     * Создайте пустой неизменяемый словарь, где ключи и значения - целые числа.
     */
    val emptyMap: Map<Int, Int> = mapOf()

    /**
     * Задание 2: Создание и Инициализация Словаря.
     * Создайте словарь, инициализированный несколькими парами "ключ-значение", где ключи - float, а значения - double.
     */
    val pair: Map<Float, Double> = mapOf<Float, Double>()

    /**
     * Задание 3: Создание Изменяемого Словаря.
     * Создайте изменяемый словарь, где ключи - целые числа, а значения - строки.
     */
    val mutableMap: MutableMap<Int, String> = mutableMapOf<Int, String>()

    /**
     * Задание 4: Добавление Элементов в Словарь.
     * Имея изменяемый словарь, добавьте в него новые пары "ключ-значение".
     */
    mutableMap[1] = "Джордж Вашингтон"
    mutableMap[2] = "Джон Адамс"
    mutableMap[3] = "Томас Джефферсон"
    println(mutableMap)

    /**
     * Задание 5: Получение Значений из Словаря.
     * Используя словарь из предыдущего задания, извлеките значение, используя ключ. Попробуй получить значение с ключом, которого в словаре нет.
     */
    println("3 президентом США был: ${mutableMap[3]}")
    println("Такого президента США не было: ${mutableMap[0]}")

    /**
     * Задание 6: Удаление Элементов из Словаря.
     * Удалите определенный элемент из изменяемого словаря по его ключу.
     * Словарь Библиотека. Ключи - автор книги, значения - список книг.
     */
    val bookMap: MutableMap<String, String> = mutableMapOf(
        "Чарльз Джонсон" to "Всеобщая история грабежей и смертоубийств, учинённых самыми знаменитыми пиратами",
        "Дэвид Кордингли" to "Капитан Чарльз Джонсон. История знаменитых морских разбойников XVIII века",
        "Джек Лондон" to "Морской волк",
        "Рафаэль Сабатини" to "Приключения капитана Блада",
        "Роберт Штильмарк" to "Наследник из Калькутты",
        "Эмилио Сальгари" to "Черный Корсар",
        "Энгус Констам" to "Пираты. История каперов, флибустьеров и корсаров",
        "Даниэль Дефо" to "Жизнь и пиратские приключения славного капитана Сингльтона"
    )

    bookMap.remove("Джек Лондон")
    println("\nВ разделе книги о пиратах остались книги: $bookMap\n")

    /**
     * Задание 7: Перебор Словаря в Цикле.
     * Создайте словарь (ключи Double, значения Int) и выведи в цикле результат деления ключа на значение.
     * Не забудь обработать деление на 0 (в этом случае выведи слово “бесконечность”).
     */
    val weightMap: MutableMap<Double, Int> = mutableMapOf(
        3.14 to 0,
        3.24 to 1,
        3.34 to 2,
        3.44 to 3
    )

    for ((key, value) in weightMap) {
        if (value == 0) {
            println("$key / $value = бесконечность")
        } else {
            val result = key / value
            println("$key / $value = $result")
        }
    }

    /**
     * Задание 8: Перезапись Элементов Словаря.
     * Измените значение для существующего ключа в изменяемом словаре.
     * Четвертьфинала. Ключи - названия спортивных команд, значения - списки игроков каждой команды.
     */
    val teamMap: MutableMap<String, Any> = mutableMapOf(
        "Безумие" to arrayOf("Василий Удальцов", "Николай Пермяков", "Олег Курочкин"),
        "Отвага" to arrayOf("Алексей Масляков", "Игорь Олейников", "Дмитрий Веселов")
    )

    teamMap["Безумие"] = arrayOf("Антон Молодцов", "Николай Пермяков", "Олег Курочкин")
    val updatedTeam = teamMap["Безумие"] as Array<*>                    //было as Array<String> - уточнить
    println("\nНовый состав команды 'Безумие': ${updatedTeam.joinToString(", ")}")

    /**
     * Задание 9: Сложение Двух Словарей.
     * Создайте два словаря и объедините их в третьем изменяемом словаре через циклы.
     * Курс лечения. Ключи - даты, значения - список препаратов принимаемых в дату.
     */
    /**
     * TODO дописать на случай если совпали date
     * */
    val pharmaMap1: Map<String, List<String>> = mapOf(
        "2024-10-08" to listOf("Волшебная пилюля", "Таблетка для памяти"),
        "2024-10-09" to listOf("Волшебная пилюля", "Таблетка для памяти")
    )

    val pharmaMap2: Map<String, List<String>> = mapOf(
        "2024-10-09" to listOf("Волшебная пилюля", "Нетупин"),
        "2024-10-10" to listOf("Нетупин")
    )
    println()
    val joinPharmaMap: MutableMap<String, MutableList<String>> = mutableMapOf()
    for ((date, pill) in pharmaMap1) {
        joinPharmaMap[date] = pill.toMutableList()
    }
    for ((date, pill) in pharmaMap2) {
        joinPharmaMap[date] = pill.toMutableList()
    }
    for ((date, pill) in joinPharmaMap) {
        if (joinPharmaMap.containsKey(date)) {
            joinPharmaMap[date]?.addAll(pill)
        } else {
            joinPharmaMap[date] = pill.toMutableList()
        }
        println("Дата: $date, Список препаратов: ${pill.joinToString(", ")}")
    }


    /**
     * Задание 10: Словарь со Сложными Типами.
     * 1. Создайте словарь, где ключами являются строки, а значениями - списки целых чисел. Добавьте несколько элементов в этот словарь.
     * 2. Словарь Путешественника. Ключи - страны, значения - словари из городов со списком интересных мест.
     */
    //1
    val workoutSchedule: MutableMap<String, MutableList<Int>> = mutableMapOf(
        "Понедельник" to mutableListOf(30, 45, 60),
        "Среда" to mutableListOf(40, 50)
    )

    workoutSchedule["Пятница"] = mutableListOf(60, 90)
    println()
    for ((day, workout) in workoutSchedule) {
        println("День недели: $day Время тренировок: ${workout.joinToString(", ")}")
    }


    //2
    val travelerDictionary: MutableMap<String, MutableMap<String, MutableList<String>>> = mutableMapOf(
        "Япония" to mutableMapOf(
            "Токио" to mutableListOf("Токийская башня", "Синдзюку", "Храм Сэнсо-дзи"),
            "Киото" to mutableListOf("Храм Кинкаку-дзи", "Бамбуковая роща Арасияма", "Святилище Фусими Инари")
        ),
        (("Россия" to mutableMapOf(
            "Москва" to mutableListOf(
                "Красная площадь",
                "Собор Василия Блаженного",
                "Музей-Заповедник \"Коломенское\""
            ),
            "Санкт-Петербург" to mutableListOf(
                "Храм Спаса на Крови",
                "Большой Петергофский дворец",
                "Дворцовая площадь"
            )
        )


                ))
    )

    travelerDictionary["Испания"] = mutableMapOf(
        "Барселона" to mutableListOf("Саграда Фамилия", "Парк Гуэль", "Дом Бальо")
    )

    println()

    for ((country, cities) in travelerDictionary) {
        println("Страна: $country")
        for ((city, places) in cities) {
            println("  Город: $city")
            println("    Интересные места: ${places.joinToString(", ")}")
        }
    }


    /**
     * Задание 11: Использование Множества в Качестве Значения.
     * Создай словарь, в котором ключи - это целые числа, а значения - изменяемые множества строк. Добавь данные в словарь.
     * Получи значение по ключу (это должно быть множество строк) и добавь в это множество ещё строку. Распечатай полученное множество.
     */
    val sportsSchedule: MutableMap<Int, MutableSet<String>> = mutableMapOf(
        1 to mutableSetOf("Выходной"),
        2 to mutableSetOf("Плавание аэробная", "Силовая"),
        3 to mutableSetOf("Кикбоксинг", "Бег аэробная"),
        4 to mutableSetOf("Вело аэробная + техника педалирования"),
        5 to mutableSetOf("Плавание техническая"),
        6 to mutableSetOf("Бег аэробная"),
        7 to mutableSetOf("Вело аэробная")
    )

    val sportsWeekSchedule = sportsSchedule[6]

    sportsWeekSchedule?.add("Кроссфит")

    println("\nВ субботу занятия: $sportsWeekSchedule")


    /**
     * Задание 12: Поиск Элемента по Значению.
     * 1. Создай словарь, где ключами будут пары чисел. Через перебор найди значение у которого пара будет содержать цифру 5 в качестве первого или второго значения.
     * 2. Справочник Растений. Ключи - типы растений (например, "Цветы", "Деревья"), значения - списки названий растений.
     */
    //1
    val numberPairs: MutableMap<Pair<Int, Int>, String> = mutableMapOf(
        Pair(1, 2) to "Первый элемент",
        Pair(3, 5) to "Второй элемент",
        Pair(5, 9) to "Третий элемент",
        Pair(7, 8) to "Четвертый элемент",
        Pair(10, 5) to "Пятый элемент"
    )
    println()
    for ((key, value) in numberPairs) {
        if (key.first == 5 || key.second == 5) {
            println("Пара чисел: $key содержит цифру 5, значение: $value")
        }
    }

    println()
    for ((key, value) in numberPairs) {
        if (value.contains("п", ignoreCase = true)) {
            println("Пара чисел: $key имеет в значении букву 'п', значение: $value")
        }
    }
    getPlantByName("Вишня")
}

fun getPlantByName(plantName: String) {
//2
    val plantDictionary: Map<String, List<String>> = mapOf(
        "Деревья" to listOf("Груша", "Яблоня"),
        "Кустарник" to listOf("Вишня", "Смородина"),
        "Цветы" to listOf("Пион", "Орхидея", "Тюльпан")
    )

    println()
    for ((plant, name) in plantDictionary) {
        if (name.contains(plantName)) {
            println("\n$plantName представляет собой $plant")
        }  else {
            println("Такого растения в справочнике нет")
            break
        }
    }
}