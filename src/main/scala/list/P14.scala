package list

/**
 * P14 (*) Duplicate the elements of a list.
 *
 * Implement the so-called run-length encoding data compression method directly.
 * I.e. don't use other methods you've written (like P09's pack); do all the work directly.
 */
object P14 {

  def duplicate[A](list: List[A]): List[A] = list match {
    case Nil => Nil
    case head :: tail => List(head, head) ::: duplicate(tail)
  }

}
