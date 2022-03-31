package dev.marconymous
package problems

import scala.collection.mutable

/**
 * A unit fraction contains 1 in the numerator. The decimal representation of the unit fractions with denominators 2 to 10 are given:
 *
 * 1/2	= 	0.5
 * 1/3	= 	0.(3)
 * 1/4	= 	0.25
 * 1/5	= 	0.2
 * 1/6	= 	0.1(6)
 * 1/7	= 	0.(142857)
 * 1/8	= 	0.125
 * 1/9	= 	0.(1)
 * 1/10	= 	0.1
 * Where 0.1(6) means 0.166666..., and has a 1-digit recurring cycle. It can be seen that 1/7 has a 6-digit recurring cycle.
 *
 * Find the value of d < 1000 for which 1/d contains the longest recurring cycle in its decimal fraction part.
 */
object Problem26 {
  def main(args: Array[String]): Unit = {
    val result = (1 to 1000).map(i => (i, cycleLength(i))).maxBy(_._2)._1
    println(result) // 983
  }

  private def cycleLength(n: Int): Int = {
    val map = mutable.Map[Int, Int]()
    var remainder = 1
    for (i <- 1 to Int.MaxValue) {
      if (map.contains(remainder)) {
        return i - map(remainder)
      }

      map += (remainder -> i)
      remainder = remainder * 10 % n
    }

    -1
  }
}
