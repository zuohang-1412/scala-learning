package main.com.dataType

object TestString {
  def main(args: Array[String]): Unit = {
    val str: String = "hello"
    println(str)

    // 创建可以修改的字符串
    val builder = new StringBuilder();
    builder += 'a'
    builder ++= "bcdef"
    println(builder.toString())

    // 字符串长度
    println(str.length)

    // 字符串拼接
    println(str.concat(" world"))
    println(str+" world")

    // 格式化字符串
    var floatVar = 3.14
    var intVar = 100
    var stringVar = "hello world"
    printf("浮点型变量为 " + "%f, 整型变量为 %d, 字符串为 " + " %s ", floatVar, intVar, stringVar)


  }
}
