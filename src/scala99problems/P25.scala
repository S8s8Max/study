package scala99problems

import scala99problems.P23.randomSelect

object P25 {
  def main(args: Array[String]) = {
    println(randomPermute(
      List('a', 'b', 'c', 'd', 'e', 'f')
    ))
  }

  def randomPermute(ls: List[Char]): List[Char] = {
    randomSelect(ls.length, ls)
  }
}
