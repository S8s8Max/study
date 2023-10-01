package leetcode

object P09 {
  def main(args: Array[String]): Unit = {
    println(isPalindrome(1221))
  }

  def isPalindrome(i: Int): Boolean = {
    if (i < 0) false
    else {
      isPalindromeAsString(i.toString.toList)
    }
  }

  def isPalindromeAsString(x: List[Char]): Boolean = {
    x match {
      case Nil => true
      case rest =>
        if (rest.head != rest.last) false
        else isPalindromeAsString(rest.slice(1, rest.length - 1))
    }
  }
}
