package AtCoder

object ABC081B extends App {
  val a = scala.io.StdIn.readInt
  val nums = scala.io.StdIn.readLine.split(' ').map(_.toInt)

  def countTimesDivideAll(nums: Array[Int]): Int = {
    if (!nums.forall(_ % 2 == 0) | nums.contains(0)) 0
    else 1 + countTimesDivideAll(nums.map(_ / 2))
  }

  println(countTimesDivideAll(nums))
}
