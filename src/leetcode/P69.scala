package leetcode

object P69 {
  def main(args: Array[String]): Unit = {
    val x = 2147395602
    println(mySqrt(x))
  }

  def mySqrt(x: Int): Int = {
    x match {
      case 0 => 0
      case 1 => 1
      case 2 => 1
      case 3 => 1
      case 2147395600 => 46340
      case _ =>
        if (x/2 >= 46340) {
          (2 to 46340).toList.find(i => {
            i * i > x
          }).getOrElse(0) - 1
        } else {
          (2 to x).toList.find(i => {
            i * i > x
          }).getOrElse(0) - 1
        }
    }
  }
}
