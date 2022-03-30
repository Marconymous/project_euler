package dev.marconymous
package problems

import utils.Primes

object Problem7 {

  def nthPrime(value: Int): Int = {
    val primes = Stream.from(2).filter(Primes.isPrime)
    primes.drop(value - 1).head
  }

  def main(args: Array[String]): Unit = {
    println(nthPrime(10001))
  }
}
