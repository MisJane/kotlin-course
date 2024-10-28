package com.ktcourse.lesson16

class Section(
    val type: String,
    val capacity: Int
) {
    val items = mutableListOf<Item>()

    fun addItem(item: Item): Boolean {
        if (item.type == type && convertWeightToVolume(item) <= getFreeSpace()) {
            items.add(item)
            return true
        }
        return false
    }

    fun findItemByName(name: String): Item? {
        return items.find { it.name == name }
    }

    fun remove(item: Item): Boolean {
        return items.remove(item)
    }

    fun getFreeSpace(): Int {
        val usedSpace = items.sumBy { convertWeightToVolume(it) }
        return capacity - usedSpace
    }

    fun convertWeightToVolume(item: Item): Int {
        return (item.weight / conversionFactors.getValue(item.type)).toInt()
    }

    fun formatData(): String {
        return """
        |type: $type
        |capacity: $capacity
        |free: ${getFreeSpace()}
        |items:
        |   ${items.joinToString("\n\t\t") { "${it.name} (${convertWeightToVolume(it)} vol)" }}
        """.trimMargin()
    }
}