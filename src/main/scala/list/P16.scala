package list

/**
 * P16 (**) Drop every Nth element from a list.
 */
object P16 {

  def drop[A](n: Int, list: List[A]): List[A] = list match {
    case Nil => Nil
    case _ => list.slice(0, n - 1) ::: drop(n, list.drop(n))
  }

}
