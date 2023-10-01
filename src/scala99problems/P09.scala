package scala99problems

object P09 {
  def main(args: Array[String]) = {
//    List(List('a, 'a, 'a, 'a), List('b), List('c, 'c), List('a, 'a), List('d), List('e, 'e, 'e, 'e))
    println(pack(List('a', 'a', 'a', 'a', 'b', 'c', 'c', 'a', 'a', 'd', 'e', 'e', 'e', 'e')))
//    println(pack(List('a', 'a', 'a', 'b', 'c', 'c', 'd')))
  }

  def pack(value: List[Char]): List[List[Char]] = {
    value match {
      case Nil => Nil
      case _ =>
        val result = search(value)
        List(result) ++ pack(value.slice(result.length, value.length))
    }
  }

  def search(value: List[Char]): List[Char] ={
    value match {
      case Nil => List()
      case i :: Nil => List(i) // 要素が一つの時
      case i :: rest =>
        if (i == rest.head) {
          i +: search(rest)
        } else {
          List(i)
        }
    }
  }
}
