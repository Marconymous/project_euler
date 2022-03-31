package dev.marconymous
package problems

/**
 * The decimal number, 585 = 10010010012 (binary), is palindromic in both bases.
 *
 * Find the sum of all numbers, less than one million, which are palindromic in base 10 and base 2.
 *
 * (Please note that the palindromic number, in either base, may not include leading zeros.)
 */
object Problem36 {
  def main(args: Array[String]): Unit = {
    val result = (1 until 1000000).filter(isPalindromeInBase10And2).sum
    println(result)
  }

  def isPalindromeInBase10And2(n: Int): Boolean = {
    val base10 = n.toString
    val base2 = n.toBinaryString
    base10 == base10.reverse && base2 == base2.reverse
  }
}
