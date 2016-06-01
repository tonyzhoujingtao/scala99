package list

/**
  * P12 (**) Decode a run-length encoded list.
  *
  * Given a run-length code list generated as specified in problem P10, construct its uncompressed version.
  */
object P12 {

  def decode[A](list: List[(Int, A)]): List[A] = list match {
    case Nil => Nil
    case head :: tail => List.fill(head._1)(head._2) ::: decode(tail)
  }


  def decode2[A](list: List[(Int, A)]): List[A] = list flatMap { e => List.fill(e._1)(e._2) }

}
