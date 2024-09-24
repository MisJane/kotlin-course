fun main() {

    print("1.1: ")
    for (i in 1..5) {
        print("$i ")
    }

    println("")
    print("1.2: ")

    for (i in 1..10)
        if (i % 2 == 0) {
            print("$i ")
        }

    println("")
    print("2.1: ")
    for (i in 5 downTo 1) {
        print("$i ")
    }

    println("")
    print("2.2: ")
    for (i in 10 downTo 1 step 2) {
        print("$i ")
    }

    println("")
    print("3.1: ")
    for (i in 1..9 step 2) {
        print("$i ")
    }

    println("")
    print("3.2: ")
    println((1..20).filter { it % 3 == 0 })

    print("4.1: ")
    for (i in 1 until 9) {
        print("$i ")
    }

    println("")
    print("4.2: ")
    for (i in 3 until 15) {
        print("$i ")
    }

    println("")
    print("5.1: ")
    var num = 1
    while (num <= 5) {
        val square = num * num
        print("$num * $num = $square; ")
        num++
    }

    println("")
    print("5.2: ")
    var num1 = 10
    while (num1 >= 5) {
        print("$num1 ")
        num1--
    }

    println("")
    print("6.1: ")
    var num2 = 6
    do {
        num2--
        print("$num2 ")
    } while (num2 > 1)

    println("")
    print("6.2: ")
    var num3 = 4

    do {
        num3++
        print("$num3 ")
    } while (num3 < 10)


    println("")
    print("7.1: ")
    for (i in 1..10) {
        if (i == 6) break
        print("$i ")
    }


    println("")
    print("7.2: ")
    var num4 = 1

    while (true) {
        print("$num4 ")
        if (num4 >= 10) {
            break
        }
        num4++
    }


    println("")
    println("*: ")

    for (i in 0..10) {
        for (j in 0..10) {
            print(i + 1 * j)
            print(" ")
        }
        println()
    }

}