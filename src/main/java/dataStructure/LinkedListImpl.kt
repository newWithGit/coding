package dataStructure

import java.lang.StringBuilder

class LinkedList<T>(node: Node<T>) {

}

data class Node<T>(var data: T, var next: Node<T>?) {

    fun addNode(data: T) {
        var temp: Node<T>? = this@Node
        while (temp != null) {
            temp = temp.next
        }
        var newNode = Node(data, null)
        temp!!.next = newNode
    }

    override fun toString(): String {
        var temp: Node<T>? = this
        var sb = StringBuilder()
        while (temp != null) {
            sb.append(temp.data)
            temp = temp.next
        }
        return sb.toString()
    }
}