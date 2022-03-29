package dev.marconymous

import scala.annotation.tailrec

object Problem5 {
  def isDivisibleBy(a: Int, b: List[Int]): Boolean = b.forall(a % _ == 0)

  @tailrec
  def findFirst(a: Int = 0, b: List[Int]): Int = {
    if (a == 0) findFirst(b.last, b)
    else if (isDivisibleBy(a, b)) a
    else findFirst(a + b.last, b)
  }

  def main(args: Array[String]): Unit = {
    val hasToBeDivisibleBy = (1 to 20).toList

    println(hasToBeDivisibleBy)

    println(findFirst(b = hasToBeDivisibleBy))
  }
}
