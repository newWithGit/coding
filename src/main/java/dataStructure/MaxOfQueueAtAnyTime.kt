package dataStructure

import java.util.*

fun main() {
    checkQueue()
}

/*
 * Insert element into queue
 * if queue is empty enqueue in maxQ
 * maxQ
 *  if peekLast < element to insert
 *      dequeue all the elements from maxQ which are less that ele
 *  add ele in maxQ
 *  return
 *
 * Remove an element from queue
 * if element is in front of maxQ remove it
 */

fun checkQueue() {
    val q = ArrayDeque<Int>()
    var maxQ = ArrayDeque<Int>()
    maxQ = addEle(maxQ, q, 4)
    println(maxQ)
    maxQ = addEle(maxQ, q, 5)
    println(maxQ)
    maxQ = addEle(maxQ, q, 9)
    println(maxQ)
    maxQ = addEle(maxQ, q, 6)
    println(maxQ)
    maxQ = addEle(maxQ, q, 8)
    println(maxQ)
    maxQ = addEle(maxQ, q, 2)
    println(maxQ)


}

fun removeSmallerElements(maxQ: ArrayDeque<Int>, q: ArrayDeque<Int>, ele: Int): ArrayDeque<Int> {
    val q = ArrayDeque<Int>()
    maxQ.filter{it>=ele}.toCollection(q)
    //println(q)
    return q
}

fun addEle(maxQ: ArrayDeque<Int>, q: ArrayDeque<Int>, ele: Int): ArrayDeque<Int> {
    q.offerLast(ele)
    val updated = ArrayDeque<Int>()
    if (!maxQ.isEmpty() && maxQ.peekLast() < ele) {
        maxQ.offerLast(ele)
        return removeSmallerElements(maxQ, updated, ele)
    }
    maxQ.offerLast(ele)
    return maxQ
}

fun removeEle(maxQ: ArrayDeque<Int>, q: ArrayDeque<Int>, ele: Int) {
    if (ele == q.peekFirst())
        q.remove()
    if (ele == maxQ.peekFirst())
        maxQ.remove()
}