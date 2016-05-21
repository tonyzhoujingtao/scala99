package list

import list.P07.flatten
import org.scalatest.{FlatSpec, ShouldMatchers}

class P07Spec extends FlatSpec with ShouldMatchers {

  "flatten" must "return an empty list when given an empty list" in {
    val list = List()
    flatten(list) should be(Nil)
  }

  it must "return an empty list when given a list with an embedded empty list" in {
    val list = List(List())
    flatten(list) should be(Nil)
  }

  it must "return flatten list with 1 elements when given a list with one element and an embedded empty list" in {
    val list = List(1, List())
    flatten(list) should be(List(1))
  }

  it must "return flatten list with 2 elements when given a list with one element and an embedded list with one element" in {
    val list = List(1, List(2))
    flatten(list) should be(List(1, 2))
  }

  it must "return flatten list with 3 elements when given a list with two elements and an embedded list with one element" in {
    val list = List(1, 3, List(2))
    flatten(list) should be(List(1, 3, 2))
  }

}
