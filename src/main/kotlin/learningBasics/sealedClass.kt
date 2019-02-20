package learningBasics

fun main() {
    printNames(JunkPrint.FirstName)
    printNames(JunkPrint.LastName)
}

sealed class JunkPrint{
    object FirstName: PrintName()
    object LastName: PrintName()
}

open class PrintName {
    fun printFirstName() {
        println("Saurav")
    }

    fun printLastName() {
        println("Kumar")
    }
}

fun printNames(obj: PrintName) {
    when(obj) {
        is JunkPrint.FirstName -> obj.printFirstName()
        is JunkPrint.LastName -> obj.printLastName()
    }
}

