package list

import list.P15.duplicateN
import org.scalatest.{FlatSpec, ShouldMatchers}

class P15Spec extends FlatSpec with ShouldMatchers {

  "duplicateN" must "return an empty list when given an empty list" in {
    val list = List()
    duplicateN(3, list) should be(Nil)
  }

  it must "return a list of 1 elements when given 1 duplication and a list of one element" in {
    val list = List("a")
    duplicateN(1, list) should be(List("a"))
  }

  it must "return a list of 3 identical elements when given 3 duplication and a list of one element" in {
    val list = List("a")
    duplicateN(3, list) should be(List("a", "a", "a"))
  }

  it must "return a list of 6 identical elements when given 3 duplication and a list of two elements" in {
    val list = List("a", "b")
    duplicateN(3, list) should be(List("a", "a", "a", "b", "b", "b"))
  }

}
