package com.example

import scala.collection.mutable.ListBuffer

object ListScala {
  def main(args: Array[String]): Unit = {

    println("----01 基础----")
    val arr: Array[Int] = Array(1, 2, 3, 4)

    println(arr(1))
    arr(1) = 99
    println(arr(1))

    for (elem <- arr) {
      println(elem)
    }

    arr.foreach(println(_))
    arr.foreach(println)

    println("----02 immutable 不可变----")
    val list1: List[Int] = List(1, 2, 3, 4, 5, 6, 7, 8)
    list1.foreach(println)

    println("----03 mutable 可变----")
    var list2 = new ListBuffer[Int]()
    // todo: .++ 、++: 、:++、::、:::
    list2.+=(11)
//    list2::(22,33)::(44)
//    list2 ++ (55)
//    list2 :+ (66)
//    list2 +: (77)
//    list2 ::: (88):::(99)
    list2.foreach(println)
  }
}
