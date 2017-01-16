package list

/**
  * P01 (*) Find the last element of a list, without using List.last
  */
object P01 {
  def last[A](list: List[A]): Option[A] = list match {
    case a :: Nil => Some(a)
    case _ :: tail => last(tail)
    case _ => None
  }
}
