// https://leetcode.com/problems/check-if-one-string-swap-can-make-strings-equal/
class Solution1790 {
    // 한번만 바뀐지 체크해야 함
    // 바뀐지 체크해야 함
    // 다른 게 있으면 반드시 string 종료 전까지 완료되어야 함
    fun areAlmostEqual(s1: String, s2: String): Boolean {
        var firstIdx = -1
        var isSwapped = false
        var swappedDone = false
        for ((idx, s) in s1.withIndex()) {
            if (s != s2[idx]) {
                // 이미 교체 완료
                if (swappedDone) return false
                // 교체된 것을 확인
                if (isSwapped) {
                    if (s1[firstIdx] != s2[idx] || s != s2[firstIdx]) return false
                    swappedDone = true
                } else {
                    // 교체 첫 문자임
                    isSwapped = true
                    firstIdx = idx
                }
            }

        }
        // 교체되었다면 완료되었는지, 교체가 안되었는지
        return (isSwapped && swappedDone) || (!isSwapped)
    }
}

fun main() {
    var s1 = "bank"
    var s2 = "kanb"
    s1 = "attack"
    s2 = "defend"
    s1 = "aa" // false
    s2 = "ac"
    s1 = "npv" // false
    s2 = "zpn"
    s1 = "ii" // false
    s2 = "xi"
    s1 = "baaa"
    s2 = "abbb"
    val solution = Solution1790()
    println(solution.areAlmostEqual(s1, s2))
}