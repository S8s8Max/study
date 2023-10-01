package scala99problems

import scala99problems.P09.pack

object P10 {
  def main(args: Array[String]): Unit = {
    println(encode(List('a', 'a', 'a', 'a', 'b', 'c', 'c', 'a', 'a', 'd', 'e', 'e', 'e', 'e')))
    //List((4,'a), (1,'b), (2,'c), (2,'a), (1,'d), (4,'e))
  }

  def encode(value: List[Char]): List[(Int, Char)] = {
    val packed = pack(value)
    packed.map { x =>
      (x.length, x.head)
    }
  }
}
