package com.ktcourse.lesson15.homework15_plus

class Shelf(val capacity: Int) {
    private val items = mutableListOf<Item>()
    private var currentCapacity = 0

    fun addItem(item: Item): Boolean {
        if (canAccommodate(item)) {
            items.add(item)
            currentCapacity += item.size
            return true
        }
        return false
    }

    fun removeItem(name: String): Boolean {
        val item = items.find { it.name == name }
        return if (item != null) {
            items.remove(item)
            currentCapacity -= item.size
            true
        } else {
            false
        }
    }

    fun canAccommodate(item: Item): Boolean {
        return currentCapacity + item.size <= capacity
    }

    fun containsItem(name: String): Boolean {
        return items.any { it.name == name }
    }

    fun getItems(): List<Item> {
        return items.toList()
    }

    fun availableCapacity(): Int {
        return capacity - currentCapacity
    }
}