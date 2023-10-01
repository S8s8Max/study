package scala99problems

object P12 {
  def main(args: Array[String]): Unit = {
    println(decode(Seq((4,'a'), (1,'b'), (2,'c'), (2,'a'), (1,'d'), (4,'e'))))
    // List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e)
  }

  def decode(value: Seq[(Int, Char)]): Seq[Char] = {
    for {
      n <- value
      _ <- 1 to n._1
    } yield n._2
  }
}
