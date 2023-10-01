package scala99problems

object P03 {
  def main(args: Array[String]): Unit = {
    println(nth(5, List(1, 1, 2, 3, 5, 8)))
  }

  def nth(n:Int, ls: List[Int]): Int = {
    if (n == 0) ls.head else {
      nth(n-1, ls.tail)
    }
  }
}
