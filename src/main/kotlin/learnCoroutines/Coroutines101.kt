package learnCoroutines

import kotlinx.coroutines.async
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking
import kotlin.system.measureTimeMillis


suspend fun test(i: Int): Int {
    delay( if (i!=3) 2000 else 200 )
    return 42
}

suspend fun test2(i: Int): Int {
    delay( if (i != 3) 2000 else 200 )
    return 42
}

fun main(args: Array<String>) = runBlocking {
    var sum = 0
    var time = measureTimeMillis {
        for (i in 1..5) {
            val v1 = async { test(i) }
            val v2 = async { test2(i) }
            println("Result = ${v1.await() + v2.await()}")
            async { println(test(i) + test2(i)) } // async can be called on non suspend method
        }
        print(sum)
    }
    println("time taken ${time/1000} sec")
}
