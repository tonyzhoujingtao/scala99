package list

import list.P04.measure
import org.scalatest.{FlatSpec, ShouldMatchers}

class P04EasySpec extends FlatSpec with ShouldMatchers {

  "length" must "return 0 when given an empty list" in {
    val list = List()
    measure(list) should be(0)
  }

  it must "return 1 when there's 1 element in the list" in {
    val list = List(1)
    measure(list) should be(1)
  }

}
