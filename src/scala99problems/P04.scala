package scala99problems

object P04 {
  def main(args: Array[String]): Unit = {
    println(length(List(1, 1, 2, 3, 5, 8)))
    println(length_recursive(List(1, 1, 2, 3, 5, 8)))
  }

  private def length(value: List[Int]) = {
    value.length
  }

  private def length_recursive(value: List[Int]): Int = {
    value match {
      case Nil => 0
      case _ :: rest => 1 + length_recursive(rest)
    }
  }
}
