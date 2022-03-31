package dev.marconymous
package problems

import utils.Lib.getProperDivisors

object Problem23 {
  val abundantNrs: List[Int] = getAllAbundantNumbers(28123)

  def main(args: Array[String]): Unit = {
    println(abundantNrs)
    println((1 to 28123).filter(n => !asTwoAbundantNumbers(n)).map(BigInt(_)).sum)
  }

  private def asTwoAbundantNumbers(i: Int): Boolean = {
    for (a <- abundantNrs) {
      for (b <- abundantNrs) {
        if (a + b == i) {
          return true
        }
      }
    }

    false
  }

  def getAllAbundantNumbers(limit: Int): List[Int] = {
    (12 to limit).filter(isAbundant).toList
  }

  def isAbundant(i: Int): Boolean = {
    val divisors = getProperDivisors(i)
    divisors.sum > i
  }


}
