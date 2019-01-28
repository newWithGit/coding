package learnCoroutines

import kotlinx.coroutines.*
import kotlin.system.measureTimeMillis

fun sendNumber(): List<Deferred<Int>> {
    val def = (1..1_000).map {  n -> // giving _ is so cool
            GlobalScope.async {
                delay(1000)
                n
            }
    }
    return def
}

fun main(args: Array<String>) = runBlocking {
    print("before")
    val time = measureTimeMillis { val sum = sendNumber().sumBy { it.await() }
        println(sum)
    }
    print("Hurray")
    print("Time ${time/1000} secs")

}

/* output - which means it is running parallely
1784293664
Time 7 secs
Process finished with exit code 0
 */