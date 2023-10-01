package AtCoder

object ABC088B extends App {
  val N = scala.io.StdIn.readInt
  val cards = scala.io.StdIn.readLine.split(' ').map(_.toInt).sorted(Ordering.Int.reverse).toList
  val alice = cards.zipWithIndex.filter(_._2 % 2 == 0).map(_._1).sum
  val bob = cards.zipWithIndex.filter(_._2 % 2 == 1).map(_._1).sum
  println(alice-bob)
}
