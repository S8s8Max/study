package scala99problems

object P01 {
  def main(args: Array[String]): Unit = {
    println(last(List(1, 1, 2, 3, 5, 8)))
  }
  def last(l: List[Int]) = l.last

}
