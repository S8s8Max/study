package scala99problems

object P08 {
  def main(args: Array[String]): Unit = {
    println(compress(List('a', 'a', 'a', 'a', 'b', 'c', 'c', 'a', 'a', 'd', 'e', 'e', 'e', 'e')))
  }

  def compress(value: List[Char]): List[Char] = {
    value.tail match {
      case Nil => Nil
      case _ =>
        if (value.head != value.tail.head) {
          value.head +: compress(value.tail)
        } else {
          compress(value.tail)
        }
    }
  }
}
