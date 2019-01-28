package grofers

// sequence to find numbers as sum of k numbers
class Queue (k: Int) {

    val maxSize = k

    var queue: MutableList<Int>;

    init {
        queue = ArrayList(k)
    }

    fun enque(element: Int) {
        if (queue.size == maxSize)
            deque()
        queue.add(element)
    }

    fun deque() {
        if (queue.isNotEmpty())
            queue.removeAt(0);
    }

    fun findSum() = queue.sum()

    fun size() = queue.size
}

fun findSum(k: Int) {
    val q = Queue(k)

    var i = 1
    do {
        if (q.size() != q.maxSize) {
            i++
        }
        else {
            i = q.findSum()
        }
        q.enque(i)
        print("${i} ")
    } while (i < 1000)
}

fun main() {
    findSum(5)
}