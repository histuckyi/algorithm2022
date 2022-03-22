import java.util.*

//https://leetcode.com/problems/maximum-average-pass-ratio/discuss/1620345/Java-Solution-or-O(m-log-n)

class Solution1792 {
    fun maxAverageRatio(classes: Array<IntArray>, extraStudents: Int): Double {
        val pq = PriorityQueue { a: IntArray, b: IntArray ->
            val ratio1 = (a[0] + 1).toDouble() / (a[1] + 1) - a[0].toDouble() / a[1]
            val ratio2 = (b[0] + 1).toDouble() / (b[1] + 1) - b[0].toDouble() / b[1]
            ratio2.compareTo(ratio1)
        }
        for (exam in classes) {
            pq.offer(exam)
        }
        for (i in 1..extraStudents) {
            val topValue = pq.poll()
            topValue[0] += 1
            topValue[1] += 1
            pq.offer(intArrayOf(topValue[0], topValue[1]))
        }
        var total = 0.0
        var count = 0
        while (!pq.isEmpty()) {
            val pop = pq.poll()
            //System.out.println(Arrays.toString(pop));
            total += pop[0].toDouble() / pop[1]
            count += 1
        }
        return total / count
    }
}

fun main() {
    // [[1,2],[3,5],[2,2]]
    // 2,4],[3,9],[4,5],[2,10
    var solution = Solution1792()
    var classes = arrayOf(intArrayOf(1, 2), intArrayOf(3, 5), intArrayOf(2, 2))
    classes =  arrayOf(intArrayOf(2, 4), intArrayOf(3, 9), intArrayOf(4, 5), intArrayOf(2, 10))
    println(solution.maxAverageRatio(classes, 4))
}