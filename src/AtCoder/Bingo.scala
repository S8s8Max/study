package AtCoder

object Bingo extends App {
  val row1 = scala.io.StdIn.readLine().split(' ').toList.map(_.toInt)
  val row2 = scala.io.StdIn.readLine().split(' ').toList.map(_.toInt)
  val row3 = scala.io.StdIn.readLine().split(' ').toList.map(_.toInt)
  val N = scala.io.StdIn.readInt()
  val allSet = (for {
    _ <- 1 to N
  } yield scala.io.StdIn.readInt()).toList.combinations(3).toList

  val bingoCond = List(
    row1, row2, row3,
    List(row1.head, row2.head, row3.head),
    List(row1.last, row2.last, row3.last),
    List(row1(1), row2(1), row3(1)),
    List(row1.head, row2(1), row3.last),
    List(row1.last, row2(1), row3.head)
  )

  if ((for {
    set <- allSet
    cond <- bingoCond
  } yield set.forall(cond.contains(_))).contains(true)) {
    println("Yes")
  } else {
    println("No")
  }
}
