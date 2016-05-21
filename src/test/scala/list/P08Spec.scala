package list

import list.P08.compress
import org.scalatest.{FlatSpec, ShouldMatchers}

class P08Spec extends FlatSpec with ShouldMatchers {

  "compress" must "return an empty list when given an empty list" in {
    val list = List()
    compress(list) should be(Nil)
  }

  it must "return the same non empty list when given a list with no repeated elements" in {
    val list = List(1, 2)
    compress(list) should be(List(1, 2))
  }

  it must "return the list no consecutively repeated elements when given a list with repeated elements" in {
    val list = List(1, 1)
    compress(list) should be(List(1))
  }
}
