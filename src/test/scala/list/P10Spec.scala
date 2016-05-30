package list

import list.P10.encode
import org.scalatest.{FlatSpec, ShouldMatchers}

class P10Spec extends FlatSpec with ShouldMatchers {

  "encode" must "return an empty list when given an empty list" in {
    val list = List()
    encode(list) should be(Nil)
  }

  it must "return a list of a single tuple when given a list with one element" in {
    val list = List("a")
    encode(list) should be(List((1, "a")))
  }

  it must "return a list of a single tuple when given a list with two identical elements" in {
    val list = List("a", "a")
    encode(list) should be(List((2, "a")))
  }

  it must "return a list of two tuples when given a list with two distinct elements" in {
    val list = List("a", "b")
    encode(list) should be(List((1, "a"), (1, "b")))
  }

  it must "return a list of two tuples when given a list with two identical and one distinct elements" in {
    val list = List("a", "a", "b")
    encode(list) should be(List((2, "a"), (1, "b")))
  }

}
