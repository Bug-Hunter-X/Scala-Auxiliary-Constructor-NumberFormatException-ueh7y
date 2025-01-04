```scala
import scala.util.{Try, Success, Failure}

class MyClass(val x: Int) {
  def this(s: String) = this(Try(s.toInt) match {
    case Success(i) => i
    case Failure(_) => 0 // Default value
  })
}

val obj1 = new MyClass(10)
val obj2 = new MyClass("20")
val obj3 = new MyClass("abc") // This will not throw an exception
println(obj1.x) // Output: 10
println(obj2.x) // Output: 20
println(obj3.x) // Output: 0
```