package learningBasics

// Variables

fun variables() {
    // val are like final variables, can be assigned only once
    val x: Int = 1 // assignment
    val y = 2 // deferred
    //y = 8
    val c: Int // with val you can reassign a variable
    c = 5

    var name: String
    name = "Saurav"
    name = "Kumar"
}





// semi colon is optional

fun printName() {
    print("Saurav")
}

fun printMessage(msg: String, prefix: String = "Hello,") {
    println("$prefix $msg!")
}

fun sum(x: Int, y: Int) = x + y // function expression

fun sumLegacy(x: Int, y: Int): Int {
    return x + y
}

fun printSumInCoolWay(x: Int, y: Int): Unit {
    println("Sum of $x and $y is ${x + y}")
}

fun main() {
    printSumInCoolWay(9, 8)
    println(sumLegacy(x = 3, y = 8))
    println(sum(2, 4))
    printMessage(msg = "World")
    printName()
}