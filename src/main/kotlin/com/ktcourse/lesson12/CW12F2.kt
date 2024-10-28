package com.ktcourse.lesson12

fun main() {
    printMap(18, 24)
}

private fun checkSize(xy: Int, xyName: String) {
    if (xy == 0) throw IllegalArgumentException("$xyName не должно быть равным нулю")
}

private fun createRange(size: Int): IntProgression {
    return if (size > 0) {
        0..size
    } else {
        0 downTo size
    }
}

fun printMap(xSize: Int, ySize: Int) {
    checkSize(xSize, "xSize")
    checkSize(ySize, "ySize")

    val formatterSize = " $xSize".length
    val formatterSizey = " $ySize".length
    val xRange = createRange(xSize)
    val yRange = createRange(ySize)

    print(" ".repeat(formatterSizey))
    for (i in yRange) {
        print("%${formatterSizey}s".format(i))
    }
    println()
    for (i in xRange) {
        print("%${formatterSize}s".format(i))
        for (j in xRange) {
            val m = i * j
            val result = when {
                m % 2 == 0 -> if (m % 3 == 0) "." else "*"
                m % 5 == 0 -> if (i < 0) "-" else "+"
                else -> "?"
            }
            print("%${formatterSize}s".format(result))
        }
        println()
    }
}