package AtCoder

object ABC049C extends App {
  val S = scala.io.StdIn.readLine
  "^(dream|dreamer|erase|eraser)+$".r.matches(S) match {
    case true => println("YES")
    case _ => println("NO")
  }}
//  def checkS(s: String): Boolean = {
//    s.length match {
//      case x if x < 5 => false
//      case 5 if s == "dream" || s == "erase" => true
//      case 6 if s == "eraser" => true
//      case 7 if s == "dreamer" => true
//      case _ if s.slice(0,5) == "erase" || s.slice(0, 6) == "eraser" =>
//        checkS(s.slice(5, s.length)) || checkS(s.slice(6, s.length))
//      case _ if s.slice(0,5) == "dream" || s.slice(0, 7) == "dreamer" =>
//        checkS(s.slice(5, s.length)) || checkS(s.slice(7, s.length))
//      case _ => false
//    }
//  }
//  checkS(S) match {
//    case true => println("YES")
//    case _ => println("NO")
//  }
