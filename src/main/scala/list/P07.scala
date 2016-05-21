package list

/**
  * P07 (**) Flatten a nested list structure.
  */
object P07 {
  def flatten(list: List[Any]): List[Any] = list flatMap {
    case l: List[_] => flatten(l)
    case e => List(e)
  }
}
