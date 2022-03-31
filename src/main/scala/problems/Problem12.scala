package dev.marconymous
package problems

import scala.annotation.tailrec

object Problem12 {
  def main(args: Array[String]): Unit = {
    println(s"Problem 12: ${getTriangleNumber(500)}")
  }

  def getTriangleNumber(target: Int): Int = {
    var triangle = 0

    for (i <- 1 to Int.MaxValue) {
      triangle += i
      if (divisorCount(triangle) >= target)
        return triangle
    }

    triangle
  }

  def divisorCount(number: Int): Int = {
    val sqrt = math.sqrt(number).toInt
    (1 to sqrt).count(number % _ == 0) * 2 - (if (sqrt * sqrt == number) 1 else 0)
  }
}
