package scala99problems

object P21 {
  def main(args: Array[String]): Unit = {
    println(insertAt("new", 6, List('a', 'b', 'c', 'd')))
  }

  def insertAt(str: String, i: Int, ls: List[Char]): List[Any] = {
    ls.slice(0,i) ++ List(str) ++ ls.slice(i,ls.length)
  }
}
