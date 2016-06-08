package list

/**
 * P14 (*) Duplicate the elements of a list.
 */
object P14 {

  def duplicate[A](list: List[A]): List[A] = list match {
    case Nil => Nil
    case head :: tail => List(head, head) ::: duplicate(tail)
  }

}
