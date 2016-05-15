package list

/**
  * P03 (*) Find the Kth element of a list.
  */
object P03 {
  def kth[A](list: List[A], k: Int): Option[A] = list match {
    case Nil => None
    case _ if list.size > k => Some(list(k))
    case _ => None
  }
}
