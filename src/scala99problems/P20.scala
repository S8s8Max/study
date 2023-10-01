package scala99problems

object P20 {
  def main(args: Array[String]): Unit = {
    println(removeAt(3,
      List('a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k')))
  }

  def removeAt(at: Int, ls: List[Char]): (List[Char], Char) = {
    (ls.zipWithIndex.filter(_._2 != at).map(_._1), ls(at))
  }
}
