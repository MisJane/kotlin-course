package com.ktcourse.lesson15.homework15

object Moon {
    private var isVisible: Boolean = true
    private var phase: String = "Full Moon"

    fun showPhase() {
        if (isVisible) {
            println("Текущая фаза Луны: $phase")
        } else {
            println("Луна сейчас не видна")
        }
    }
}