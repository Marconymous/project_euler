package dev.marconymous
package problems

import utils.Primes

object Problem10 {
  def main(args: Array[String]): Unit = {
    println((1 until 2000000).filter(Primes.isPrime).map(_.toLong).sum)
  }

}
