package careerCup

import java.util.*

/**
 * when multiplying a 6 digit number with 2 gives a number which has all the same numbers.
142857 x 2 = 285714
 */
class MultipleOfTwo {

    fun tester(input: Int): Boolean {
        // first if optional
        if (input > 499999 || input <100000)
            return false
        val array = input.toString().toCharArray()
        if (array[0].toInt() >= 53 )
            return false

        val resultArray = (input*2).toString().toCharArray()

        array.sort()
        resultArray.sort()
        return array.contentEquals(resultArray)
    }

    
}

fun main() {
    println(MultipleOfTwo().tester(142857))
    println(MultipleOfTwo().tester(100000))
}