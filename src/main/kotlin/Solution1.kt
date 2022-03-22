class Solution1 {
    fun twoSum(nums: IntArray, target: Int): IntArray {
        val intMaps = hashMapOf<Int, Int>()
        val ans = IntArray(2)
        for (i in 0 until (nums.size)){
            if(intMaps.containsKey(target - nums[i])){
                ans[0] = intMaps.get(target - nums[i])!!
                ans[1] = i
                return ans
            }
            intMaps.put(nums[i], i)
        }
        return ans

//        val intMaps = hashMapOf<Int, MutableList<Int>>()
//        val numsIndices = nums.withIndex()
//        for ((idx, v) in numsIndices) {
//            if (intMaps.containsKey(v)) {
//                intMaps.get(v)?.add(idx)
//            } else {
//                intMaps[v] = mutableListOf(idx)
//            }
//        }
//
//        for ((idx, v) in numsIndices) {
//            var findV = target - v
//            if (intMaps.containsKey(findV)) {
//                // findV와 v의 값이 같은 경우 해당 index가 2개인지 확인 후 반환
//                if (findV == v){
//                    if (intMaps[findV]!!.size == 2)
//                        return intMaps[findV]!!.toIntArray()
//                    else
//                        continue
//                }
//                return intArrayOf(idx, intMaps[findV]!![0])
//            }
//        }
//        return intArrayOf(2)
    }
}

fun main() {
    val solution = Solution1()
    var nums = intArrayOf(3, 2, 4)
    nums = intArrayOf(2,7,11,15)
//    nums = intArrayOf(3, 3)
    println(solution.twoSum(nums, 26).joinToString(","))
}