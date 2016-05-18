package list

import list.P02Easy.penultimate
import org.scalatest.{FlatSpec, ShouldMatchers}

class P02EasySpec extends FlatSpec with ShouldMatchers {
  "penultimate" should "return the last but one element of a list when there are at least 2 elements" in {
    val list = List(4, 7)
    penultimate(list) should be(Some(4))
  }

  it should "return None when there is only 1 elements" in {
    val list = List(1)
    penultimate(list) should be(None)
  }

  it should "return None when the list is empty" in {
    val list = List()
    penultimate(list) should be(None)
  }
}
