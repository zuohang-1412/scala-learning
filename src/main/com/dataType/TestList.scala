package main.com.dataType

import scala.collection.mutable.ListBuffer

object TestList {
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
    list2.+=(1)
    list2 += (2,3)
    list2 = list2 ++ Array(4, 5)
    list2 = list2 :+ (6)
    list2.foreach(println)


    // 二维数组
    val myMatrix = Array.ofDim[Int](3, 3)

    // 创建矩阵
    for (i <- 0 to 2) {
      for (j <- 0 to 2) {
        myMatrix(i)(j) = j;
      }
    }

    // 打印二维阵列
    for (i <- 0 to 2) {
      for (j <- 0 to 2) {
        print(" " + myMatrix(i)(j));
      }
      println();
    }

    val site = "Runoob" :: ("Google" :: ("Baidu" :: Nil))
    val nums = Nil

    println("第一网站是 : " + site.head)
    println("最后一个网站是 : " + site.tail)
    println("查看列表 site 是否为空 : " + site.isEmpty)
    println("查看 nums 是否为空 : " + nums.isEmpty)


    val site1 = "Runoob" :: ("Google" :: ("Baidu" :: Nil))
    val site2 = "Facebook" :: ("Taobao" :: Nil)

    // 使用 ::: 运算符
    var fruit = site1 ::: site2
    println("site1 ::: site2 : " + fruit)

    // 使用 List.:::() 方法
    fruit = site1.:::(site2)
    println("site1.:::(site2) : " + fruit)

    // 使用 concat 方法
    fruit = List.concat(site1, site2)
    println("List.concat(site1, site2) : " + fruit)
  }
}
