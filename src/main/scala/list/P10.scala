package list

import list.P09.pack

/**
  * P10 (*) Run-length encoding of a list.
  */
object P10 {

  def encode[A](list: List[A]): List[(Int, A)] = pack(list) map { e => (e.length, e.head) }

}
