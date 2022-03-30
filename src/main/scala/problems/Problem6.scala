package dev.marconymous
package problems

object Problem6 {
  def main(args: Array[String]): Unit = {
    val nums = 1 to 100
    val squareOfSum = nums.sum * nums.sum
    val sumOfSquares = nums.map(x => x * x).sum

    println(squareOfSum - sumOfSquares)
  }
}
