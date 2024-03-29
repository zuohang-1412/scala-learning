package main.com.operator

object TestBit {
  def main(args: Array[String]): Unit = {
    var a = 60; /* 60 = 0011 1100 */
    var b = 13; /* 13 = 0000 1101 */
    var c = 0;

    c = a & b;  /* 12 = 0000 1100 */
    println("a & b = " + c);

    c = a | b;  /* 61 = 0011 1101 */
    println("a | b = " + c);

    c = a ^ b;  /* 49 = 0011 0001 */
    println("a ^ b = " + c);

    c = ~a;  /* -61 = 1100 0011 */
    println("~a = " + c);

    c = a << 2;  /* 240 = 1111 0000 */
    println("a << 2 = " + c);

    c = a >> 2;  /* 15 = 1111 */
    println("a >> 2  = " + c);

    c = a >>> 2;  /* 15 = 0000 1111 */
    println("a >>> 2 = " + c);
  }
}
