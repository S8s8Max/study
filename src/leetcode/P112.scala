//package leetcode
//
//class TreeNode(_value: Int = 0, _left: TreeNode = null, _right: TreeNode = null) {
//  var value: Int = _value
//  var left: TreeNode = _left
//  var right: TreeNode = _right
//}
//
//object P112 {
//  def main(args:Array[String]): Unit = {
//    val tree = new TreeNode()
//    val num = 9
//    println(hasPathSum(tree, num))
//  }
//
//  def hasPathSum(root: TreeNode, targetSum: Int): Boolean = {
//    root match {
//      case null => false
//      case _ =>
//        val diff = targetSum - root.value
//        diff match {
//          case 0 if root.left == null & root.right == null => true
//          case x if root.left == null & root.right == null => false
//          case _ =>
//            hasPathSum(root.left, diff) ||
//              hasPathSum(root.right, diff)
//        }
//    }
//  }
//}
