package list

import list.P06Easy.isPalindrome
import org.scalatest.{FlatSpec, ShouldMatchers}

class P06EasySpec extends FlatSpec with ShouldMatchers {

  "isPalindrome" must "return true when given an empty list" in {
    val list = List()
    isPalindrome(list) should be(true)
  }

  it must "return false when there are 2 unequal elements in the list" in {
    val list = List(1, 2)
    isPalindrome(list) should be(false)
  }

  it must "return true when there are 2 equal elements in the list" in {
    val list = List(1, 1)
    isPalindrome(list) should be(true)
  }

  it must "return true when the palindrome has 3 elements" in {
    val list = List(1, 2, 1)
    isPalindrome(list) should be(true)
  }

  it must "return true when the palindrome has 4 elements" in {
    val list = List(1, 2, 2, 1)
    isPalindrome(list) should be(true)
  }


}
