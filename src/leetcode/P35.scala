package leetcode

object P35 {
  def main(args: Array[String]) = {
    println(searchInsert(Array(1,3,5,7), 3))//2
  }
  def searchInsert(nums: Array[Int], target: Int): Int = {
    if (nums.contains(target)) {
      nums.indexOf(target)
    } else {
      val sortedList = (nums :+ target).sorted
      sortedList.indexOf(target)
    }
  }

}
