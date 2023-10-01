package leetcode

object P1 {
  def main(args: Array[String]): Unit = {
    val nums = scala.io.StdIn.readLine.split(' ').map(_.toInt)
    val target = scala.io.StdIn.readInt
    println(
      twoSum2(nums, target).toList
    )
  }

  // 3 3 4 5 -> (3,0), (3,1), (4,2), (5,3)
  // 5
  def twoSum(nums: Array[Int], target: Int): Array[Int] = {
    val candidates = nums.zipWithIndex.combinations(2).toArray
      .filter { pair => {
        pair.map(_._1).sum == target
      } }
    candidates(0).map(_._2)
  }

  def twoSum2(nums: Array[Int], target: Int): Array[Int] = {
    val zipped = nums.zipWithIndex
    val result = (for {
      n <- zipped
      pair <- zipped.collectFirst {
        case (a, b) if n._1 + a == target => (a, b)
      }
      if n != pair
    } yield (n._2, pair._2)).head
    Array(result._1, result._2)
  }
}
