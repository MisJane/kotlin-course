/*
package com.ktcourse.lesson17

import com.ktcourse.lesson17.ExtractFirst.*

abstract class Materials {

    private val materials = mutableListOf<String>()

    fun addMaterial(material: String) {
        materials.add(material)
    }

    fun extractMaterial(): List<String> {
        val extracted = materials.toList()
        materials.clear()
        return extracted
    }

    fun printContainer() {
        materials.forEachIndexed { index, layer ->
            println("[$index]: $layer")
        }
    }
}

class ExtractFirst() : Materials() {
    fun extract(): String {
        val extracted = extractMaterial()
        if (extracted.isEmpty()) {
            return "empty"
        }
        if (extracted.size == 1) {
            return extracted[0]
        }
        for (i in 1 until extracted.size) {
            addMaterial(extracted[i])
        }
        return extracted[0]
    }
}


class ExtractFirstElse() : Materials() {
    fun extract(): String? {
        val extractedMaterial = extractMaterial()
        return if (extractedMaterial.isNotEmpty()) {
            extractedMaterial.first()
        } else {
            return "empty"
        }
    }
}

class ExtractLast() : Materials() {
    fun extract(): String {
        val extracted = extractMaterial()
        if (extractMaterial().isEmpty()) {
            return "empty"
        }
        if (extracted.size == 1) {
            return extracted[0]
        }
        for (i in 0 until extracted.size - 1) {
            addMaterial(extracted[i])
        }
        return extracted.last()
    }
}

class ExtractMiddle() : Materials() {
    fun extract(): String {
        val extracted = extractMaterial()
        if (extracted.isEmpty()) {
            return ""
        }
        if (extracted.size == 1) {
            return extracted[0]
        }
        val middleIndex = extracted.size / 2
        for (i in extracted.indices) {
            if (i == middleIndex) continue
            addMaterial(extracted[i])
        }
        return extracted[middleIndex]
    }
}


fun main() {
    val ordinalNumbers = listOf(
        "first", "second", "third", "fourth", "fifth",
        "sixth", "seventh", "eighth", "ninth", "tenth",
        "eleventh", "twelfth", "thirteenth", "fourteenth", "fifteenth",
        "sixteenth", "seventeenth", "eighteenth", "nineteenth", "twentieth"
    )
    val m1 = ExtractFirst()
    ordinalNumbers.forEach { m1.extractMaterial(it) }
    println(m1.extract())
    m1.printContainer()

    val m2 = ExtractFirstElse()
    ordinalNumbers.forEach { m2.extractMaterial(it) }
    println(m2.extract())
    m2.printContainer()

    val m3 = ExtractLast()
    ordinalNumbers.forEach { m3.extractMaterial(it) }
    println(m3.extract())
    m3.printContainer()

    val m4 = ExtractMiddle()
    ordinalNumbers.forEach { m4.extractMaterial(it) }
    println(m4.extract())
    m4.printContainer()
}*/
