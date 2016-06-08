package list

import list.P16.drop
import org.scalatest.{FlatSpec, ShouldMatchers}

class P16Spec extends FlatSpec with ShouldMatchers {

  "drop" must "return an empty list when given any N and an empty list" in {
    val list = List()
    drop(3, list) should be(Nil)
  }

  it must "return a list of 1 element when given 2 as N and a list of two elements" in {
    val list = List("a", "b")
    drop(2, list) should be(List("a"))
  }

  it must "return a list of 2 element when given 2 as N and a list of three elements" in {
    val list = List("a", "b", "c")
    drop(2, list) should be(List("a", "c"))
  }

  it must "return an empty list when given 1 as N and a list of three elements" in {
    val list = List("a", "b", "c")
    drop(1, list) should be(Nil)
  }

}
