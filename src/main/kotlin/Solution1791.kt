class Solution1791 {
    fun findCenter(edges: Array<IntArray>): Int {
        var intersectValue = edges[0]
        for (arr in edges){
            intersectValue = intersectValue.intersect(arr.asIterable()).toIntArray()
        }
        return intersectValue[0]
    }
}

fun main() {
    val solution = Solution1791()
    val edges = arrayOf(intArrayOf(1, 2), intArrayOf(2, 3), intArrayOf(4, 2))
    println(solution.findCenter(edges))
}