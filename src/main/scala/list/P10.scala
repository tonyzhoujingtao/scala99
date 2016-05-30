package list

import list.P09.pack

/**
  * P10 (*) Run-length encoding of a list.
  */
object P10 {

  def compress[A](packList: List[List[A]]): List[(Int, A)] = packList match {
    case Nil => Nil
    case head :: tail => (head.size, head.head) :: compress(tail)
  }

  def encode[A](list: List[A]): List[(Int, A)] = {
    compress(pack(list))
  }

}
