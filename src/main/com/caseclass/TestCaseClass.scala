package main.com.caseclass

class Dog(name:String, age:Int) {

}

case class NewDog(name:String, age:Int) {

}

object TestCaseClass {
  def main(args: Array[String]): Unit = {

    println("----01 基础----")
    val d1 = new Dog("AAA", 18)
    val d2 = new Dog("AAA", 18)
    println(d1.equals(d2))
    println(d1==d2)

    println("----02 case----")
    val d3 = NewDog("BBB", 18)
    val d4 = NewDog("BBB", 18)
    println(d3.equals(d4))
    println(d3 == d4)
  }
}
