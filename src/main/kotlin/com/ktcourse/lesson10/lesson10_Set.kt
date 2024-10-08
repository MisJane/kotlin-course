package com.ktcourse.lesson10

fun main() {
    val stringSet: Set<String> = setOf("Kotlin", "Java", "Scala")
    val search = "Java"
    val result = containString(stringSet, search)

    /**
     *Работа с Множествами Set.
     */
    /**
     * Задание 1: Создание Пустого Множества.
     * Создайте пустое неизменяемое множество целых чисел.
     */
    val intEmptySet: Set<Int> = setOf()
    println("\nРабота с Множествами Set. Задание 1 \n${intEmptySet}")

    /**
     * Задание 2: Создание и Инициализация Множества.
     * Создайте неизменяемое множество целых чисел, содержащее три различных элемента (например, 1, 2, 3).
     */
    val intSet: Set<Int> = setOf(1, 2, 3)
    println("\nРабота с Множествами Set. Задание 2 \n${intSet}")

    /**
     * Задание 3: Создание Изменяемого Множества.
     * Создайте изменяемое множество строк и инициализируйте его несколькими значениями (например, "Kotlin", "Java", "Scala").
     */
    val set3: MutableSet<String> = mutableSetOf("Kotlin", "Java", "Scala")
    println("\nРабота с Множествами Set. Задание 3 \n${set3}")

    /**
     * Задание 4: Добавление Элементов в Множество.
     * Имея изменяемое множество строк, добавьте в него новые элементы (например, "Swift", "Go").
     */
    set3.addAll(listOf("Swift", "Go"))
    println("\nРабота с Множествами Set. Задание 4 \n${set3}")

    /**
     * Задание 5: Удаление Элементов из Множества.
     * Имея изменяемое множество целых чисел, удалите из него определенный элемент (например, 2).
     */
    val set5: MutableSet<Int> = mutableSetOf(1, 2, 3)
    set5.remove(2)
    println("\nРабота с Множествами Set. Задание 5 \n${set5}")

    /**
     * Задание 6: Перебор Множества в Цикле.
     * Создайте множество целых чисел и используйте цикл для вывода каждого элемента на экран.
     */
    val set6: Set<Int> = setOf(1, 2, 3)
    println("\nРабота с Множествами Set. Задание 6")
    for (number in set6) {
        println(number)
    }

    /**
     * Задание 7: Проверка Наличия Элемента в Множестве.
     * Создай функцию, которая принимает множество строк (set) и строку и проверяет, есть ли в множестве указанная строка.
     * Нужно вернуть булево значение true если строка есть. Реши задачу через цикл.
     */
    println("\nРабота с Множествами Set. Задание 7 \n${result}")

    /**
     * Задание 8: Объединение Двух Множеств.
     * Создайте два множества строк и объедините их в одно новое множество, содержащее все уникальные элементы обоих множеств. Реши задачу с помощью циклов.
     */
    val firstSet: Set<String> = setOf("Hello", "World", "Kotlin")
    val secondSet: Set<Int> = setOf(1, 2)

    val resultSet: MutableSet<Any> = mutableSetOf()
    for (i in firstSet) {
        resultSet.add(i)
    }
    for (i in secondSet) {
        resultSet.add(i)
    }
    println("\nРабота с Множествами Set. Задание 8 \n${resultSet}")

    /**
     * Задание 9: Нахождение Пересечения Множеств.
     * Создайте два множества целых чисел и найдите их пересечение (общие элементы). Реши задачу через вложенные циклы.
     */
    val firstSet9: Set<Int> = setOf(1, 2, 3)
    val secondSet9: Set<Int> = setOf(3, 4, 5, 2)

    val unitySet: MutableSet<Int> = mutableSetOf()
    for (i in firstSet9) {
        if (secondSet9.contains(i)) {
            unitySet.add(i)
        }
    }
    println("\nРабота с Множествами Set. Задание 9 \n${unitySet}")

    /**
     * Задание 10: Нахождение Разности Множеств.
     * Создайте два множества строк и найдите разность первого множества относительно второго
     * (элементы, присутствующие в первом множестве, но отсутствующие во втором).
     * Реши задачу через вложенные циклы и переменные флаги.
     */
    val set1: Set<String> = setOf("Kotlin", "Java", "Scala", "Python")
    val set2: Set<String> = setOf("Java", "Python")

    val diffResult = differenceBetweenSets(set1, set2)
    println("\n" +
            "Работа с Множествами Set. Задание 10 \nРазность первого множества относительно второго: $diffResult")

    /**
     * Задание 11: Конвертация Множества в Список.
     * Создайте множество строк и конвертируйте его в список с использованием цикла.
     */
    val stringSet11 = setOf("Hello", "World", "Kotlin")
    val listFromSet11 = mutableListOf<String>()
    for (i in stringSet11) {
        listFromSet11.add(i)
    }
    println("\nРабота с Множествами Set. Задание 11 \n${listFromSet11}")

}

fun containString(set: Set<String>, searchString: String): Boolean {

    for (i in set) {
        if (i == searchString) {
            return true
        }
    }
    return false
}

fun differenceBetweenSets(set1: Set<String>, set2: Set<String>): Set<String> {

    val differenceSet: MutableSet<String> = mutableSetOf()

    for (element1 in set1) {
        var found = false

        // Перебираем элементы второго множества для поиска совпадений
        for (element2 in set2) {
            if (element1 == element2) {
                found = true  // Если элемент найден во втором множестве, ставим флаг
                break         // Выходим из цикла
            }
        }

        // Если элемент не был найден во втором множестве, добавляем его в результат
        if (!found) {
            differenceSet.add(element1)
        }
    }

    return differenceSet
}

