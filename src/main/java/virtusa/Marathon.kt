package virtusa

import java.lang.Math.ceil

fun main() {
    val arr = listOf<Int>(2,8,9,11,16,21)
    val k = 15
    var foundNum = false
    var num: Int = 1
    while(!foundNum) {
        var sum = 1.0
        for (i in arr) {
            sum += ceil(i.div(num).toDouble())
        }
        if (sum <= k) {
            println(sum)
            foundNum = true
            break
        }
        num++
    }
    println(num)
}




private fun Integer.div(num: Int, i: Int): Double = (i/num).toDouble()
