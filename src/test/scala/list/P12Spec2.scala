package list

import list.P12.decode2
import org.scalatest.{FlatSpec, ShouldMatchers}

class P12Spec2 extends FlatSpec with ShouldMatchers {

  "decode2" must "return an empty list when given an empty list" in {
    val list = List()
    decode2(list) should be(Nil)
  }

  it must "return a list of one element when given a list of tuple of one element" in {
    val list = List((1, "a"))
    decode2(list) should be(List("a"))
  }

  it must "return a list of multiple elements when given a list of multiple tuples" in {
    val list = List((2, "a"), (4, "c"), (3, "e"))
    decode2(list) should be(List("a", "a", "c", "c", "c", "c", "e", "e", "e"))
  }

}
