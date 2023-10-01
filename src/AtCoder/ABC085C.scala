package AtCoder

object ABC085C extends App {
  val input = scala.io.StdIn.readLine.split(' ').map(_.toInt).toList
  val N = input.head
  val Y = input(1)
  for {
    tt <- 0 to N
    ft <- 0 to N - tt
    t = N - tt - ft
  } {
    if (tt * 10000 + ft * 5000 + t * 1000 == Y) {
      println(s"$tt $ft $t")
      System.exit(0)
    }
  }
  println("-1 -1 -1")

}
