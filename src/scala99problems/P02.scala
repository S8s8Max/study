package scala99problems

object P02 {
  def main(args: Array[String]): Unit = {
    println(lastNthRecursive(2, List(1, 5, 8, 3, 4, 6, 9)))
  }
  def penultimate[A](ls: List[A]): A = ls match {
    case h :: _ :: Nil  => h
    case _ :: x => penultimate(x)
    case _         => throw new NoSuchElementException
  }

  // Here's one approach to a non-builtin solution.
  def lastNthRecursive[A](n: Int, ls: List[A]): A = {
    def lastNthR(count: Int, resultList: List[A], curList: List[A]): A = {
      println(count, resultList, curList)
      curList match {
        case Nil if count > 0 => throw new NoSuchElementException
        case Nil              => resultList.head
        case _ :: tail        =>
          lastNthR(count - 1, if (count > 0) resultList else resultList.tail, tail)
      }
    }

    if (n <= 0) throw new IllegalArgumentException
    else lastNthR(n, ls, ls)
  }
}
