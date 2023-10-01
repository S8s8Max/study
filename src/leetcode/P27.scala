package leetcode

object P27 {
  def main(args: Array[String]): Unit = {
    val nums = Array(0,1,2,4,5,3,2)
    val `val` = 2
    removeElement(nums, `val`)
  }

  // return nums which `val` is removed and the length of nums.
  def removeElement(nums: Array[Int], `val`: Int): Int = {
    var to = 0
//    for (i <- 0 to nums.length) {
//      if (nums(i) == `val`) {
//
//      }
//    }
    val k = nums.count(a => a != `val`)
    k
  }
}
