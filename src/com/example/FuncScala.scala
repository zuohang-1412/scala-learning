package com.example

import java.util.Date

object FuncScala {

  def temp(): Unit = {
    println("Hello world")
  }

  def main(args: Array[String]): Unit = {
    println("----01基础函数----")
    val a = "func01"
    val b = "good"

    def func01(): Unit = {
      println(s"$a")
    }

    val f1: Unit = func01()
    println(f1)

    println("----02----")

    def func02(): String = {
      println(s"$a")
      b
    }

    val f2: String = func02()
    println(f2)

    println("----03----")

    def func03(a: Int): Int = {
      println(s"得分：$a")
      a
    }

    val f3: Int = func03(33)
    println(f3)

    println("----04递归----")

    def func04(num: Int): Int = {
      if (num == 1) {
        num
      }
      else {
        num + func04(num - 1)
      }
    }

    val f4: Int = func04(4)
    println(f4)

    println("----05默认值函数----")

    def func05(num: Int = 888, str: String = "发发发"): Unit = {
      println(s"$num$str")
    }

    func05()
    func05(521, "我爱你")
    func05(str = "888")

    println("----06匿名函数----")
    // 1.签名：(Int,Int)=>Int 参数类型列表=>返回值类型
    // 2.匿名函数：(a:Int, b:Int) =>{ a+b } 参数实现列表=>函数体
    val f6: (Int, Int) => Int = (a: Int, b: Int) => {
      a + b
    }
    val f66: Int = f6(3, 4)
    println(f66)

    println("----07嵌套函数----")

    def func07(a: Int): Unit = {
      def funcTemp07(): Unit = {
        println(a)
      }

      funcTemp07()
    }

    func07(10)

    println("----08应用函数----")

    def func08(date: Date, tp: String, msg: String): Unit = {
      println(s"$date\t$tp\t$msg")
    }

    func08(new Date(), tp = "login", msg = "success")
    val login: (Date, String) => Unit = func08(_: Date, tp = "login", _: String)
    val logout: (Date, String) => Unit = func08(_: Date, tp = "logout", _: String)
    login(new Date(), "success")
    login(new Date(), "failed")
    logout(new Date(), "success")
    logout(new Date(), "failed")

    println("----09可变参数----")

    def func09(a: Int*): Unit = {
      // 第一种
      a.foreach(i => {
        print(i)
      })
      // 第二种
      a.foreach(println(_))
    }

    func09(1, 2, 3, 4, 5, 6)

    println("----10高级函数----")

    def calculator(a: Int, b: Int, f: (Int, Int) => Int): Unit = {
      val res: Int = f(a, b)
      println(res)
    }

    def symbol(i: String): (Int, Int) => Int = {
      def jia(x: Int, y: Int): Int = {
        x + y
      }

      def jian(x: Int, y: Int): Int = {
        x - y
      }

      def cheng(x: Int, y: Int): Int = {
        x * y
      }

      def chu(x: Int, y: Int): Int = {
        x / y
      }

      def pas(x: Int, y: Int): Int = {
        0
      }

      if (i.equals("+")) {
        jia
      } else if (i.equals("-")) {
        jian
      } else if (i.equals("*")) {
        cheng
      } else if (i.equals("/")) {
        chu
      } else {
        pas
      }
    }

    calculator(3, 8, (x: Int, y: Int) => {
      x + y
    })
    calculator(3, 8, _ + _)
    calculator(3, 8, symbol("+"))
    calculator(3, 8, (x: Int, y: Int) => {
      x * y
    })
    calculator(3, 8, _ * _)
    calculator(3, 8, symbol("*"))

    println("----11柯里化----")

    def func11(a: Int*)(b: Int)(c: String*): Unit = {
      a.foreach(print(_))
      println()
      print(b)
      println()
      c.foreach(print(_))
    }

    func11(1, 2, 3)(1111)("aaa", "bbb")

    println("----12方法----")
    // 能打印hello world
    val f12: Unit = temp()
    // 能打印hello world
    val f121: Unit = temp
    // 不能打印hello world 方法假设不想执行就可以通过赋值一个引用 【方法名+空格+下划线】
    val f1211: () => Unit = temp _
    // 能打印hello world
    f1211()

  }
}
