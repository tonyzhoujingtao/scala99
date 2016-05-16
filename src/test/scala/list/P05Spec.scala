package list

import list.P05.reverse
import org.scalatest.{FlatSpec, ShouldMatchers}

class P05Spec extends FlatSpec with ShouldMatchers {

  "reverse" must "return an empty list when given an empty list" in {
    val list = List()
    reverse(list) should be(Nil)
  }

  it must "return the same list when there's only 1 element in the original list" in {
    val list = List(1)
    reverse(list) should be(List(1))
  }

  it must "return the list in reverse if there are more than 1 elements in the list" in {
    val list = List(1, 2)
    reverse(list) should be(List(2, 1))
  }

}
