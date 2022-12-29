package fr.katas.reverse_integer

import org.scalatest.{BeforeAndAfterAll, OptionValues}
import org.scalatest.flatspec.AsyncFlatSpec
import org.scalatest.matchers.should.Matchers

class ReverseIntegerSpec
    extends AsyncFlatSpec
    with Matchers
    with BeforeAndAfterAll
    with OptionValues {

  "A ReverseInteger" should "revert 123 to 321" in {
    r.reverse3(123) should be(321)
  }

  it should "revert -123 to -321" in {
    r.reverse3(-123) should be(-321)
  }

  it should "revert 1534236469 to 9646324351" in {
    r.reverse3(1534236469) should be(0)
  }

  it should "revert -2147483412 to -2143847412" in {
    r.reverse3(-2147483412) should be(-2143847412)
  }

  it should "reverst -2147483648 to 0" in {
    println(Int.MaxValue)
    println(Int.MinValue)
    r.reverse3(-2147483648) should be(0)
  }

  val r = new ReverseInteger
}
