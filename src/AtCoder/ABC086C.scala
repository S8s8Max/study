
object ABC086C extends App {
  val N = scala.io.StdIn.readInt
  val plans = (for {
    _ <- 1 to N
    ls = scala.io.StdIn.readLine.split(' ').map(_.toInt).toList
  } yield ls).toList

  if (!plans.exists(passedPremiseCheck)) {val result = "NO"}
  else if (false){val result = ""}
  else {val result = ""}
//  println(result)

  def isAvailableLocation(ls: List[Int]): Boolean = {
    false
  }

  def passedPremiseCheck(plan: List[Int]): Boolean = {
    if (plan.head < plan.tail.sum) true
    else if (plan.head % 2 != plan.tail.sum % 2) true
    else false
  }
}
