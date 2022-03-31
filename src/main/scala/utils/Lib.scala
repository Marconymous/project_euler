package dev.marconymous
package utils

object Lib {
  def isPrime(a: Long): Boolean = {
    if (a == 1) false
    else if (a == 2) true
    else if (a % 2 == 0) false
    else {
      val limit = Math.sqrt(a).toInt
      (3 to limit by 2).forall(a % _ != 0)
    }
  }

  def factorial(a: Int): BigInt = {
    (1 to a).product
  }

  def binominal(n: Int, k: Int): BigInt =
    permutations(n) / (permutations(k) * permutations(n - k))

  def permutations(n: Int): BigInt =
    (1 to n).map(BigInt(_)).product

  def getDivisors(i: Int): List[Int] = {
    val divisors = for {
      j <- 1 to i
      if i % j == 0
    } yield j
    divisors.toList
  }

  def getProperDivisors(i: Int): List[Int] = {
    val divisors = for {
      j <- 1 until i
      if i % j == 0
    } yield j
    divisors.toList
  }
}
