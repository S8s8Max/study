package scala99problems

object P14 {
  def main(args: Array[String]): Unit = {
    println(duplicate(List('a', 'b', 'c', 'c', 'd')))
  }

  def duplicate(ls: List[Char]): List[Char] = {
    val times = 2
    (for {
      i <- ls
      _ <- 1 to times
    } yield i).toList
  }
}
