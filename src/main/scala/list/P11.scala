package list

import list.P10.encode

/**
  * P11 (*) Modified run-length encoding.
  *
  * Modify the result of problem P10 in such a way that if an element has no duplicates it is simply copied into the
  * result list. Only elements with duplicates are transferred as (N, E) terms.
  */
object P11 {

  def encode2[A](list: List[A]): List[Any] = encode(list) map { e => if (e._1 > 1) e else e._2 }

}
