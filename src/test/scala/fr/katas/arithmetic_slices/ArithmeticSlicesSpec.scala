package fr.katas.arithmetic_slices


import org.scalatest.{BeforeAndAfterAll, OptionValues}
import org.scalatest.flatspec.AsyncFlatSpec
import org.scalatest.matchers.should.Matchers

class ArithmeticSlicesSpec
    extends AsyncFlatSpec
    with Matchers
    with BeforeAndAfterAll
    with OptionValues {

  "An ArithmeticSlices" should "find one sequence" in {
    val a = new ArithmeticSlices
    val array = Array(7, 7, 7)
    a.numberOfArithmeticSlices(array) should be(1)
  }

  it should "find three sequence" in {
    val a = new ArithmeticSlices
    val array = Array(7, 7, 7, 7)
    a.numberOfArithmeticSlices(array) should be(3)
  }

  it should "find one sequence 2" in {
    val a = new ArithmeticSlices
    val array = Array(1, 7, 7, 7)
    a.numberOfArithmeticSlices(array) should be(1)
  }

  it should "find three sequence 2" in {
    val a = new ArithmeticSlices
    val array = Array(1, 2, 3, 4)
    a.numberOfArithmeticSlices(array) should be(3)
  }

  it should "find six sequences" in {
    val a = new ArithmeticSlices
    val array = Array(1, 2, 3, 4, 5)
    a.numberOfArithmeticSlices(array) should be(6)
  }

  it should "find two sequences" in {
    val a = new ArithmeticSlices
    val array = Array(1, 2, 3, 8, 9, 10)
    a.numberOfArithmeticSlices(array) should be(2)
  }
}
