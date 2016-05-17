package list

import scala.annotation.tailrec

/**
  * P04 (*) Find the number of elements of a list without using List.size or List.length
  */
object P04 {
  def measure[A](list: List[A]): Int = measure(list, 0)

  @tailrec
  private def measure[A](list: List[A], total: Int): Int = list match {
    case Nil => total
    case head :: tail => measure(tail, total + 1)
  }
}
