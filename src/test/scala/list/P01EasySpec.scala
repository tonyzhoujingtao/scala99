package list

import list.P01Easy.last
import org.scalatest.{FlatSpec, ShouldMatchers}

class P01EasySpec extends FlatSpec with ShouldMatchers {
  "last" should "return the last element of a non empty list" in {
    val list = List(1, 2, 3, 4, 7)
    last(list) should be(Some(7))
  }

  it should "return None for an empty list" in {
    val list = List()

    last(list) should be(None)
  }
}
