package main.com.operator

object TestRela {
  def main(args: Array[String]): Unit = {
    val a = 10;
    val b = 20;
    println("a == b = " + (a == b));
    println("a != b = " + (a != b));
    println("a > b = " + (a > b));
    println("a < b = " + (a < b));
    println("b >= a = " + (b >= a));
    println("b <= a = " + (b <= a));
  }
}
