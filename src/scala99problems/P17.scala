package scala99problems

object P17 {
  def main(args: Array[String]): Unit = {
    println(splitList(3,
      List('a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k')))
  }

  def splitList(part: Int, ls: List[Char]): (List[Char], List[Char]) = {
    (ls.slice(0, part), ls.slice(part, ls.length))
  }
}
