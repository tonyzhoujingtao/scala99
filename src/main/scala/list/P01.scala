package list

/**
  * P01 (*) Find the last element of a list without using List.last
  */
object P01 {
  def last[A](list: List[A]): A = list match {
    case a :: Nil => a
    case a :: tail => last(tail)
    case _ => throw new NoSuchElementException
  }
}
