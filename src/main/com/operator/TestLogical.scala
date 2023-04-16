package main.com.operator

object TestLogical {
  def main(args: Array[String]): Unit = {
    val a = true;
    val b = false;

    println("a && b = " + (a && b));

    println("a || b = " + (a || b));

    println("!(a && b) = " + !(a && b));
  }
}
