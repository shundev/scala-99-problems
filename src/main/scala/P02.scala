// P02
// Find the last but one element of a list.
// Example:
// scala> penultimate(List(1, 1, 2, 3, 5, 8))
// res0: Int = 5
//

object P02 {
  def penultimate[T](list: List[T]): T = list match {
    case x::Nil => sys.error("no elements.")
    case x::y::Nil => y
    case x::y::xs => penultimate(xs)
    case _ => sys.error("no elements.")
  }
}
