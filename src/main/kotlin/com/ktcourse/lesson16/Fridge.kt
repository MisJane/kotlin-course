package com.ktcourse.lesson16

class Fridge(private val capacity: Int) {
    private val sections = mutableListOf<Section>()

    fun addSection(section: Section): Boolean {
        return if (sections.size < capacity) {
            sections.add(section)
            true
        } else {
            false
        }
    }

    fun removeSectionsByType(type: String): Boolean {
        val initialSize = sections.size
        sections.removeAll { it.type == type }
        return sections.size < initialSize
    }

    fun removeSectionWithRedistribution(section: Section): List<Item> {
        val remainingItems = mutableListOf<Item>()
        if (sections.remove(section)) {
            section.items.forEach { item ->
                if (!addItem(item)) {
                    remainingItems.add(item)
                }
            }
        }
        return remainingItems
    }

    fun addItem(item: Item): Boolean {
        sections.filter { it.type == item.type }
            .maxByOrNull { it.getFreeSpace() }
            ?.takeIf { it.getFreeSpace() >= it.convertWeightToVolume(item) }
            ?.let {
                return it.addItem(item)
            }
        return false
    }

    fun findItemByNameAndType(name: String, type: String): Item? {
        return sections.find { it.type == type }?.findItemByName(name)
    }

    fun removeItem(item: Item): Boolean {
        return sections.find { it.type == item.type }?.remove(item) == true
    }

    fun removeAllItemsByName(name: String): Int {
        var count = 0
        sections.forEach { section ->
            section.items.filter { it.name == name }.forEach {
                if (section.remove(it)) count++
            }
        }
        return count
    }

    fun viewFridge() {
        println(sections.joinToString("\n\n") { it.formatData() })
    }
}