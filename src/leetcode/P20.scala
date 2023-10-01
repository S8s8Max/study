package leetcode

object P20 {
  def main(args: Array[String]): Unit = {
    val str = "()[]{}"

    println(isValid(str))

    /** 1. ({)} false
      * 2. ([{  false
      * 3. ([]{([{}])}()) true
      */
  }

  def isValid(s: String): Boolean = {
    import scala.collection.mutable
    val pairs = Map(
      ')' -> '(',
      ']' -> '[',
      '}' -> '{')
    val stack = new mutable.Stack[Char](s.length)

    s.foreach {
      case c if pairs.contains(c) =>
        if (s.isEmpty | pairs(c) != stack.pop()) return false
      case c => stack.push(c)
    }
    stack.isEmpty
  }
}
