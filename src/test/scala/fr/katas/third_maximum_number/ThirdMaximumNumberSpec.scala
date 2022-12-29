package fr.katas.third_maximum_number

import org.scalatest.flatspec.AsyncFlatSpec
import org.scalatest.matchers.should.Matchers
import org.scalatest.{BeforeAndAfterAll, OptionValues}

class ThirdMaximumNumberSpec
    extends AsyncFlatSpec
    with Matchers
    with BeforeAndAfterAll
    with OptionValues {

  "An ThirdMaximumNumber" should "return a thirdMax 1 from [3,2,1]" in {
    val a = new ThirdMaximumNumber
    val array = Array(3,2,1)
    a.thirdMax(array) should be(1)
  }

  it should "return a thirdMax 1 from [1,2]" in {
    val a = new ThirdMaximumNumber
    val array = Array(1, 2)
    a.thirdMax(array) should be(2)
  }

  it should "return a thirdMax 1 from [2,2,3,1]" in {
    val a = new ThirdMaximumNumber
    val array = Array(2, 2, 3, 1)
    a.thirdMax(array) should be(1)
  }

  it should "return a thirdMax 1 from [1,1,2]" in {
    val a = new ThirdMaximumNumber
    val array = Array(1, 1, 2)
    a.thirdMax(array) should be(2)
  }

  it should "return a thirdMax 1 from [5,2,2]" in {
    val a = new ThirdMaximumNumber
    val array = Array(5, 2, 2)
    a.thirdMax(array) should be(5)
  }

  it should "return a thirdMax 1 from [1,2,-2147483648]" in {
    val a = new ThirdMaximumNumber
    val array = Array(1, 2, -2147483648)
    a.thirdMax(array) should be(-2147483648)
  }

  it should "return a thirdMax 1 from [-2147483648,1,1]" in {
    val a = new ThirdMaximumNumber
    val array = Array(-2147483648, 1, 1)
    a.thirdMax(array) should be(1)
  }

  it should "return a thirdMax 1 from [-2147483648,-2147483648,-2147483648,-2147483648,1,1,1]" in {
    val a = new ThirdMaximumNumber
    val array = Array(-2147483648,-2147483648,-2147483648,-2147483648,1,1,1)
    a.thirdMax(array) should be(1)
  }

}
