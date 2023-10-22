package leetcode

object P118 {
  //Input: numRows = 5
  //Output: [[1],[1,1],[1,2,1],[1,3,3,1],[1,4,6,4,1]]
  def main(args: Array[String]): Unit = {
    println(generate(5))
  }

  def generate(numRows: Int): List[List[Int]] = {
    numRows match {
      case 1 => List(List(1))
      case _ =>
        val previous = generate(numRows - 1)
        previous ++ List(calcNext(previous.last))
    }
  }

  def calcNext(ls: List[Int]) : List[Int] = {
    val middle = (for {
      i <- 1 until ls.length
    } yield ls(i-1) + ls(i)).toList
    List(1) ++ middle ++ List(1)
  }
}
