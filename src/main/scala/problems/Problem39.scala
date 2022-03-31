package dev.marconymous
package problems

/**
 * If p is the perimeter of a right angle triangle with integral length sides, {a,b,c}, there are exactly three solutions for p = 120.
 *
 * {20,48,52}, {24,45,51}, {30,40,50}
 *
 * For which value of p ≤ 1000, is the number of solutions maximised?
 */
object Problem39 {
  def main(args: Array[String]): Unit = {
    val solutions = for {
      a <- 1 to 1000
      b <- 1 to 1000
      c <- 1 to 1000
      if a < b && b < c
      if a + b + c <= 1000
      if a * a + b * b == c * c
    } yield (a, b, c)

    val finalSolution = solutions.groupBy(x => x._1 + x._2 + x._3).maxBy(_._2.size)

    println(finalSolution)
  }
}
