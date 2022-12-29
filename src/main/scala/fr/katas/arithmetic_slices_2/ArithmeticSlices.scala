package fr.katas.arithmetic_slices_2

class ArithmeticSlices {

  def numberOfArithmeticSlices(nums: Array[Int]): Int = {
    if (nums.length < 3) return 0

    var beforePrevious = nums(0)
    var previous = nums(1)
    var current = nums(2)
    var sequenceSize = 2 // Not started sequence

    var newSequence = false
    var result = 0
    for (i <- 2 to nums.length - 1) {
      current = nums(i)
      println(s"$beforePrevious $previous $current")

      if (current - previous == previous - beforePrevious) {
        // Same sequence
        sequenceSize += 1
        newSequence = false
        // Last sequence
        if (i == nums.length - 1) {
          result += calculateSubSequencesNumber(sequenceSize)
        }
      } else {
        // New Sequence
        newSequence = true
        // Add the previous sequenceSize in sequences
        result += calculateSubSequencesNumber(sequenceSize)
        sequenceSize = 2 // Not started sequence
      }

      beforePrevious = previous
      previous = current
    }
    result
  }

  private def calculateSubSequencesNumber(currentSequenceSize: Int) = {
    val n = currentSequenceSize - 2
    n * (n + 1) / 2
  }

}
