package list

/**
  * P06 (*) Find out whether a list is a palindrome, without using List.reverse
  */
object P06Easy {
  def isPalindrome[A](list: List[A]): Boolean = list == list.reverse
}
