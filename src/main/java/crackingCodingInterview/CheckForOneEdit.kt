package crackingCodingInterview

/**
 *  Check if one string can be converted to another edit means
 *  either one replace, one add or one remove
 *  aca, aa
 */

fun main(args: Array<String>) {
    print(checkIfOneEdit("abg", "acd"))
}

fun checkIfOneEdit(input: String, input2: String): Boolean {
    if (input == input2)
        return true
    else if (input.length == input2.length)
        return replace(input, input2)
    /*else if (input.length != input2.length)
        return addOrRemove(input, input2)*/
    return false
}

fun replace(input: String, input2: String): Boolean {
    var idx = 0
    var count = 0
    while (idx < input2.length) {
        if (input[idx] != input2[idx])
            count++
        if (count > 1)
            return false
    }
    return true
}


fun addOrRemove(input: String, input2: String): Boolean {
    var loopOn = if (input.length > input2.length) input else input2
    var idx = 0
    var gotMismatch = false
    while (idx < loopOn.length) {
        if (!gotMismatch && input[idx] != input2[idx]) {
            gotMismatch = true
        } else if (gotMismatch && input[idx++] == input2[idx]){

        }

        idx++
    }
    return false
}
