package scala99problems

object P07 {
  def main(args: Array[String]): Unit = {
    // ideal output: List(1, 1, 2, 3, 5, 8)
    println(flatten(List(List(1, 1), 2, List(3, List(5, 8)))))
  }

  private def flatten(value: List[Any]): List[Any] =
    value flatMap {
      case e: List[_] => flatten(e)
      case a => List(a)
    }

}
