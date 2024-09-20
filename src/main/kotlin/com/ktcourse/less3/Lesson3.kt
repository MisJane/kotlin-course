package com.ktcourse.less3


val name: String = "Jane" //не изменяемое

var age: Int = 33 //изменяемая, при обращении назначаем иное значение

const val PI = 3.14 //не изменяемое, известное на момент написания кода, нельзя присвоить объект (для Int, String)

lateinit var userInfo: String //для инициализации позже, при обращении (обязательно var)

val lazyValue: String by lazy {
    "lesson 3"
}  //будет проинициализировано только при обращении

var speed: Double? = null //тип? = может быть null

var count: Int = 0
    get() = field
    set(value) {
        if (value >= 0) field = value
        // else field = 100
    }

class Main {
    fun countUp() {
        count = 1
    }
}

val VIN: String = "123TPE"
var carColor: String = "Green"
var distance: Float = 0.0F
lateinit var carOwner: String
const val WHEELS: Int = 4
val report: String by lazy { "" +
        "" }
var fuel: Float = 0F
    get() = field
    set(value) {
        if (value >= 0) field += value //field = field + value
        //else (value < 0)
    }

