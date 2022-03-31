package dev.marconymous
package problems

import scala.io.Source

object Problem22 {
  def main(args: Array[String]): Unit = {
    val names = readFile("src/main/resources/names.txt")
      .head
      .split(",")
      .map(_.replace("\"", ""))
      .sorted
      .map(stringValue)
      .zipWithIndex.map((value, index) => value * (index + 1))
      .sum

    println(names)
  }

  private def stringValue(name: String): Int = {
    name.map(_.toInt - 64).sum
  }


  def readFile(fileName: String): List[String] = {
    val source = Source.fromFile(fileName)
    val lines = source.getLines.toList
    source.close()
    lines
  }
}
