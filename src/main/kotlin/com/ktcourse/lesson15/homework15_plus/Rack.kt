package com.ktcourse.lesson15.homework15_plus

class Rack(private val maxShelves: Int) {

    private val shelves = mutableListOf<Shelf>()

    fun addShelf(shelf: Shelf): Boolean {
        if (shelves.size < maxShelves && !shelves.contains(shelf)) {
            shelves.add(shelf)
            return true
        }
        return false
    }

    fun removeShelf(index: Int): Boolean {
        return if (index in shelves.indices) {
            shelves.removeAt(index)
            true
        } else {
            false
        }
    }

    fun addItem(item: Item): Boolean {
        val shelf = shelves.maxByOrNull { it.availableCapacity() }
        return shelf?.takeIf { it.canAccommodate(item) }?.addItem(item) ?: false
    }

    fun removeItem(name: String): Boolean {
        shelves.forEach { shelf ->
            if (shelf.removeItem(name)) return true
        }
        return false
    }

    fun containsItem(name: String): Boolean {
        return shelves.any { it.containsItem(name) }
    }

    fun printContents() {
        shelves.forEachIndexed { index, shelf ->
            println("Полка $index:")
            println("  Вместимость: ${shelf.capacity}")
            println("  Оставшаяся вместимость: ${shelf.availableCapacity()}")
            println("  Предметы: ${shelf.getItems().joinToString { it.name }}")
        }
    }

    fun advancedRemoveShelf(index: Int): List<Item> {
        if (index !in shelves.indices) return emptyList()

        val shelf = shelves[index]
        val itemsToRelocate = shelf.getItems().sortedByDescending { it.size }
        val failedItems = mutableListOf<Item>()

        itemsToRelocate.forEach { item ->
            if (!addItem(item)) {
                failedItems.add(item)
            }
        }

        shelves.removeAt(index)
        return failedItems
    }

}