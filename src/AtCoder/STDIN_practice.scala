package AtCoder

object STDIN_practice {
  def main(args: Array[String]) = {
    val sc = new java.util.Scanner(System.in)
    val n = sc.nextInt()
    val ls = Seq.fill(n)(sc.nextInt())

    println(n, ls)
  }
}
