package com.scala

object MatchScala {
  def main(args: Array[String]): Unit = {
    val t1: (Double, Boolean, String, Char, Int) = (1.0, false, "aaa", 'a', 90)
    val itT1: Iterator[Any] = t1.productIterator
    val res: Iterator[Unit] = itT1.map((x) => {
      x match {
        case 1 => println(s"$x is int")
        case o:String => println(s"$o is Sting")
        case false => println(s"$x is false")
        case w: Int if w < 100 => println(s"$w 小于 100")
        case _ => println("helllo world")
      }
    })
    // 为什么每次打印后都有一个()？ 原因是在迭代器进行map 时 因为print 打印也返回了一个unit 就是一个()会返回给res。
    while(res.hasNext){
      println(res.next())
    }
  }
}
