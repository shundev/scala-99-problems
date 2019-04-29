// P03
// Find the Kth element of a list.
// By convention, the first element in the list is element 0.
// Example:
// 
// scala> nth(2, List(1, 1, 2, 3, 5, 8))
// res0: Int = 2

object P03 {
  def nth[T](index: Int, list: List[T]): T = list match {
    case x::xs if index == 0 => x
    case _::xs if index > 0 => nth(index - 1, xs)
    case _ => sys.error("not found.")
  }
}
