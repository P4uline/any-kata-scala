package fr.katas.add_strings

import org.scalatest.flatspec.AsyncFlatSpec
import org.scalatest.matchers.should.Matchers
import org.scalatest.{BeforeAndAfterAll, OptionValues}

class AddStringsSpec
    extends AsyncFlatSpec
    with Matchers
    with BeforeAndAfterAll
    with OptionValues {

  "An AddStrings" should "find 134 adding 11 and 123" in {
    val a = new AddStrings
    val num1 = "11"
    val num2 = "123"
    a.addStrings(num1, num2) should be("134")
  }

  it should "find 533 adding 77 and 456" in {
    val a = new AddStrings
    val num1 = "77"
    val num2 = "456"
    a.addStrings(num1, num2) should be("533")
  }

  it should "find 10 adding 1 and 9" in {
    val a = new AddStrings
    val num1 = "1"
    val num2 = "9"
    a.addStrings(num1, num2) should be("10")
  }

  it should "find 108 adding 99 and 9" in {
    val a = new AddStrings
    val num1 = "99"
    val num2 = "9"
    a.addStrings(num1, num2) should be("108")
  }
}
