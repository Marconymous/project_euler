package dev.marconymous
package problems

import utils.Lib.isPrime

import scala.annotation.tailrec

/**
 * The number 3797 has an interesting property. Being prime itself, it is possible to continuously remove digits from left to right, and remain prime at each stage: 3797, 797, 97, and 7. Similarly we can work from right to left: 3797, 379, 37, and 3.
 *
 * Find the sum of the only eleven primes that are both truncatable from left to right and right to left.
 *
 * NOTE: 2, 3, 5, and 7 are not considered to be truncatable primes.
 */
object Problem37 {
  def main(args: Array[String]): Unit = {
    val result = (11 to 1000000).filter(isPrime).filter(isTruncatablePrime).sum

    println(result)
  }

  def isTruncatablePrime(n: Int): Boolean = {
    @tailrec
    def testDirection(splice: String => String, str: String = n.toString): Boolean = {
      val r = splice(str)
      if (r.isEmpty) true
      else if (!isPrime(r.toInt)) false
      else testDirection(splice = splice, str = r)
    }

    testDirection(_.substring(1)) && testDirection(s => s.substring(0, s.length - 1))
  }
}
