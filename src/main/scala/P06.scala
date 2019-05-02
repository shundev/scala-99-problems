// P06
// Find out whether a list is a palindrome.
// Example:
// scala> isPalindrome(List(1, 2, 3, 2, 1))
// res0: Boolean = true

import scala.annotation.tailrec;

object P06 {
  def isPalindrome[T](list: List[T]): Boolean = list == list.reverse
}
