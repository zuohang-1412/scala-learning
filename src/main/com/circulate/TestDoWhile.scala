package main.com.circulate

object TestDoWhile {
  def main(args: Array[String]): Unit = {
    var a = 10;
    // do 循环
    do {
      println("Value of a: " + a);
      a = a + 1;
    } while (a < 20)
    println("End value of a: " + a)
  }
}
