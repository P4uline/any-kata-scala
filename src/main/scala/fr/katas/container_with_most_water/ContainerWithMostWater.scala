package fr.katas.container_with_most_water

class ContainerWithMostWater {

  def calculArea(height1: Int, height2: Int, first: Int, last: Int) = {
    val height = if(height1 > height2) height2 else height1
    val baseSize = Math.abs(first - last)
    height * baseSize
  }

  def maxArea(height: Array[Int]): Int = {
    var maxArea = 0
    var first = 0
    var last = height.length - 1
    while(last >= 0 && first < height.length) {
      val area = calculArea(height(first), height(last), first, last)
      if (maxArea < area)
        maxArea = area

      if (height(first) > height(last)) {
        last -= 1
      } else first += 1
    }
    maxArea
  }

}
