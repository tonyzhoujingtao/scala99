package list

import list.P04.measure
import org.scalatest.{FlatSpec, ShouldMatchers}

class P04Spec extends FlatSpec with ShouldMatchers {

  "length" must "return 0 when given an empty list" in {
    val list = List()
    measure(list) should be(0)
  }

  it must "return 1 when there's 1 element in the list" in {
    val list = List(1)
    measure(list) should be(1)
  }

  //  it must "return the list in reverse if there are more than 1 elements in the list" in {
  //    val list = List(1, 2)
  //    reverse(list) should be(List(2, 1))
  //  }

}
