package list

import list.P17.split
import org.scalatest.{FlatSpec, ShouldMatchers}

class P17Spec extends FlatSpec with ShouldMatchers {

  "split" must "return a tuple of two empty lists when given any N and an empty list" in {
    val list = List()
    split(3, list) should be((Nil, Nil))
  }

  it must "return a tuple of a list of one element and an empty list when given 1 as length of the first part and a list of one element" in {
    val list = List("a")
    split(1, list) should be((List("a"), Nil))
  }

  it must "return a tuple of an empty list and a list of one element when given 0 as length of the first part and a list of one element" in {
    val list = List("a")
    split(0, list) should be((Nil, List("a")))
  }

  it must "return a tuple of an empty list and a list of one element when given a negative number as length of the first part and a list of one element" in {
    val list = List("a")
    split(-1, list) should be((Nil, List("a")))
  }

  it must "return a tuple of a list of one element and an empty list when given 2 as length of the first part and a list of one element" in {
    val list = List("a")
    split(2, list) should be((List("a"), Nil))
  }

}
