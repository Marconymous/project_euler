package dev.marconymous
package utils

object Primes {
  def isPrime(a: Int): Boolean = {
    if (a == 1) false
    else if (a == 2) true
    else if (a % 2 == 0) false
    else {
      val limit = Math.sqrt(a).toInt
      (3 to limit by 2).forall(a % _ != 0)
    }
  }
}
