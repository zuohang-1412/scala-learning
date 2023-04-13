package com.example

object TupleScala {
  def main(args: Array[String]): Unit = {

    println("----01 基础----")
    val t2: (String, Int) = new Tuple2[String, Int]("数字：", 2)
    println(t2,t2._1,t2._2)
    val t3: (String, Int, Int) = Tuple3("数字：", 3, 4)
    println(t3, t3._1, t3._2, t3._3)

    println("----02 迭代器 ----")
    val t10: (Int, Int, Int, Int, Int, Int, Int, Int, Int, Int) = Tuple10(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    val it1: Iterator[Any] = t10.productIterator
    while (it1.hasNext) {
      println(it1.next())
    }
  }
}
