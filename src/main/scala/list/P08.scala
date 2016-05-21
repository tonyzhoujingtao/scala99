package list

/**
  * P08 (**) Eliminate consecutive duplicates of list elements.
  */
object P08 {

  def compress[A](list: List[A]): List[A] = list match {
    case Nil => Nil
    case head :: tail => head :: compress(tail.dropWhile(_ == head))
  }

}
