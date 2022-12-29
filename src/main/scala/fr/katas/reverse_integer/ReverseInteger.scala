package fr.katas.reverse_integer

import scala.collection.mutable

class ReverseInteger {

  def biggerThanMaxInt(string: String): Boolean = {
    val maxInt = Int.MaxValue.toString
    if (string.length > maxInt.length) return true
    else if (string.length < maxInt.length) return false
    for (i <- 0 to string.length) {
      if (string(i).toString.toInt > maxInt(i).toString.toInt)
        return true
      else if (string(i).toString.toInt < maxInt(i).toString.toInt)
        return false
    }
    false
  }

  def reverse(x: Int): Int = {
    var tenMultipleIndex = 10
    val queue = mutable.Queue[Int]()
    val positive = if (x > 0) true else false
    val number: Int = if (positive) x else -1 * x

    println(s"$x $number $tenMultipleIndex ${x % tenMultipleIndex}")

    while (number % tenMultipleIndex != number && tenMultipleIndex <= 100000000) {
      queue += extractDigit(number, tenMultipleIndex)
      tenMultipleIndex = tenMultipleIndex * 10
    }

    // Don't forget the last one
    queue += extractDigit(number, tenMultipleIndex)

    // Special case for number bigger than 1000000000 because 10000000000 is bigger than MaxInt
    if (number > 1000000000) {
      val lastDigit = number / 1000000000
      println(s"last digit $lastDigit")
      queue += lastDigit
    }
    val string = queue.mkString
    println(string)
    if (biggerThanMaxInt(string)) return 0
    val result = string.toInt
    if (positive) result
    else result * -1
  }

  private def extractDigit(x: Int, tenMultipleIndex: Int): Int = {
    // Calculate the previous ten multiple to do the integer division
    val index = tenMultipleIndex / 10

    // do an integer division to keep the left digit :
    // Ex :  x = 123
    // 123 % 10 / 1 = 3 with index = 1 tenMultipleIndex = 10
    // 123 % 100 / 10 = 2 with index = 10 tenMultipleIndex = 100
    // 123 % 1000 / 100 = 1 with index = 100 tenMultipleIndex = 1000
    val i = x % tenMultipleIndex / index
    println(s"$i = $x % $tenMultipleIndex / $index")
    i
  }

  def reverse2(x: Int): Int = { // FIXME : not finished
    if (x > Int.MaxValue || x < Int.MinValue) return 0
    val xString = x.toString
    val positive = if (x > 0) true else false
    val lastIndex = if (positive) 0 else if (xString.length > 1) 1 else 0
    val reversed = s"""${(for(i <- xString.length - 1 to lastIndex by -1) yield {s"${xString(i)}"}).mkString}"""

    val result = if (positive) reversed.toLong else reversed.toLong * -1
    if (positive && result > Int.MaxValue) 0
    else if (!positive && result > (Int.MinValue * -1)) 0
    else result.toInt
  }

  def reverse3(x: Int): Int = {
    var reversed: Long = 0
    var number = x
    while (number != 0) {
      reversed = reversed * 10 + (number % 10)
      number = number / 10
    }
    if (reversed > Int.MaxValue || reversed < Int.MinValue) return 0
    reversed.toInt
  }

}
