package dataStructure

import java.util.*

data class TreeNode<T>(val data: T , var right: TreeNode<T>? = null, var left: TreeNode<T>? = null)

class BFS {
    fun levelOrderTraversal(root: TreeNode<Int>) {
        val queue = ArrayDeque<TreeNode<Int>>()
        queue.push(root)
        while(queue.isNotEmpty()) {
            val tmp = queue.pop()
            print("${tmp.data} ")
            if (tmp.left != null) {
                queue.add(tmp.left)
            }
            if (tmp.right != null) {
                queue.add(tmp.right)
            }
        }
    }

    fun zigZagTraversal(root: TreeNode<Int>) {
        val queue = ArrayDeque<TreeNode<Int>>()
        queue.push(root)
        var even = true
        while(queue.isNotEmpty()) {
            if (even) {
                val tmp = queue.pollFirst()
                print("${tmp.data} ")
                if (tmp.left != null) {
                    queue.add(tmp.left)
                }
                if (tmp.right != null) {
                    queue.add(tmp.right)
                }
                even = false
            } else {
                val tmp = queue.pollLast()
                print("${tmp.data} ")
                if (tmp.right != null) {
                    queue.add(tmp.right)
                }
                if (tmp.left != null) {
                    queue.add(tmp.left)
                }
                even = true
            }
        }
    }
}

fun main() {
    val root = TreeNode(50)
    root.left = TreeNode(30)
    root.right = TreeNode(60)

    root.left!!.left = TreeNode(20)
    root.left!!.right = TreeNode(40)

    root.right!!.left = TreeNode(55)
    root.right!!.right = TreeNode(75)

    root.left!!.left!!.left = TreeNode(5)
    root.left!!.left!!.right = TreeNode(25)

    root.left!!.right!!.left = TreeNode(35)
    root.left!!.right!!.right = TreeNode(45)

    root.right!!.left!!.left = TreeNode(52)
    root.right!!.left!!.right = TreeNode(57)

    root.right!!.right!!.left = TreeNode(65)
    root.right!!.right!!.right = TreeNode(80)

    //BFS().levelOrderTraversal(root)
    println()
    BFS().zigZagTraversal(root)
}