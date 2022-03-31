package dev.marconymous
package problems

import utils.Lib

object Problem10 {
  def main(args: Array[String]): Unit = {
    println((1 until 2000000).filter(Lib.isPrime).map(_.toLong).sum)
  }

}
