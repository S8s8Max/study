package scala99problems

object P15 {
  def main(args: Array[String]): Unit = {
    println(duplicateN(3, List('a', 'b', 'c', 'c', 'd')))
  }

  def duplicateN(times: Int, ls: List[Char]): List[Char] = {
    (for {
      i <- ls
      _ <- 1 to times
    } yield i).toList
  }
}
