package Test

class WhichObjWillTake {
    /*fun test(input: String?) {
        print("Inside String")
    }*/

    fun test(input: Any?) {
        print("Inside Any")
    }

    fun test(input: String?) {
        print("Inside String")
    }

    fun test(input: Int?) {
        print("Inside Int")
    }
}

fun main() {
    //WhichObjWillTake().test(null)
}