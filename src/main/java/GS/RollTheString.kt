package GS

fun rollString(msg: String, arr: IntArray) {

    var a = msg.toCharArray()
    for (i in arr) {
        for (j in 0..(i-1)) {
            if (a[j] == 'z')
                a[j] = 'a'
            else
                a[j] = (a[j].toInt() + 1).toChar()
        }

    }
    a.forEach { e -> print(e) }
}

fun main() {
    val rolled = rollString("abcdefrf", intArrayOf(3,5,6))
}