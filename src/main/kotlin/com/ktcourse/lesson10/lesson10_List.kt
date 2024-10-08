package com.ktcourse.lesson10

fun main() {

    /**
     * Работа со списками List
     */
    /**
     * Задание 1: Создание Пустого Списка.
     * Создайте пустой неизменяемый список целых чисел.
     */
    val emptyList: List<Int> = listOf()
    println("\nРабота со списками List. Задание 1 \n${emptyList}")

    /**  * Задание 2: Создание и Инициализация Списка.
     * Создайте неизменяемый список строк, содержащий три элемента (например, "Hello", "World", "Kotlin").
     */
    val list2: List<String> = listOf("Hello", "World", "Kotlin")
    println("\nРабота со списками List. Задание 2 \n${list2}")

    /**
     * Задание 3: Создание Изменяемого Списка.
     * Создайте изменяемый список целых чисел и инициализируйте его значениями от 1 до 5.
     */
    val numbers: MutableList<Int> = mutableListOf(1, 2, 3, 4, 5)
    println("\nРабота со списками List. Задание 2 \n${numbers}")

    /**
     * Задание 4: Добавление Элементов в Список.
     * Имея изменяемый список целых чисел, добавьте в него новые элементы (например, 6, 7, 8).
     */
    numbers.addAll(listOf(6, 7, 8))
    println("\nРабота со списками List. Задание 4 \n${numbers}")

    /**
     * Задание 5: Удаление Элементов из Списка.
     * Имея изменяемый список строк, удалите из него определенный элемент (например, "World").
     */
    val list5: MutableList<String> = mutableListOf("Hello", "World", "Kotlin")
    list5.remove("World")
    println("\nРабота со списками List. Задание 5 \n${list5}")

    /**
     * Задание 6: Перебор Списка в Цикле.
     * Создайте список целых чисел и используйте цикл для вывода каждого элемента на экран.
     */
    val list6: List<Int> = listOf(1, 2, 3)
    println("\nРабота со списками List. Задание 6")
    for (number in list6) {
        println(number)
    }

    /**
     * Задание 7: Получение Элементов Списка по Индексу.
     * Создайте список строк и получите из него второй элемент, используя его индекс.
     */
    val list7: List<String> = listOf("Hello", "World", "Kotlin")
    println("\nРабота со списками List. Задание 7 \n${list7[1]}")

    /**
     * Задание 8: Перезапись Элементов Списка по Индексу.
     * Имея изменяемый список чисел, измените значение элемента на определенной позиции (например, замените элемент на позиции 2 на новое значение).
     */
    numbers[1] = 17
    println("\nРабота со списками List. Задание 8 \n${numbers}")

    /**
     * Задание 9: Объединение Двух Списков.
     * Создайте два списка строк и объедините их в один новый список, содержащий элементы обоих списков. Реши задачу с помощью циклов.
     */
    val firstList: List<String> = listOf("Hello", "World", "Kotlin")
    val secondList: List<Int> = listOf(1, 2)

    val resultList: MutableList<Any> = mutableListOf()
    for (i in firstList) {
        resultList.add(i)
    }
    for (i in secondList) {
        resultList.add(i)
    }
    println("\nРабота со списками List. Задание 9 \n${resultList}")

    /**
     * Задание 10: Нахождение Минимального/Максимального Элемента.
     * Создайте список целых чисел и найдите в нем минимальный и максимальный элементы используя цикл.
     */
    val list10: List<Int> = listOf(1, 2, 3, 4, 5, 0, -15, 15)

    var minElem = list10[0]
    var maxElem = list10[0]
    for (i in list10) {
        if (i < minElem) {
            minElem = i
        }
    }
    for (i in list10) {
        if (i > maxElem) {
            maxElem = i
        }
    }
    println("\nРабота со списками List. Задание 10 \nМинимальный элемент: ${minElem}, Максимальный: $maxElem")

    /**
     * Задание 11: Фильтрация Списка.
     * Имея список целых чисел, создайте новый список, содержащий только четные числа из исходного списка используя цикл.
     */
    var evenList = mutableListOf<Int>()

    for (i in list10){
        if (i % 2 == 0){
            evenList.add(i)
        }
    }
    println("\nРабота со списками List. Задание 10 \n${evenList}")
}