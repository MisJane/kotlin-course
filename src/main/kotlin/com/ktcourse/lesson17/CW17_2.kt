package com.ktcourse.lesson17

abstract class Materials {
    private val materials = mutableListOf<String>()

    fun addMaterial(material: String) {
        materials.add(material)
    }

    fun extractAllMaterials(): List<String> {
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

class ExtractFirst : Materials() {
    fun extract(): String {
        val extracted = extractAllMaterials()
        if (extracted.isEmpty()) return "empty"
        extracted.drop(1).forEach { addMaterial(it) } // Вернем все, кроме первого
        return extracted.first()
    }
}

class ExtractFirstElse : Materials() {
    fun extract(): String {
        val extracted = extractAllMaterials()
        return if (extracted.isNotEmpty()) {
            extracted.first().also { extracted.drop(1).forEach { addMaterial(it) } }
        } else {
            "empty"
        }
    }
}

class ExtractLast : Materials() {
    fun extract(): String {
        val extracted = extractAllMaterials()
        if (extracted.isEmpty()) return "empty"
        extracted.dropLast(1).forEach { addMaterial(it) } // Вернем все, кроме последнего
        return extracted.last()
    }
}

class ExtractMiddle : Materials() {
    fun extract(): String {
        val extracted = extractAllMaterials()
        if (extracted.isEmpty()) return "empty"
        val middleIndex = extracted.size / 2
        extracted.filterIndexed { index, _ -> index != middleIndex }.forEach { addMaterial(it) }
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
    ordinalNumbers.forEach { m1.addMaterial(it) }
    println("ExtractFirst result: ${m1.extract()}")
    m1.printContainer()

    val m2 = ExtractFirstElse()
    ordinalNumbers.forEach { m2.addMaterial(it) }
    println("ExtractFirstElse result: ${m2.extract()}")
    m2.printContainer()

    val m3 = ExtractLast()
    ordinalNumbers.forEach { m3.addMaterial(it) }
    println("ExtractLast result: ${m3.extract()}")
    m3.printContainer()

    val m4 = ExtractMiddle()
    ordinalNumbers.forEach { m4.addMaterial(it) }
    println("ExtractMiddle result: ${m4.extract()}")
    m4.printContainer()
}
