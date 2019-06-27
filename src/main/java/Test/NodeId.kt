package Test

enum class DsmNodes(val nodeId: String) {
    NODE_10("10"),
    NODE_11("11"),
    NODE_12("12"),
    NODE_14("14");

    companion object {
        fun getType(node: String) = values().first { dsmNode -> dsmNode.nodeId == node }
    }
}

fun getNode() {
    println(DsmNodes.getType("10").nodeId)
    val node: String? = "10"
    //print(node?.let { getDefaultNode(it) })
    print(getDefaultNode(node))
}

fun main() {
    getNode()
}

fun getDefaultNode(node: String?): DsmNodes {
    return if (node.isNullOrBlank()) DsmNodes.NODE_14 else DsmNodes.getType(node)
}