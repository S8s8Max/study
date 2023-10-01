

object P70 {
  val memo: Map[Int, Int] = Map()
  def main(args: Array[String]) = {
    println(climbStairs(45))
  }

//  @tailrec
  def climbStairs(n: Int): Int = {
    n match {
      case -1 => 0
      case 0 => 1
      case _ =>
        if (memo contains n) memo(n)
        else {
          val result = climbStairs(n - 1) + climbStairs(n - 2)
          memo + (n -> result)
          result
        }
    }
  }
}
