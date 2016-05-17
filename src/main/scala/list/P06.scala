package list

/**
  * P06 (*) Find out whether a list is a palindrome, without using List.reverse
  */
object P06 {
  def isPalindrome[A](list: List[A]): Boolean = list match {
    case Nil => true
    case s :: tail => tail match {
      case Nil => true
      case front :+ e if s == e => isPalindrome(front)
      case _ => false
    }
    case _ => false
  }
}
