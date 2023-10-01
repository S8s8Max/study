package leetcode
object P14 extends App {
  val strs = scala.io.StdIn.readLine.split(' ').toList
  val prefixList = getAllSet(strs)

  val result = (for {
    p <- prefixList
    if strs.forall(_.slice(0,p.length) == p)
  } yield p) match {
    case Nil => ""
    case _ @ ls => ls.maxBy(_.length)
  }

  println(result)
  def getAllSet(strs: List[String]): List[String] = {
    val str = strs.head.toArray.toList
    (for {
      i <- 1 to str.length
      targets = str.combinations(i).map(_.mkString("")).toList
      target <- targets
      if strs.head.head == target.head
    } yield target).toList
  }
}
