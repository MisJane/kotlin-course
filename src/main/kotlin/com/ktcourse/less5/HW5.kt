package com.ktcourse.less5

fun main() {
    soundAttenuation(65.0, null)
    sumDelivery(200.00)
    sumDelivery(null)
    alarm("1013.25 hPa")
    alarm(null)

}

fun soundAttenuation(initSoundIntensity: Double, k: Double?) {
    val soundIntensity = initSoundIntensity * (k ?: 0.5)
    println(soundIntensity)
}

fun sumDelivery(delivery: Double?) {
    val sumDelivery = (((delivery ?: 50.0) * 0.5) / 100) + (delivery ?: 50.0)
    println(sumDelivery)
}

fun alarm (pressure: String?){
    println(pressure ?: throw Exception("There are no atmospheric pressure readings"))
}