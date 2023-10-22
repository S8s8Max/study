package leetcode

object P1323 {
  def main(args: Array[String]) = {
    println(
      maximum69Number(9669)
    )
  }

  def maximum69Number(n: Int): Int = {
    n.toString match {
      case x if !x.contains('6') => x.toInt
      case x if x.length == 1 => 9
      case x @ _ => {
        val ls = x.toList
        val idx = ls.indexOf('6')
        (ls.slice(0, idx) ++ List('9') ++ ls.slice(idx + 1, ls.length))
          .mkString("").toInt
      }
    }
  }
}
