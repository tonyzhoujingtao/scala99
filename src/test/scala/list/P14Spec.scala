package list

import list.P14.duplicate
import org.scalatest.{FlatSpec, ShouldMatchers}

class P14Spec extends FlatSpec with ShouldMatchers {

  "duplicate" must "return an empty list when given an empty list" in {
    val list = List()
    duplicate(list) should be(Nil)
  }

  it must "return a list of two identical elements when given a list with only one element" in {
    val list = List("a")
    duplicate(list) should be(List("a", "a"))
  }

  it must "return a list of two pairs of repeated elements when given a list with two distinct elements" in {
    val list = List("a", "b")
    duplicate(list) should be(List("a", "a", "b", "b"))
  }

  it must "return a list of 4 identical elements when given a list of two identical elements" in {
    val list = List("a", "a")
    duplicate(list) should be(List("a", "a", "a", "a"))
  }

}
