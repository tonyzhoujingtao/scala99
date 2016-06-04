package list

import list.P13.encodeDirect
import org.scalatest.{FlatSpec, ShouldMatchers}

class P13Spec extends FlatSpec with ShouldMatchers {

  "encodeDirect" must "return an empty list when given an empty list" in {
    val list = List()
    encodeDirect(list) should be(Nil)
  }

  it must "return a list of a single tuple when given a list with one element" in {
    val list = List("a")
    encodeDirect(list) should be(List((1, "a")))
  }

  it must "return a list of a single tuple when given a list with two identical elements" in {
    val list = List("a", "a")
    encodeDirect(list) should be(List((2, "a")))
  }

  it must "return a list of two tuples when given a list with two distinct elements" in {
    val list = List("a", "b")
    encodeDirect(list) should be(List((1, "a"), (1, "b")))
  }

  it must "return a list of two tuples when given a list with two identical and one distinct elements" in {
    val list = List("a", "a", "b")
    encodeDirect(list) should be(List((2, "a"), (1, "b")))
  }

}
