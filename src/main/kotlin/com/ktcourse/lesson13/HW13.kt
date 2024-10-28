@file:Suppress("UNUSED_EXPRESSION")

package com.ktcourse.lesson13


fun main() {
    println("Задание 1")
    val numList = listOf(-5, 0, 8, 56, 23, 87, 12, 18, 11, -15)
    val stringList = listOf("минус пять", "ноль", "восемь")

    numList.size > 5    //Проверить, что размер коллекции больше 5
    numList.isEmpty()   //Проверить, что коллекция не пустая
    numList.isNotEmpty()    //Проверить, что коллекция пустая
    numList.getOrElse(3) { 33 } //Взять элемент по индексу или создать значение если индекса не существует
    numList.joinToString(",")    //Собрать коллекцию в строку
    numList.sum()    //Посчитать сумму всех значений
    numList.average()   //Посчитать среднее
    numList.maxOrNull()   //Взять максимальное число
    numList.max()
    numList.minOfOrNull { 5.unaryMinus(); 0; 8; 56; 23; 87; 12; 18; 11; -15 }       //Взять минимальное число
    numList.min()
    numList.firstOrNull()   //Взять первое число или null
    numList.contains(0) //Проверить что коллекция содержит элемент

    numList.filter { it in 18..30 }   //Отфильтровать коллекцию по диапазону 18-30
    numList.filterNot { it % 2 == 0 && it % 3 == 0 }  //Выбрать числа, которые не делятся на 2 и 3 одновременно
    numList.filterNotNull() //Очистить текстовую коллекцию от null элементов
    stringList.map { it.length }        //Преобразовать текстовую коллекцию в коллекцию длин слов
    stringList.associateWith { it.reversed() }        //Преобразовать текстовую коллекцию в мапу, где ключи - слова, а значения - перевёрнутые слова
    stringList.sorted() //Отсортировать список в алфавитном порядке
    stringList.sortedDescending()   //Отсортировать список по убыванию
    numList.forEach { println(it * it) } //Распечатать квадраты элементов списка
    stringList.groupBy { it.firstOrNull() }    //Группировать список по первой букве слов
    numList.distinct()  //Очистить список от дублей
    numList.take(3)    //Взять первые 3 элемента списка
    numList.takeLast(3)    //Взять последние 3 элемента списка

    println("\nЗадание 2")
    /**
    * Написать метод, который принимает коллекцию чисел и возвращает строку с текущим состоянием коллекции используя конструкцию when
     * Если коллекция пустая - “Пусто”
     * Если количество элементов меньше пяти - “Короткая”
     * Если коллекция начинается с 0 - “Стартовая”
     * Если сумма всех чисел больше 10000 - “Массивная”
     * Если среднее значение равно 10 - “Сбалансированная”
     * Если длина строки образованная склеиванием коллекции в строку равна 20 - “Клейкая”
     * Если максимальное число меньше -10 - “Отрицательная”
     * Если минимальное число больше 1000 - “Положительная”
     * Если содержит одновременно числа 3 и 14 - “Пи***тая”
     * Иначе - “Уникальная”
     *
     * Вызвать метод с данными, подходящими под каждую из веток
     * */

    println(checkNumToStringCollection(emptyList()))
    println(checkNumToStringCollection(listOf(1, 2, 3, 4)))
    println(checkNumToStringCollection(listOf(0, 2, 3, 4, 5)))
    println(checkNumToStringCollection(listOf(5000, 6000, 10)))
    println(checkNumToStringCollection(listOf(10, 10, 10, 10, 10)))
    println(checkNumToStringCollection(listOf(1, 23456789, 123456789)))
    println(checkNumToStringCollection(listOf(-15, -20, -30)))
    println(checkNumToStringCollection(listOf(1500, 2000, 3000)))
    println(checkNumToStringCollection(listOf(3, 14, 5)))
    println(checkNumToStringCollection(listOf(1, 2, 5, 7, 9)))


    println("\nЗадание 3")
    /**
     * Начальные значения: val grades = listOf(85, 58, 90, 74, 88, 67, 95, 92, 50, 42, 12)
     * Цель: Отфильтровать удовлетворительные оценки (>=60), отсортировать оставшиеся по возрастанию и взять первые 3.
     * */
    val grades = listOf(85, 58, 90, 74, 88, 67, 95, 92, 50, 42, 12)
    println(
        grades.filter { it >= 60 }
            .sorted()
            .take(3)
    )


    println("\nЗадание 4")
    /**
    * Начальные значения: val list = listOf(
     * "Стол", "табурет", "ваза", "Кружка", "Зеркало", "ковер", "Шкаф", "часы", "Люстра", "подушка", "Картина", "столик",
     * "Вазон", "шторы", "Пуф", "книга", "Фоторамка", "светильник", "Коврик", "вешалка", "Подставка", "телевизор", "Комод",
     * "полка", "Абажур", "диван", "Кресло", "занавеска", "Бра", "пепельница", "Глобус", "статуэтка", "Поднос", "фигурка",
     * "Ключница", "плед", "Тумба", "игрушка", "Настенные часы", "подсвечник", "Журнальный столик", "сувенир",
     * "Корзина для белья", "посуда", "Настольная лампа", "торшер", "Этажерка")
     * Цель: Привести все слова в списке к нижнему регистру, сгруппировать в каталог по первой букве.
     */

    val list = listOf(
        "Стол", "табурет", "ваза", "Кружка", "Зеркало", "ковер", "Шкаф", "часы", "Люстра", "подушка", "Картина",
        "столик", "Вазон", "шторы", "Пуф", "книга", "Фоторамка", "светильник", "Коврик", "вешалка", "Подставка",
        "телевизор", "Комод", "полка", "Абажур", "диван", "Кресло", "занавеска", "Бра", "пепельница", "Глобус",
        "статуэтка", "Поднос", "фигурка", "Ключница", "плед", "Тумба", "игрушка", "Настенные часы", "подсвечник",
        "Журнальный столик", "сувенир", "Корзина для белья", "посуда", "Настольная лампа", "торшер", "Этажерка"
    )
    println(list.map { it.lowercase() }
        .groupBy { it[0] })


    println("\nЗадание 5")
    /**
    * Начальные значения из задачи 3. (4?)
     * Цель: Перевести все слова в количество букв, подсчитать среднее значение.
     * Вывести форматированный текст с двумя знаками после запятой.
     * */
    println("%.2f".format(list.map { it.length }.average()))


    println("\nЗадание 6")
    /**
     * Начальные значения: val numbers = listOf(1, 3, 5, 7, 3, 1, 8, 9, 9, 7)
     * Цель: Отобрать уникальные числа, отсортировать по убыванию и сгруппировать по четности (“четные” и “нечетные”).
     * */

    val numbers = listOf(1, 3, 5, 7, 3, 1, 8, 9, 9, 7)
    println(((numbers.distinct()).sortedDescending()).groupBy { if (it % 2 == 0) "четные" else "нечетные" })


    println("\nЗадание 7")
    /**
     * Начальные значения: val ages = listOf(22, 18, 30, 45, 17, null, 60)
     * Цель: Найти первый возраст в списке, который соответствует условию (больше 18),
     * преобразовать его к строке, или вернуть сообщение "Подходящий возраст не найден".
     */

    val ages = listOf(22, 18, 30, 45, 17, null, 60)
    println(ages.filterNotNull().firstOrNull { it > 18 }?.toString() ?: "Подходящий возраст не найден")

}


fun checkNumToStringCollection(numbers: Collection<Int>): String {
    return when {
        numbers.isEmpty() -> "Пусто"
        numbers.size < 5 -> "Короткая"
        numbers.firstOrNull() == 0 -> "Стартовая"
        numbers.sum() > 10000 -> "Массивная"
        numbers.average() == 10.0 -> "Сбалансированная"
        numbers.joinToString("").length == 20 -> "Клейкая"
        numbers.max() < -10 -> "Отрицательная"      //notNull не нужен, т.к. уже есть проверка isEmpty
        numbers.min() > 1000 -> "Положительная"
        numbers.contains(3) && numbers.contains(14) -> "Пи***тая"
        else -> "Уникальная"
    }
}
