package GS

fun encoding(msg: String, key: Int) {
    var output: String = "";
    var arr = getKeyArr(key)
    var count = 0
    for (i in msg) {
        if (count < arr.size) {
            for (j in 1..arr[count]) {
                output +=  i
            }

            count++
        } else {
            output +=  i
        }
    }
    print(output)
}

fun decoding(msg: String, key: Int) {
    var arr = getKeyArr(key)
    var output = ""
    output += msg.get(0)
    while(true) {


    }


}

fun getKeyArr(key: Int): IntArray {
    var key = key
    var arr = IntArray(key.toString().length)
    var count = 0
    while(key > 0) {
        arr[count++] = key%10
        key = key/10
    }
    return arr.reversedArray()
}

fun main() {
    encoding("Opee", 123456)
}