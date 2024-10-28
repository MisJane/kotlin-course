package com.ktcourse.lesson15.homework15

class Party(private val location: String, private val attendees: Int) {

    fun details() {
        println("Место проведения вечеринки: $location")
        println("Количество гостей: $attendees")
    }
}