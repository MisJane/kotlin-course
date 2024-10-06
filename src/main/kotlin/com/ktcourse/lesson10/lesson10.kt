package com.ktcourse.lesson10


fun main() {

    /**
     * Задание 1: Создание и Инициализация Массива.
     * Создайте массив из 5 целых чисел и инициализируйте его значениями от 1 до 5.
     */
    val numbers1 = IntArray(5)
    for (i in 1 until numbers1.size) {
        numbers1[i] = i + 1
    }

    println("\nРабота с массивами Array. Задание 1 \n${numbers1.toList()}")


    /**
     * Задание 2: Создание Пустого Массива.
     * Создайте пустой массив строк размером 10 элементов.
     */
    val strings1 = Array<String>(10) { "" }

    println("\nРабота с массивами Array. Задание 2 \n${strings1.toList()}")


    /**
     * Задание 3: Заполнение Массива в Цикле.
     * Создайте массив из 5 элементов типа Double и заполните его значениями, являющимися удвоенным индексом элемента.
     */

    val doubles1 = Array(5) { 0.0 }                    //{ DoubleArray(5) }
    for (i in doubles1.indices) {
        doubles1[i] = (2 * (i + 1).toDouble())          //или начинаем с 0? тогда i*2
    }

    println("\nРабота с массивами Array. Задание 3 \n${doubles1.toList()}")

    /**
     * Задание 4: Изменение Элементов Массива.
     * Создайте массив из 5 элементов типа Int.
     * Используйте цикл, чтобы присвоить каждому элементу значение, равное его индексу, умноженному на 3.
     */
    val numbers2 = IntArray(5)
    for (i in numbers2.indices) {
        numbers2[i] = i * 3
    }

    println("\nРабота с массивами Array. Задание 4 \n${numbers2.toList()}")


    /**
     * Задание 5: Работа с Nullable Элементами.
     * Создайте массив из 3 nullable строк. Инициализируйте его одним null значением и двумя строками.
     */
    val strings2 = arrayOfNulls<String?>(3)
    strings2[0] = "Hello,"
    strings2[1] = null
    strings2[2] = "World!"

    println("\nРабота с массивами Array. Задание 5 \n${strings2.toList()}")


    /**
     * Задание 6: Копирование Массива.
     * Создайте массив целых чисел и скопируйте его в новый массив в цикле
     */
    val array1 = intArrayOf(1, 2, 3, 4, 5)
    val newArray = IntArray(array1.size)

    for (i in array1.indices) {
        newArray[i] = array1[i]
    }

    println("\nРабота с массивами Array. Задание 6 \n${newArray.toList()}")


    /**
     * Задание 7: Разница Двух Массивов.
     * Создайте два массива целых чисел одинаковой длины. Создайте третий массив, вычтя значения одного из другого.
     */
    val array2 = intArrayOf(1, 2, 3, 4, 5)
    val array3 = intArrayOf(6, 7, 8, 9, 10)

    val resultArray = IntArray(array2.size)
    for (i in resultArray.indices) {
        resultArray[i] = array2[i] - array3[i]
    }

    println("\nРабота с массивами Array. Задание 7 \n${resultArray.toList()}")
    println(resultArray.contentToString())


    /**
     * Задание 8: Поиск Индекса Элемента.
     * Создайте массив целых чисел. Найдите индекс элемента со значением 5.
     * Если значения 5 нет в массиве, возвращаем -1. Реши задачу через цикл while.
     */
    val numbers3 = intArrayOf(-6, -5, -4, -3, -2, -1, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10)

    var index = 0
    var foundIndex = false

    while (index < numbers3.size && !foundIndex) {
        if (numbers3[index] == 5) {
            foundIndex = true
        } else {
            index++
        }
    }

    if (foundIndex) {
        println(
            "\n" +
                    "Работа с массивами Array. Задание 8 \nИндекс элемента со значением 5: $index"
        )
    } else {
        println("-1")
    }

    getEvenOdd(arrayOf(1, 2, 3, 4, 5))


    val words = arrayOf("сумка", "яблоко", "мороженое", "солнце", "порошок", "корова")
    val search = "оро"
    val result = findSubstring(words, search)
    if (result.isNotEmpty()) {
        println("Найдены элементы: ${result.joinToString(", ")}")
    } else {
        println("Элемент с подстрокой '$search' не найден.")
    }

}


/**
 * Задание 9: Перебор Массива.
 * Создайте массив целых чисел.
 * Используйте цикл для перебора массива и вывода каждого элемента в консоль.
 * Напротив каждого элемента должно быть написано “чётное” или “нечётное”.
 */
fun getEvenOdd(numbers4: Array<Int>) {
    println("\nРабота с массивами Array. Задание 9")
    for (number in numbers4) {
        if (number % 2 == 0) {
            println("$number - чётное")
        } else {
            println("$number - нечётное")
        }
    }

}


/** Задание 10: Поиск Значения в Массиве по вхождению.
 * Создай функцию, которая принимает массив строк и строку для поиска.
 * Функция должна находить в массиве элемент, в котором принятая строка является подстрокой (метод contains()).
 * Верни найденный элемент из функции в виде строки.
 */

fun findSubstring(array: Array<String>, searchString: String): List<String> {
    val foundElements = mutableListOf<String>()

    println("\nРабота с массивами Array. Задание 10")
    for (element in array) {
            foundElements.add(element)
        }
    }
    return foundElements
}
