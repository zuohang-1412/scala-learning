package main.com.dataType

import scala.collection.mutable

object TestMap {
  def main(args: Array[String]): Unit = {
    println("----01 immutable----")
    val m1: Map[String, Int] = Map(("a", 1), "b" -> 2)
    println(m1.get("a").getOrElse("a", 0))
    println(m1.get("b").getOrElse("b", 0))
    println(m1.get("c").getOrElse(0))

    val keys: Iterable[String] = m1.keys
    keys.foreach(println(_))

    println("----01 mutable----")
    val m2: mutable.Map[String, Int] = scala.collection.mutable.Map(("a", 3), "b" -> 4)
    m2.put("c", 5)

  }
}
