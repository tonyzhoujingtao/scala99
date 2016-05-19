package list

/**
  * P03 (*) Find the Kth element of a list.
  */
object P03Easy {
  def kth[A](list: List[A], k: Int): Option[A] = list match {
    case Nil => None
    case l if l.size > k && k >= 0 => Some(l(k))
    case _ => None
  }
}
