package list

/**
  * P01 (*) Find the last element of a list.
  */
object P01Easy {
  def last[A](list: List[A]): Option[A] = list match {
    case Nil => None
    case _ => Some(list.last)
  }
}
