package dev.marconymous
package problems

/**
 * Surprisingly there are only three numbers that can be written as the sum of fourth powers of their digits:
 * 1634 = 14 + 64 + 34 + 44
 * 8208 = 84 + 24 + 04 + 84
 * 9474 = 94 + 44 + 74 + 44
 * As 1 = 14 is not a sum it is not included.
 *
 * The sum of these numbers is 1634 + 8208 + 9474 = 19316.
 *
 * Find the sum of all the numbers that can be written as the sum of fifth powers of their digits.
 */
object Problem30 {
  def main(args: Array[String]): Unit = {
    println(s"Problem 30: ${sumOfDigits(5)}")
  }

  def sumOfDigits(power: Int): Long = {
    (2 to 1_000_000).filter(isSumOfDigits(_, power)).sum
  }

  def isSumOfDigits(n: Int, power: Int): Boolean = {
    val digits = n.toString.map(_.asDigit)
    val sum = digits.map(scala.math.pow(_, power).toLong).sum
    sum == n
  }
}
