package main.com.func

object TestPartialFunc {
  def main(args: Array[String]): Unit = {
    // PartialFunction 第一个参数（any）是输入； 第二个参数（string）是输出
    def xxx: PartialFunction[Any, String] = {
      case x: Int => s"$x is Int"
      case "aaa" => s"aaa is true"
      case _ => "None"
    }

    println(xxx(44))
    println(xxx("aaa"))
    println(xxx("hello world"))
  }
}
