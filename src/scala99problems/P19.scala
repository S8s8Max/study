package scala99problems

object P19 {
  def main(args: Array[String]): Unit = {
    println(rotate(3,
      List('a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k')))
    println(rotate(-2,
      List('a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k')))
  }

  def rotate(num: Int, ls: List[Char]): List[Char] = {
    if (num > 0) {
      ls.slice(num, ls.length) ++ ls.slice(0, num)
    } else if (num == 0) {
      ls
    } else {
      ls.slice(ls.length + num, ls.length) ++ ls.slice(0, ls.length + num)
    }
  }
}
