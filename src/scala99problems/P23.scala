package scala99problems

import scala99problems.P20.removeAt
import scala.util.Random

object P23 {
  def main(args: Array[String]): Unit = {
    println(randomSelect(7, List('a', 'b', 'c', 'd', 'e', 'f', 'g')))
  }

  def randomSelect(num: Int, ls: List[Char]): List[Char] = {
    if (num > ls.length) Nil
    else {
      val rand = new Random
      recRemove(num, ls, rand)
    }
  }

  def recRemove(num: Int, ls: List[Char], rand: Random): List[Char] = {
    num match {
      case x if x <= 0 => Nil
      case _ =>
        val targetIndex = rand.between(0, ls.length)
        ls(targetIndex) :: recRemove(num - 1, removeAt(targetIndex, ls)._1, rand)
    }
  }
}
