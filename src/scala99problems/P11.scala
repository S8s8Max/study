package scala99problems

import scala99problems.P09.pack

object P11 {
  def main(args: Array[String]): Unit = {
    println(encodeModified(List('a', 'a', 'b', 'c', 'c', 'a', 'a', 'd', 'e', 'e')))
  }

  def encodeModified(value: List[Char]): List[Any] = {
    val packed = pack(value)
    packed.map {
      case y if y.length == 1 => y.head
      case z => (z.length, z.head) // 束縛する
    }
  }
}
