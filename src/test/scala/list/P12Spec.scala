package list

import list.P12.decode
import org.scalatest.{FlatSpec, ShouldMatchers}

class P12Spec extends FlatSpec with ShouldMatchers {

  "decode" must "return an empty list when given an empty list" in {
    val list = List()
    decode(list) should be(Nil)
  }

  it must "return a list of one element when given a list of tuple of one element" in {
    val list = List((1, "a"))
    decode(list) should be(List("a"))
  }

  it must "return a list of multiple elements when given a list of multiple tuples" in {
    val list = List((2, "a"), (4, "c"), (3, "e"))
    decode(list) should be(List("a", "a", "c", "c", "c", "c", "e", "e", "e"))
  }

}
