package list

import scala.annotation.tailrec

/**
  * P03 (*) Find the Kth element of a list, without using List.apply().
  */
object P03 {
  @tailrec
  def kth[A](list: List[A], k: Int): Option[A] = list match {
    case Nil => None
    case head :: tail => k match {
      case 0 => Some(head)
      case a if a > 0 => kth(tail, k - 1)
      case _ => None
    }
  }
}
