package com.ktcourse.less5

class Lesson5 {

}

fun main(){
    printPrice(124.8, null)
    printPrice(124.8, 10)
    printSiteLang("Rus")
    printSiteLang(null)
    printBoxStuff("55000.00")
    printBoxStuff(null)

}

fun printPrice(price: Double, sum: Int?) {
    val ratio = (100 - (sum ?: 0)) / 100.0
    println(price * ratio)

}

fun printSiteLang(lang: String?){
    val defaultLang = "Eng"
    println(lang ?: defaultLang)

}

fun printBoxStuff(stuff: String?){
    println(stuff ?: throw Exception("The box is empty :-( "))

}