package dev.marconymous
package problems

import utils.Lib.factorial

object Problem20 {
  def main(args: Array[String]): Unit = {
    println(factorial(100).toString.map(_.asDigit).sum)
  }
}
