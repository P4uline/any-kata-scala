package fr.katas.third_maximum_number

class ThirdMaximumNumber {

  def thirdMax(nums: Array[Int]): Int = {

    if (nums.length == 1) {
      return nums(0)
    }

    if (nums.length == 2) {
      if (nums(0) > nums(1))
        return nums(0)
      else return nums(1)
    }

    val initValue = Int.MinValue
    var firstMax = initValue
    var secondMax = initValue
    var thirdMax = initValue
    var nbDuplicates = 0
    var countInitValue = 0

    for (i <- 0 to nums.length - 1) {
      if (nums(i) == firstMax ||
        nums(i) == secondMax ||
        nums(i) == thirdMax) {
        if (nums(i) != initValue) nbDuplicates += 1
      }
      if (nums(i) == initValue) {
        countInitValue += 1
      }
      if (nums(i) >= firstMax && nums(i) > secondMax && nums(i) > thirdMax) {
        if (nums(i) != firstMax) {
          thirdMax = secondMax
          secondMax = firstMax
          firstMax = nums(i)
        }
      } else if (nums(i) >= secondMax && nums(i) > thirdMax) {
        if (nums(i) != secondMax) {
          thirdMax = secondMax
          secondMax = nums(i)
        }
      } else if (nums(i) >= thirdMax) {
        if (nums(i) != thirdMax) {
          thirdMax = nums(i)
        }
      }
    }
    val duplicateInitValue = if (countInitValue > 0) countInitValue - 1 else 0
    if (nums.length - (nbDuplicates + duplicateInitValue) < 3) firstMax
    else thirdMax
  }

}
