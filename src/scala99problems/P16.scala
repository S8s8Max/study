package scala99problems

object P16 {
  def main(args: Array[String]): Unit = {
    println(drop(3,
      List('a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k')))
  }

  def drop(nth: Int, ls: List[Char]): List[Char] = {
    val result = for {
      i <- ls.zipWithIndex
      if (i._2 + 1) % nth != 0
    } yield i._1
    result
  }
}
