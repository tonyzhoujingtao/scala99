package list

import list.P09.pack
import org.scalatest.{FlatSpec, ShouldMatchers}

class P09Spec extends FlatSpec with ShouldMatchers {

  "pack" must "return an empty list when given an empty list" in {
    val list = List()
    pack(list) should be(Nil)
  }

  it must "return a list of a single list when given a list with only one element" in {
    val list = List('a')
    pack(list) should be(List(List('a')))
  }

  it must "return a list of two lists when given a list with two distinct elements" in {
    val list = List('a', 'b')
    pack(list) should be(List(List('a'), List('b')))
  }

  it must "return a list of one list when given a list with two identical elements" in {
    val list = List('a', 'a')
    pack(list) should be(List(List('a', 'a')))
  }

  it must "return a list of three lists when given a list with three non consecutively identical elements" in {
    val list = List('a', 'b', 'a')
    pack(list) should be(List(List('a'), List('b'), List('a')))
  }

}
