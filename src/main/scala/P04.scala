// P04
// Find the number of elements of a list.
// Example:
// scala> length(List(1, 1, 2, 3, 5, 8))
// res0: Int = 6

import scala.annotation.tailrec

object P04 {
  def length2[T](list: List[T]): Int = list match {
    case Nil => 0
    case x::xs => 1 + length(xs)
  }

  def length[T](list: List[T]): Int = {

    @tailrec
    def rec(lst: List[T], acc: Int): Int = lst match {
      case Nil => acc
      case x::xs => rec(xs, acc + 1)
    }

    rec(list, 0)
  }
}
