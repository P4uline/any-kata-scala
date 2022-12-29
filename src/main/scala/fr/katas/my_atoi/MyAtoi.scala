package fr.katas.my_atoi

class MyAtoi {

  def myAtoi(s: String): Int = {
    var str = s
    // Base condition
    if (str.isEmpty()) {
      return 0
    }
    // MAX and MIN values for integers
    val max = 2147483647
    val min = -2147483648
    // Trimmed string
    str = str.replaceAll("^\\s+", "")
    // Counter
    var i = 0
    // Flag to indicate if the number is negative
    val isNegative: Boolean = str.startsWith("-")
    // Flag to indicate if the number is positive
    val isPositive: Boolean = str.startsWith("+")
    if (isNegative) {
      i += 1
    } else if (isPositive) {
      i += 1
    }
    // This will store the converted number
    var number = 0.0
    // Loop for each numeric character in the string iff numeric characters are leading
    // characters in the string
    while (i < str.length && str(i) >= '0' && str(i) <= '9') {
      number = number * 10 + (str(i) - '0')
      i += 1
    }
    // Give back the sign to the converted number
    number = if (isNegative) -number else number
    if (number < min) {
      return min
    }
    if (number > max) {
      max
    } else number.toInt
  }

}
