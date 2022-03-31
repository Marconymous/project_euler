package dev.marconymous
package problems

object Problem17 {
  def main(args: Array[String]): Unit = {
    println((1 to 1000).map(asWords).map(_.length).sum)
  }

  def ones = List("zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten", "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen")

  def tens = List("", "", "twenty", "thirty", "forty", "fifty", "sixty", "seventy", "eighty", "ninety")

  private def asWords(n: Int): String = {
    if (0 <= n && n <= 19)
      ones.apply(n)
    else if (20 <= n && n <= 99)
      tens(n / 10) + (if (n % 10 != 0) ones(n % 10) else "")
    else if (100 <= n && n <= 999)
      ones(n / 100) + "hundred" + (if (n % 100 != 0) "and" + asWords(n % 100) else "")
    else if (1000 <= n && n <= 999999)
      asWords(n / 1000) + "thousand" + (if (n % 1000 != 0) asWords(n % 1000) else "")
    else
      throw new IllegalArgumentException(s"Number out of range $n")
  }


}
