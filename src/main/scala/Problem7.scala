package dev.marconymous

object Problem7 {
  def isPrime(a: Int): Boolean = {
    if (a == 1) false
    else if (a == 2) true
    else if (a % 2 == 0) false
    else {
      val limit = Math.sqrt(a).toInt
      (3 to limit by 2).forall(a % _ != 0)
    }
  }

  def nthPrime(value: Int): Int = {
    val primes = Stream.from(2).filter(isPrime)
    primes.drop(value - 1).head
  }

  def main(args: Array[String]): Unit = {
    println(nthPrime(10001))
  }
}
