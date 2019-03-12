package careerCup

fun main() {
    findSum()
}

fun findSum() {
    val trackDuplicate = HashMap<Int, String>()
    var sum = 0
    val array = arrayOf(1,5,6,9,8,7,5,6,3,2,1,4,5,6,9,8,7,1,12,15,59,13,45,26)
    array.forEach {
        if (trackDuplicate.get(it) == null) {
           trackDuplicate.put(it, "unique")
            sum += it
        } else if (trackDuplicate.get(it) == "unique") {
            sum -= it
            trackDuplicate.put(it, "duplicate")
        }
    }
    print(sum)
}