package com.ktcourse.lesson15.homework15

class Concert(
    val band: String,
    val venue: String,
    val ticketPrice: Double,
    val capacity: Int
) {
    private var soldTickets: Int = 0

    fun concertInfo() {
        println("Концерт группы: $band")
        println("Место проведения: $venue")
        println("Стоимость билета: $ticketPrice")
        println("Вместимость зала: $capacity")
        println("Продано билетов: $soldTickets")
    }

    fun buyTicket() {
        if (soldTickets < capacity) {
            soldTickets++
            println("Билет куплен. Всего проданных билетов: $soldTickets")
        } else {
            println("Все билеты проданы!")
        }
    }
}