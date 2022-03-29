package dev.marconymous

import scala.annotation.tailrec

object Problem2 {
  @tailrec
  def fibonacci(max: Int, x: List[Int] = List(0, 1)): List[Int] = {
    if (x.last > max) x.dropRight(1)
    else fibonacci(max, x :+ x.last + x(x.length - 2))
  }

  def main(args: Array[String]): Unit = {
    println(fibonacci(4000000).filter(_ % 2 == 0).sum)
  }
}
