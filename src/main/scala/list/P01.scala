package list

object P01 {
  def last[A](list: List[A]): A = list.last

  def last2[A](list: List[A]): A = list match {
    case a :: Nil => a
    case a :: tail => last2(tail)
    case _ => throw new NoSuchElementException
  }
}
