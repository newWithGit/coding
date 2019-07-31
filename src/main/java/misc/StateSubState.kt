package misc

fun main() {
    val stateSubStates = arrayOf("CA", "AB", "CD", "GH", "IJ", "CA1")
    println(checkIfStateSubStateBothPresent(stateSubStates))
}

fun checkIfStateSubStateBothPresent(stateSubStates: Array<String>): Boolean {
    val stateSubStateMap = createStateSubStateMap()
    val subStates = mutableSetOf<String>()
    stateSubStates.toList()
        .stream()
        .filter {
            stateSubStateMap.keys.contains(it)
        }.forEach {
            stateSubStateMap[it]?.let { it1 -> subStates.addAll(it1) }
        }

    return stateSubStates.any { subStates.contains(it) }
}

fun createStateSubStateMap(): Map<String, Set<String>> {
    var stateSubStateMap = mutableMapOf<String, Set<String>>()
    stateSubStateMap.putIfAbsent("CA", hashSetOf("CA1", "CA2", "CA3", "CA4", "CA5"))
    stateSubStateMap.putIfAbsent("AB", hashSetOf("AB1", "AB2", "AB3"))
    stateSubStateMap.putIfAbsent("CD", hashSetOf("CD1"))
    stateSubStateMap.putIfAbsent("EF", hashSetOf("EF"))
    stateSubStateMap.putIfAbsent("GH", hashSetOf("GH1", "GH2"))
    stateSubStateMap.putIfAbsent("IJ", hashSetOf("IJ1", "IJ2", "IJ3", "IJ4", "IJ5"))
    stateSubStateMap.putIfAbsent("KL", hashSetOf("KL1"))
    stateSubStateMap.putIfAbsent("MN", hashSetOf("MN"))
    return stateSubStateMap
}