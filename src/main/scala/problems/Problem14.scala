package dev.marconymous
package problems

import java.util.Date

object Problem14 {
  def main(args: Array[String]): Unit = {
    println((1 to 1000000).map(collatz).maxBy(_._2))
  }

  private def collatz(i: Int): (Int, Int) = {
    var steps = 0
    var n = BigInt(i)
    while (n != 1) {
      if (n % 2 == 0) {
        n = n / 2
      } else {
        n = 3 * n + 1
      }
      steps += 1
    }

    i -> steps
  }
}
