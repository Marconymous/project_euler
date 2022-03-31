package dev.marconymous
package problems

/**
 * 145 is a curious number, as 1! + 4! + 5! = 1 + 24 + 120 = 145.
 *
 * Find the sum of all numbers which are equal to the sum of the factorial of their digits.
 *
 * Note: As 1! = 1 and 2! = 2 are not sums they are not included.
 */
object Problem34 {
  def main(args: Array[String]): Unit = {
    val result = (3 to 1000000).filter(digitsFactorialSumToIt).sum
    println(result)
  }

  def digitsFactorialSumToIt(n: Int): Boolean = {
    val digits = n.toString.map(_.asDigit)
    val factorials = digits.map(utils.Lib.factorial).sum
    factorials == n
  }
}
