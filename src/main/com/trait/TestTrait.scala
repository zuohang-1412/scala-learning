package main.com.`trait`

trait Fish {
  def swim(): Unit = {
    println("swim!!!")
  }
}

trait Bird {
  def fly(): Unit = {
    print("fly!!!")
  }
  def eat(): Unit
}

class Person(name: String) extends Fish with Bird {
  def talk(): Unit = {
    println(s"$name can talk")
  }

  override def eat(): Unit = {
    println(s"$name can eat")
  }
}

object TraitScala {
  def main(args: Array[String]): Unit = {
    val per = new Person("ZhangSan")
    per.talk()
    per.swim()
    per.fly()
    per.eat()
  }
}
