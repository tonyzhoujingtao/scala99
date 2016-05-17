package list

import list.P01.last

import scala.annotation.tailrec

/**
  * P02 (*) Find the last but one element of a list, without using List.takeRight.
  */
object P02 {
  def penultimate[A](list: List[A]): Option[A] = penultimate(list, 1)

  @tailrec
  private def penultimate[A](list: List[A], index: Int): Option[A] = index match {
    case 0 => last(list)
    case i if i > 0 => list match {
      case Nil => None
      case front :+ back => penultimate(front, index - 1)
    }
    case _ => None
  }
}
