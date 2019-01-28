package learnCoroutines

import kotlinx.coroutines.delay
import kotlinx.coroutines.async
import kotlinx.coroutines.runBlocking
import kotlin.system.measureTimeMillis

suspend fun printName() {
    delay(5000) // can be run from a courotuine
    print("saurav")
}

fun main(args: Array<String>) = runBlocking {

    val t = measureTimeMillis { // takes double time as its sequential execution
        /*printName()
        printName()*/
    }
    val t2 = measureTimeMillis { // parallel execution
        val a = async { printName() } // can be called from coroutines
        val b = async { printName() }
        print(a.await())
        print(b.await())
    }

    println("time $t , $t2")
}