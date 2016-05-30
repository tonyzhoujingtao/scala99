package list

import list.P11.encode2
import org.scalatest.{FlatSpec, ShouldMatchers}

class P11Spec extends FlatSpec with ShouldMatchers {

  "encode2" must "return an empty list when given an empty list" in {
    val list = List()
    encode2(list) should be(Nil)
  }

  it must "return a one element list when given a one element list" in {
    val list = List("a")
    encode2(list) should be(List("a"))
  }

  it must "return a one element list when given a two identical elements list" in {
    val list = List("a", "a")
    encode2(list) should be(List((2, "a")))
  }

  it must "return a three elements list when given a three distinct elements list" in {
    val list = List("a", "b", "a")
    encode2(list) should be(List("a", "b", "a"))
  }

  it must "return a three elements list when given a four elements list with 2 identical element in middle" in {
    val list = List("a", "b", "b", "a")
    encode2(list) should be(List("a", (2, "b"), "a"))
  }


}
