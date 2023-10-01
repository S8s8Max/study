package AtCoder

object ABC086A extends App {
    import scala.io.StdIn.readLine
    val ab = readLine
    val a = ab.split(" ")(0).toInt
    val b = ab.split(" ")(1).toInt
    println(List("Even", "Odd")((a * b) % 2))
}
