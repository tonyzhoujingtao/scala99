package list

import list.P03.kth
import org.scalatest.{FlatSpec, ShouldMatchers}

class P03Spec extends FlatSpec with ShouldMatchers {
  "kth" must "return None when the List is empty" in {
    val list = List()
    kth(list, 1) should be(None)
  }

  it must "return Some element when index is in the range of the list" in {
    val list = List(1)
    kth(list, 0) should be(Some(1))
  }

  it must "return None when the index is not in the range of the list" in {
    val list = List(1)
    kth(list, 1) should be(None)
  }

  it must "return None when the index negative" in {
    val list = List(1)
    kth(list, -1) should be(None)
  }

}
