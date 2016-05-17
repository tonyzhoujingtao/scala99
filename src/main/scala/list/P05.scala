package list

/**
  * P05 (*) Reverse a list, without using List.reverse
  */
object P05 {
  def reverse[A](list: List[A]): List[A] = list match {
    case Nil => Nil
    case head :: tail => reverse(tail) :+ head
  }
}
