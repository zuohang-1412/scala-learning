package main.com.circulate

object TestWhile {
  def main(args: Array[String]): Unit = {
    var a = 1
    while (a < 10) {
      println(a)
      a += 1
    }
  }
}
