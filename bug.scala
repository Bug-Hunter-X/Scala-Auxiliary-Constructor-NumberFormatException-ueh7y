```scala
class MyClass(val x: Int) {
  def this(s: String) = this(s.toInt)
}

val obj1 = new MyClass(10)
val obj2 = new MyClass("20")
```