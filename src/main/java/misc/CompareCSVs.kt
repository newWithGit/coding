package misc

import java.io.File

fun main() {
    compareCsv()
}

fun compareCsv() {
    val elementsWithMultiNode = getElements("/Users/s0k02c9/Desktop/jars/Gbas_OfferSellerSlaTier_response_1566337411200.csv")
    val elementsWithoutMultiNode = getElements("/Users/s0k02c9/Desktop/jars/Gbas_OfferSellerSlaTier_response_1566456213894.csv")

    compareMapsAndWriteToFile(elementsWithMultiNode, elementsWithoutMultiNode)
}

fun getElements(fileName: String): Map<String, String> {
    val inputStream = File(fileName).inputStream()
    val mutableMap = mutableMapOf<String, String>()

    inputStream.bufferedReader().useLines { lines ->
        lines.forEach {line ->
            val array = line.split(",")
            val key: String = array[0] + "," + array[1]
            mutableMap[key] = array[2] + "," + array[3]
        }
    }
    return mutableMap
}

fun compareMapsAndWriteToFile(elementsWithMultiNode: Map<String, String>, elementsWithoutMultiNode: Map<String, String>) {

    val disjointSet = mutableSetOf<String>()
    disjointSet.add("OfferId, SellerId, MultiNode_SlaTier, MultiNode_Availability, MultiNodeOff_SlaTier, MultiNodOffe_Availability")
    elementsWithMultiNode.forEach { key, value ->
        if (elementsWithoutMultiNode[key] != value) {
            val str = elementsWithoutMultiNode[key]
            disjointSet.add("$key,$value,$str")
        }
    }

    val printWriter = File("/Users/s0k02c9/Desktop/jars/disjoint.csv").printWriter()
    disjointSet.parallelStream().forEach {
        printWriter.println(it)
    }

}