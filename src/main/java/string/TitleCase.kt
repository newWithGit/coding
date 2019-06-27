package string

fun titleCase(input: String, delimiter: Char = '_', replaceWith: Char = '/') {
    var toCapitalize = true
    var result = CharArray(input.length)
    var isFirst = true
    input.forEachIndexed { index: Int, c: Char ->
        when {
            toCapitalize -> {
                result[index] = c.toUpperCase()
                toCapitalize = false
            }
            else -> {
                when (c) {
                    delimiter -> {
                        toCapitalize = true
                        if (! isFirst) result[index] = delimiter
                        else {
                            result[index] = replaceWith
                            isFirst = false
                        }
                    }
                    else -> result[index] = c.toLowerCase()
                }
            }
        }
    }
    print(result.joinToString(separator = ""))
}

fun main() {
    //titleCase("SAURAV_KUMAR_OPENTEXT_Bangalore", delimiter = '_', replaceWith = ' ')
    var char = '\u0000'
    print("Saurav${char}kumar")
}