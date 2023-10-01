package AtCoder

object ABC087B {
  def main(args: Array[String]): Unit = {
    val sc = new java.util.Scanner(System.in)
    val A, B, C, X = sc.nextInt()

    println(
      (for {
        a <- 0 to A
        b <- 0 to B
        c <- 0 to C
        if 500 * a + 100 * b + 50 * c == X
      } yield (a, b, c)).length
    )
  }
}
