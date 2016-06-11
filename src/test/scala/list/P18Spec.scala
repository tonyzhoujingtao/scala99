package list

import list.P18.slice
import org.scalatest.{FlatSpec, ShouldMatchers}

class P18Spec extends FlatSpec with ShouldMatchers {

  "slice" must "return an empty list when given any start and end and an empty list" in {
    val list = List()
    slice(3, 7, list) should be(Nil)
  }

  "slice" must "return a list of one element when given 0 as start and 1 as end and a list of one element" in {
    val list = List("a")
    slice(0, 1, list) should be(List("a"))
  }

  "slice" must "behave correctly according to the example" in {
    slice(3, 7, List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k)) should be(List('d, 'e, 'f, 'g))
  }

}
