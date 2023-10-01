package AtCoder

object ABC083B extends App {
  val sc = new java.util.Scanner(System.in)
  val N, A, B = sc.nextInt()

  val result = for {
    n <- 1 to N
    sum_str_n = n.toString.toList.map(_.asDigit).sum
    if sum_str_n >= A && sum_str_n <= B
  } yield n
  println(result.sum)
}
