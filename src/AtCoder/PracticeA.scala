package AtCoder

import scala.io.StdIn.{readInt, readLine}

object PracticeA {
  def main(args: Array[String]): Unit = {
    val a = readInt
    val bc = readLine
    val s = readLine
    val ans = a + bc.split(" ")(0).toInt + bc.split(" ")(1).toInt
    println(ans+" "+s)
  }

}
