package list

import list.P01.last
import org.scalatest.{FlatSpec, ShouldMatchers}

class P01Spec extends FlatSpec with ShouldMatchers {
  "last" should "return the last element of a non empty list" in {
    val list = List(1, 2, 3, 4, 7)
    last(list) should be(7)
  }

  it should "throw NoSuchElementException for an empty list" in {
    val list = List()

    an[NoSuchElementException] should be thrownBy {
      last(list)
    }
  }
}
