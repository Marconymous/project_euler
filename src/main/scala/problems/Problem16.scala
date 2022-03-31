package dev.marconymous
package problems

object Problem16 {
  def main(args: Array[String]): Unit = {
    println(BigInt(2).pow(1000).toString.map(_.asDigit).sum)
  }
}
