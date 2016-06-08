package list

/**
 * P15 (**) Duplicate the elements of a list a given number of times.
 */
object P15 {

  def duplicateN[A](duplications: Int, list: List[A]): List[A] = list flatMap {
    List.fill(duplications)(_)
  }

}
