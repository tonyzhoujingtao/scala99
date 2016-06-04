package list

/**
  * P13 (**) Run-length encoding of a list (direct solution).
  *
  * Implement the so-called run-length encoding data compression method directly.
  * I.e. don't use other methods you've written (like P09's pack); do all the work directly.
  */
object P13 {

  def encodeDirect[A](list: List[A]): List[(Int, A)] =
    if (list.isEmpty) Nil
    else {
      val (first, rest) = list span (_ == list.head)
      (first.size, first.head) :: encodeDirect(rest)
    }

}
