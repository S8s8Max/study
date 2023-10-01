package scala99problems

import scala.util.Random

object P24 {
  def main(args: Array[String]) = {
    println(lotto(8, 5))
  }

  def lotto(n: Int, m: Int): List[Int] = {
    val rand = new Random
    selectRandomInteger(n, m, rand)

    // randomSelect(n, List.range(1, m + 1))
  }

  private def selectRandomInteger(n: Int, m: Int, rand: Random): List[Int] = {
    n match {
      case 0 => Nil
      case _ =>
        rand.between(1, m) :: selectRandomInteger(n - 1, m, rand)
    }
  }

}
