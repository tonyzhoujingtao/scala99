package list

/**
  * P09 (**) Pack consecutive duplicates of list elements into sublists.
  */
object P09 {

  def pack[A](list: List[A]): List[List[A]] = list match {
    case Nil => Nil
    case _ => {
      val (first, rest) = list span (_ == list.head)
      rest match {
        case Nil => List(first)
        case _ => first :: pack(rest)
      }
    }
  }

}
