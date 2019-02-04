package learningBasics

fun main() {
    val name by lazy { printMyName() }
    println("I am after lazy block")
    println(name)
}

fun printMyName(): String {
    println("saurav")
    return "saurav"
}