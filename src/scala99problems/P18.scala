package scala99problems

object P18 {
  def main(args: Array[String]): Unit = {
    println(sliceList(3, 7,
      List('a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k')))
  }

  def sliceList(from: Int, to: Int,  ls: List[Char]): List[Char] = {
    ls.slice(from, to)
  }
}
