package dev.marconymous
package problems

import utils.Lib

object Problem7 {

  def nthPrime(value: Int): Int = {
    val primes = Stream.from(2).filter(Lib.isPrime)
    primes.drop(value - 1).head
  }

  def main(args: Array[String]): Unit = {
    println(nthPrime(10001))
  }
}
