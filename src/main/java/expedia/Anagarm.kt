package expedia

class Anagarm {

    fun check() {
        val wordSet = mutableSetOf<String>("the", "bats", "act", "tabs", "cat")
        val sentence = "int the act"
        val words = sentence.split(" ")
        val map = HashMap<String, Int>()
        words.parallelStream().forEach {word1 ->
            var eachWordAnagaram = 0
            wordSet.parallelStream().forEach { word2 ->
                if (isAnagram(word1, word2))
                    eachWordAnagaram++
            }
            map[word1] = eachWordAnagaram
            //println(eachWordAnagaram)
        }
        //println(map.values)
        var combination = 0
        map.values.filter { it > 0 }.forEach {
            combination += it+1 // word can be replaced by number and by itself so +1
        }
        print(combination)
    }

    private fun isAnagram(word1: String, word2: String): Boolean {
        if (word1.length != word2.length) return false
        if (word1 == word2) return false
        return (word1.toSortedSet() == word2.toSortedSet())
    }
}

fun main() {
    Anagarm().check()
}