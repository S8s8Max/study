package leetcode

class TreeNode(_value: Int = 0, _left: TreeNode = null, _right: TreeNode = null) {
  var value: Int = _value
  var left: TreeNode = _left
  var right: TreeNode = _right
}
object P101 {
  def main(args: Array[String])= {
    val value = new TreeNode()
    println(isSynmetric(value))
  }


  def isSynmetric(root: TreeNode): Boolean = {
    def isMatched(left: TreeNode, right: TreeNode): Boolean = {
      (left, right) match {
        case (null, null) => true
        case (null, _) => false
        case (_, null) => false
        case (_, _) =>
          isMatched(left.left, right.right) &&
            isMatched(left.right, right.left)

      }
    }
    isMatched(root.left, root.right)
  }

}
