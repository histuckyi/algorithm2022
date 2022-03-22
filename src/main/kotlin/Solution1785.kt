class Solution1785 {
    fun minElements(nums: IntArray, limit: Int, goal: Int): Int {
        val diff: Double = Math.abs(goal - nums.map{it.toDouble()}.sum())
        if (diff == 0.0) return 0
        var cnt = diff / limit
        if (0 < diff % limit) cnt += 1
        return cnt.toInt()
    }
}

fun main() {
    val solution = Solution1785()
    var nums = intArrayOf(1, -1, 1)
//    println(solution.minElements(nums, 3, -4)) // 2
//    nums = intArrayOf(1, -10, 9, 1)
//    println(solution.minElements(nums, 100, 0)) // 1
//    nums = intArrayOf(1, -10, 9, 1)
//    println(solution.minElements(nums, 20, 100)) // 5
//    println(solution.minElements(nums, 20, 200)) // 10
    nums = intArrayOf(100, 100, 100, 100, 100, 100, 100, 100, 100, 100)
    println(solution.minElements(nums, 100, -1000)) //
//    nums = intArrayOf(77)
//    println(solution.minElements(nums, 30, -35)) //
}