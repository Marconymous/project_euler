package dev.marconymous
package problems

import utils.Lib.isPrime

/**
 * We shall say that an n-digit number is pandigital if it makes use of all the digits 1 to n exactly once. For example, 2143 is a 4-digit pandigital and is also prime.
 *
 * What is the largest n-digit pandigital prime that exists?
 */
object Problem41 {
  def main(args: Array[String]): Unit = {
    throw new Exception("Does not work correctly")
    val result = (1L to 10000000).filter(isPandigital).filter(isPrime).max

    println(result)
  }

  private def isPandigital(n: Long): Boolean = {
    val digits = n.toString.toCharArray.map(_.asDigit)
    val isPandigital = digits.length == digits.filter(x => 0 < x && x <= 9).distinct.length

    isPandigital
  }

}
