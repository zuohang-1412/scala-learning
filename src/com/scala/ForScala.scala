package com.scala

object ForScala {
  def main(args: Array[String]): Unit = {
    // seqs1 是 1，3，5，7，9, <=9
    val seqs1: Range.Inclusive = 1 to (9,2)
    // seqs1 是 1，3，5，7 ， <9
    val seqs2: Seq[Int] = 1 until (9,2)
    for (i <- seqs1) {
      println(i)
    }
    for(j <- seqs2){
      println(j)
    }
    for( i<-seqs1 if(i==9)) {
      println(i)
    }


    // 9*9 乘法表  老方法 81 次循环
    for (i <- 1 to 9) {
      for (j <- 1 to 9 ) {
        if (j <= i) print(s"$i * $j = ${i * j}\t")
        if (j == i) println()
      }

    }
    // 简写方式 45次循环
    for(i<-1 to 9; j <- 1 to 9 if(j <= i)) {
      if(j <= i) print(s"$i * $j = ${i*j}\t")
      if(j == i) println()
    }

    val seqss: Seq[Int] = for(i <- 1 to 10) yield {
      i * i
    }
    println(seqss)
  }
}
