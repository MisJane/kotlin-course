package com.ktcourse.lesson15.homework15

class Emotion(val type: String, val intensity: Int) {

    fun express() {
        val description = when {
            intensity <= 3 -> "Слабая"
            intensity <= 6 -> "Средняя"
            else -> "Сильная"
        }
        println("Интенсивность эмоции $type - $description ($intensity)")
    }
}