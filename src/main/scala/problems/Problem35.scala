package dev.marconymous
package problems

import utils.Lib.isPrime

/**
 * The number, 197, is called a circular prime because all rotations of the digits: 197, 971, and 719, are themselves prime.
 *
 * There are thirteen such primes below 100: 2, 3, 5, 7, 11, 13, 17, 31, 37, 71, 73, 79, and 97.
 *
 * How many circular primes are there below one million?
 */
object Problem35 {
  def main(args: Array[String]): Unit = {
    val circularPrimeCount = (2 to 1_000_000).filter(isPrime).filter(isCircularPrime).toList.size
    println(s"Circular Primes: $circularPrimeCount")
  }

  def isCircularPrime(n: Int): Boolean = {
    def rotate(n: Int, by: Int): Int = {
      val s = n.toString
      val l = s.length
      val r = s.substring(by, l) + s.substring(0, by)
      r.toInt
    }

    for (i <- 1 to n.toString.length) {
      val rot = rotate(n, i)
      if (!isPrime(rot)) return false
    }

    true
  }
}
