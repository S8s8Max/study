package leetcode

object P1317 {
  def main(args: Array[String]) = {
    println(
      getNoZeroIntegers(11).mkString(",")
    )
  }

  def getNoZeroIntegers(n: Int): Array[Int] = {
    for {
      i <- 1 to n
      if !i.toString.contains('0')
      if !(n-i).toString.contains('0')
    } {
      return Array(i, n - i)
    }
    Array(0, 0)
  }
}
