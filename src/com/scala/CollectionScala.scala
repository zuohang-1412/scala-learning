package com.scala

object CollectionScala {
  def main(args: Array[String]): Unit = {

    println("--------")
    val list: List[Int] = List(1,2,3,4,5)
    list.foreach(println)

    println("--------")
    val listMap: List[Int] = list.map((x: Int) => x * x)
    listMap.foreach(println)

    println("--------")
    val newListMap: List[Int] = list.map(_ * 10)
    newListMap.foreach(println)

    println("--------")
    val list2: List[String] = List("hello A", "hello B", "hello C")
    val listFlatMap: List[String] = list2.flatMap((x: String) => x.split(" "))
    listFlatMap.foreach(println)
    val newList: List[(String, Int)] = listFlatMap.map((_, 1))
    newList.foreach(println)

    println("----迭代器----")
    val listIt: Iterator[String] = list2.iterator
    val listItFlatMap: Iterator[String] = listIt.flatMap((x: String) => x.split(" "))
    val newListIt: Iterator[(String, Int)] = listItFlatMap.map((_, 1))
    while(newListIt.hasNext){
      println(newListIt.next())
    }
  }
}
