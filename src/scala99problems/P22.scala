package scala99problems

object P22 {
  def main(args: Array[String]): Unit = {
    println(range(4, 9))
  }

  def range(from: Int, to: Int): List[Int] = {
//    Range(from, to + 1).map(a => a).toList

//    List.range(from, to)

//    from match {
//      case x if x > to => Nil
//      case _ => List(from) ++ range(from + 1, to)
//    }

    if (from > to) Nil
    else from :: range(from + 1, to)
  }
}
