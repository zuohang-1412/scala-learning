# Scala
学习之旅： https://docs.scala-lang.org/zh-cn/
菜鸟：https://www.runoob.com/scala/scala-intro.html

## 介绍
### Scala 特性
1) 面向对象特性: Scala是一种纯面向对象的语言，每个值都是对象。对象的数据类型以及行为由类和特质描述。
类抽象机制的扩展有两种途径：一种途径是子类继承，另一种途径是灵活的混入机制。这两种途径能避免多重继承的种种问题。
2) 函数式编程: Scala也是一种函数式语言，其函数也能当成值来使用。Scala提供了轻量级的语法用以定义匿名函数，支持高阶函数，允许嵌套多层函数，并支持柯里化。Scala的case class及其内置的模式匹配相当于函数式编程语言中常用的代数类型。
更进一步，程序员可以利用Scala的模式匹配，编写类似正则表达式的代码处理XML数据。
3) 静态类型: Scala具备类型系统，通过编译时检查，保证代码的安全性和一致性。类型系统具体支持以下特性：
   1) 泛型类
   2) 协变和逆变
   3) 标注
   4) 类型参数的上下限约束
   5) 把类别和抽象类型作为对象成员
   6) 复合类型
   7) 引用自己时显式指定类型
   8) 视图
   9) 多态方法
4) 扩展性: Scala的设计秉承一项事实，即在实践中，某个领域特定的应用程序开发往往需要特定于该领域的语言扩展。Scala提供了许多独特的语言机制，可以以库的形式轻易无缝添加新的语言结构：
   1) 任何方法可用作前缀或后缀操作符
   2) 可以根据预期类型自动构造闭包。
5) 并发性: Scala使用Actor作为其并发模型，Actor是类似线程的实体，通过邮箱发收消息。Actor可以复用线程，因此可以在程序中可以使用数百万个Actor,而线程只能创建数千个。在2.10之后的版本中，使用Akka作为其默认Actor实现。

### 元素基础类型
1) Byte: 8位有符号补码整数。数值区间为 -128 到 127 
2) Short: 16位有符号补码整数。数值区间为 -32768 到 32767 
3) Int: 32位有符号补码整数。数值区间为 -2147483648 到 2147483647 
4) Long: 64位有符号补码整数。数值区间为 -9223372036854775808 到 9223372036854775807 
5) Float: 32 位, IEEE 754 标准的单精度浮点数 
6) Double: 64 位 IEEE 754 标准的双精度浮点数 
7) Char: 16位无符号Unicode字符, 区间值为 U+0000 到 U+FFFF 
8) String: 字符序列 
9) Boolean: true或false 
10) Unit: 表示无值，和其他语言中void等同。用作不返回任何结果的方法的结果类型。Unit只有一个实例值，写成()。 
11) Null: null 或空引用 
12) Nothing: Nothing类型在Scala的类层级的最底端；它是任何其他类型的子类型。 
13) Any: Any是所有其他类的超类 
14) AnyRef: AnyRef类是Scala里所有引用类(reference class)的基类

### 变量 val/var
1) 使用关键词 "var" 声明变量，使用关键词 "val" 声明常量。
2) 多个变量的声明

### 访问修饰符 
1) 私有成员(Private): 用 private 关键字修饰，带有此标记的成员仅在包含了成员定义的类或对象内部可见，同样的规则还适用内部类。
2) 受保护成员(Protected): 在 scala 中，对保护（Protected）成员的访问比 java 更严格一些。因为它只允许保护成员在定义了该成员的的类的子类中被访问。
3) 公共成员(Public): Scala 中，如果没有指定任何的修饰符，则默认为 public。这样的成员在任何地方都可以被访问。

### 运算符
1) 算术运算符 + - * / %
2) 关系运算符 != >= <= == < >
3) 逻辑运算符 && || !
4) 位运算符 ~ & | ^ 分别为取反，按位与，按位或，按位异或运算
5) 赋值运算符

### 判断 
1) if/else

### 循环
1) while: 运行一系列语句，如果条件为true，会重复运行，直到条件变为false。
2) do while: 类似 while 语句区别在于判断循环条件之前，先执行一次循环的代码块。
3) for: 用来重复执行一系列语句直到达成特定条件达成，一般通过在每次循环完成后增加计数器的值来实现。

### 方法与函数
1) 函数传名调用(Call-by-Name)	
2) 指定函数参数名
3) 函数 - 可变参数	
4) 递归函数
5) 默认参数值	
6) 高阶函数
7) 内嵌函数	
8) 匿名函数
9) 偏应用函数	
10) 函数柯里化(Function Currying)

### 数据基础类型
1) string
2) list
3) set
4) map
5) tuple
6) iterator

### 类和对象

### 特征 trait

### 模式匹配 match



## 常见问题：
1) Scala 和 JDK 版本关系： https://docs.scala-lang.org/overviews/jdk-compatibility/overview.html
2) idea中scala报错compiler-interface，请参考进行配置：https://blog.csdn.net/dudadudadd/article/details/129033147


