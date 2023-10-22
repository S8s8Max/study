package scala99problems

object P26 {
  def main(args: Array[String]) = {
    println(combinations(
      3, List('a', 'b', 'c', 'd', 'e', 'f')
    ))
  }

  //
  def combinations(n: Int, ls: List[Char]): List[List[Char]] = {
    val listOfCombinations = Map()
    List(aaa(n, ls))
  }

  def aaa(times: Int, from: List[Char]): List[Char] = {
    times match {
      case 0 => Nil
      case _ =>
        aaa(times - 1, from.tail)
    }
  }
}
