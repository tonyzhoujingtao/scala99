package list

/**
  * P18 (**) Extract a slice from a list.
  * Given two indices, I and K, the slice is the list containing the elements from and including the Ith
  * element up to but not including the Kth element of the original list. Start counting the elements with 0.
  */
object P18 {

  def slice[A](start: Int, end: Int, list: List[A]): List[A] = list.slice(start, end)

}
