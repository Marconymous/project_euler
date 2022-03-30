package dev.marconymous
package problems

object Problem9 {
  def main(args: Array[String]): Unit = {
    for (a <- 1 to 1000) {
      for (b <- 1 to 1000) {
        val c = 1000 - a - b
        if (a * a + b * b == c * c) {
          println(s"a: $a, b: $b, c: $c")
          println(s"product: ${a * b * c}")
        }
      }
    }
  }
}
