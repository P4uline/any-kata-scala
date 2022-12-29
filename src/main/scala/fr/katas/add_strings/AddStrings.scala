package fr.katas.add_strings

class AddStrings {

  def calculateCarry(sum: Int): Int = {
    if (sum >= 10) 1
    else 0
  }

  def addStrings(num1: String, num2: String): String = {
    var shorter = num1
    var longer = num2

    if (num1.length > num2.length) {
      shorter = num2
      longer = num1
    }

    var list = List[String]()

    var carry = 0
    var longerIndex = longer.length - 1
    for (i <- (shorter.length - 1) to 0 by -1) {
      println(i)
      val a = toInt(shorter.charAt(i))
      val b = toInt(longer.charAt(longerIndex))
      println(s"a ${a} b ${b}")

      val sum = a + b + carry
      carry = calculateCarry(sum)
      val unit = sum % 10
      list = unit.toString :: list
      println(s"$a $b $sum $carry $unit")
      longerIndex -= 1
    }

    for (j <- longerIndex to 0 by -1) {
      val a = toInt(longer.charAt(j))
      val sum = a + carry
      println(s"$a $sum $carry")
      carry = calculateCarry(sum)
      list = (sum % 10).toString :: list
    }

    if (carry > 0)
      list = carry.toString :: list

    list.mkString
  }

  private def toInt(char: Char) = {
    char.toString.toInt
  }
}
