package main.com.valvar

object TestValVar {
  def main(args: Array[String]): Unit = {
    // val 不能修改
    val str1: String = "hello val"
    // var 可以修改
    var str2: String = "hello var"
    val a,b,c,d = 10
    println(str1, str2, a,b,c,d)
  }
}
