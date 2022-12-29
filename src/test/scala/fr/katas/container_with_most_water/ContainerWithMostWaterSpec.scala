package fr.katas.container_with_most_water

import org.scalatest.{BeforeAndAfterAll, OptionValues}
import org.scalatest.flatspec.AsyncFlatSpec
import org.scalatest.matchers.should.Matchers

class ContainerWithMostWaterSpec
    extends AsyncFlatSpec
    with Matchers
    with BeforeAndAfterAll
    with OptionValues {

  "A ContainerWithMostWater" should "return 49 from input [1,8,6,2,5,4,8,3,7]" in {
    val height = Array(1,8,6,2,5,4,8,3,7)
    c.maxArea(height) should be(49)
  }

  val c = new ContainerWithMostWater

}
