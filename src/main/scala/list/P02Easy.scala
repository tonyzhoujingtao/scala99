package list

/**
  * P02 (*) Find the last but one element of a list.
  */
object P02Easy {
  def penultimate[A](list: List[A]): Option[A] = list match {
    case Nil => None
    case head :: Nil => None
    case _ => Some(list(list.size - 2))
  }
}
