package scala99problems

object P05 {
  def main(args: Array[String]): Unit = {
    println(reverse(List(1, 1, 2, 3, 5, 8)))
  }

  def reverse(value: List[Int]): List[Int] = {
    value.tail match {
      case Nil => value
      case _ :: _ => reverse(value.tail) :+ value.head
    }
  }
}
