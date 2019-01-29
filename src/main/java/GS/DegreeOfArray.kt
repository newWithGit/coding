package GS

fun findDegree(intArray: IntArray) {

    val map = HashMap<Int, IntArray>()

    for (i in 0..intArray.size) {
        var arr: IntArray?
        if (intArray[i] in map) {
            arr = map.get(intArray[i])
            //arr!!.set(0) = arr!!.get(0)++
        } else {
            arr = intArrayOf(1,i,i)
            map.put(intArray[i], arr)
        }
    }

}

fun main() {

}