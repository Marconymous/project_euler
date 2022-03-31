package dev.marconymous
package problems


/**
 * Starting with the number 1 and moving to the right in a clockwise direction a 5 by 5 spiral is formed as follows:
 *
 * 21 22 23 24 25
 * 20  7  8  9 10
 * 19  6  1  2 11
 * 18  5  4  3 12
 * 17 16 15 14 13
 *
 * It can be verified that the sum of the numbers on the diagonals is 101.
 *
 * What is the sum of the numbers on the diagonals in a 1001 by 1001 spiral formed in the same way?
 */
object Problem27 {
  def main(args: Array[String]): Unit = {
    println(s"Problem 27: ${sumOfDiagonals(1001)}")
  }

  def sumOfDiagonals(n: Int): Long = {
    var sum = 1L
    for (i <- 3 to n by 2) {
      /*
      i = 1 -> sum = 25
      i = 2 -> sum = 101
      i = 3 -> sum = 261
      */
      sum += 4 * i * i - 6 * (i - 1)
    }
    sum
  }
}
