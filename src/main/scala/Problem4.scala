package dev.marconymous

object Problem4 {
  def isPalindrome(n: Int): Boolean = {
    val s = n.toString
    s == s.reverse
  }

  def largestPalindrome(n: Int): Int = {
    val max = Math.pow(10, n).toInt
    val min = Math.pow(10, n - 1).toInt

    (max to min by -1).flatMap(i => (i to min by -1).map(j => i * j)).filter(isPalindrome).max
  }

  def main(args: Array[String]): Unit = {
    println(largestPalindrome(3))
  }
}
