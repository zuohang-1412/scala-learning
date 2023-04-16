package main.com.elementType

object TestElementType {
  def main(args: Array[String]): Unit = {
    println("---整型---")
    println(35)
    println(0xFFFFFFFF)
    println(777L)

    println("---浮点型---  默认为Double 末尾添加f则为float")
    println(0.0)
    println(1e30f)
    println(3.14159f)
    println(1.0e100)
    println(.1)

    println("---布尔型---")
    println(true)
    println(false)

    println("---字符型---")
    println('a')
    println('\u0041')
    println('\n')
    println('\t')

    println("---字符串---")
    println("hello world")

    println("---多行数据---")
    println("""
      |select *
      |from table
      |where id=1
      |""".stripMargin)

  }
}
