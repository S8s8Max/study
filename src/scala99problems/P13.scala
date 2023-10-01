package scala99problems

object P13 {
  def main(args: Array[String]): Unit = {
    println(
      encodeDirect(List('a', 'a', 'a', 'a', 'b', 'c', 'c', 'a', 'a', 'd', 'e', 'e', 'e'))
    )
    //List((4,'a), (1,'b), (2,'c), (2,'a), (1,'d), (3,'e))
  }

  def search2(value: List[Char]): List[(Int, Char)] = {
    value match {
      case Nil => List()
      case i :: Nil => List((1, i)) // 要素が一つの時
      case i :: rest =>
        if (i == rest.head) {
          val aa = search2(rest)
          List((aa.head._1 + 1, i))
        } else {
          List((1, i))
        }
    }
  }

  def encodeDirect(value: List[Char]): List[(Int, Char)] = {
    value match {
      case Nil => Nil
      case _ =>
        val a = search2(value)
        a ++ encodeDirect(value.slice(a.head._1, value.length))
    }

  }


}
