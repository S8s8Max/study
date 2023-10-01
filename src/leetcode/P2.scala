package leetcode

/**
 * Definition for singly-linked list.
 * class ListNode(_x: Int = 0, _next: ListNode = null) {
 *   var next: ListNode = _next
 *   var x: Int = _x
 * }
 */

object P2 {
  class ListNode(_x: Int = 0, _next: ListNode = null) {
    var next: ListNode = _next
    var x: Int = _x
  }

  def main(args: Array[String]) = {
    val l1 = new ListNode(2, new ListNode(4, new ListNode(9)))
    val l2 = new ListNode(5, new ListNode(6, new ListNode(4, new ListNode(9))))
    println(
      toNumString(addTwoNumbers(l1, l2))
    )
  }

  def addTwoNumbers(l1: ListNode, l2: ListNode): ListNode = {
    val sum = toNumString(l1).reverse.toLong + toNumString(l2).reverse.toLong
    toNode(sum.toString.reverse)
  }

  def toNumString(nodes: ListNode): String = {
    nodes.next match {
      case null => nodes.x.toString
      case _ => nodes.x.toString + toNumString(nodes.next)
    }
  }

  def toNode(x: String): ListNode = {
    x.length match {
      case 1 => new ListNode(x.head.asDigit)
      case _ => new ListNode(x.head.asDigit, toNode(x.tail))
    }
  }
}
