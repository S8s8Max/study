package scala99problems

object P06 {
  def main(args: Array[String]): Unit = {
    println(isPalindrome(List(0,0,0,1)))
  }

  private def isPalindrome(value: List[Int]): Boolean ={
    value match {
      case Nil => true
      case _ =>
        if (value.head != value.last) false
        else isPalindrome(value.slice(1, value.length - 1))
    }
  }
}
