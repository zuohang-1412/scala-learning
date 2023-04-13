package com.example

import scala.collection.immutable.Set

object SetScala {
  def main(args: Array[String]): Unit = {
    println("----01 immutable----")
    val set1: Set[Int] = Set(1, 2, 3, 4, 3, 2, 3)
    set1.foreach(println)

    println("----02 mutable----")
    import scala.collection.mutable.Set
    val set2: Set[Int] = Set(1, 2, 3, 4, 3, 2, 3)
    set2.add(10)
    set2.foreach(println)
  }
}
