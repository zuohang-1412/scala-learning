package main.com.ifelse

import scala.util.Random

object TestIF {
  def main(args: Array[String]): Unit = {
    val a = Random.nextInt()
    if (a > 0) {
      println("正数: " + a)
    } else if (a == 0) {
      println("0: " + a)
    }
    else {
      println("负数: " + a)
    }
  }
}
