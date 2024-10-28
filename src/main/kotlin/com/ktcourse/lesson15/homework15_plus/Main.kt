package com.ktcourse.lesson15.homework15_plus

fun main() {
    val shelf1 = Shelf(20)
    val shelf2 = Shelf(30)

    val item1 = Item("Книга", 5)
    val item2 = Item("Коробка", 10)
    val item3 = Item("Ваза", 8)

    shelf1.addItem(item1)
    shelf1.addItem(item2)

    shelf2.addItem(item3)

    val rack = Rack(5)
    rack.addShelf(shelf1)
    rack.addShelf(shelf2)

    rack.printContents()

    println("Добавление предмета: ${rack.addItem(Item("Сувенир", 7))}")
    println("Удаление полки с перераспределением: ${rack.advancedRemoveShelf(0)}")
    rack.printContents()
}
