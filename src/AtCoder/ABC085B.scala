package AtCoder

object ABC085B extends App {
  val N = scala.io.StdIn.readInt
  var ls: Array[Int] = Array()
  for (_ <- 1 to N) {
    ls :+= scala.io.StdIn.readInt
  }
  println(counter(ls.sorted(Ordering.Int.reverse).toList) + 1)

  def counter(ls: List[Int]): Int = {
    ls.tail match {
      case Nil => 0
      case _ =>
        if (ls.head > ls.tail.head) 1 + counter(ls.tail)
        else counter(ls.tail)
    }
  }
}

//object Main extends App {
//  val N = scala.io.StdIn.readInt
//  var ls: Array[Int] = Array()
//  for (_ <- 1 to N) {
//    ls :+= scala.io.StdIn.readInt
//  }
//  ls = ls.sorted(Ordering.Int.reverse)
//  var count = 1
//  for (i <- 0 until ls.length - 1) {
//    if (ls(i) > ls(i + 1)) {
//      count += 1
//    }
//  }
//  println(count)
//}
