// P05
// Reverse a list.
// Example:
// scala> reverse(List(1, 1, 2, 3, 5, 8))
// res0: List[Int] = List(8, 5, 3, 2, 1, 1)
//

import scala.annotation.tailrec

object P05 {
  def reverse[T](list: List[T]): List[T] = {
    @tailrec
    def rec[T](lst: List[T], acc: List[T]): List[T] = lst match {
      case Nil => acc
      case x::xs => rec(xs, x :: acc)
    }

    rec(list, Nil)
  }
}
