package leetcode

object P88 {
  def merge(nums1: Array[Int], m: Int, nums2: Array[Int], n: Int): Unit = {
    if (nums1.length == 1) {
      if (nums1(0) == 0) {
        nums1(0) = nums2(0)
      }
    }
    else {
      val result = (nums1.slice(0, nums1.length - n) ++ nums2).sorted

      for (i <- nums1.indices) {
        nums1(i) = result(i)
      }
    }
    println(nums1.mkString("[", ",", "]"))
  }

  def main(args: Array[String]): Unit = {
    val nums1 = Array(1,2,3,0,0,0)
    val nums2 = Array(2,5,6)
    val m = 3
    val n = 3
    merge(nums1, m, nums2, n)
  }

}
