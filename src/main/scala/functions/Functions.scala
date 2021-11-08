package functions

object Functions extends App {

  def aFunction(a:String, b:Int): String = {
    a + " " + b
  }

  println(aFunction("Hello", 22))

// In functional programming we do not use Loops we use recursive functions
  def NotALoopFunction(aString:String, n: Int): String = {
    if (n == 1) aString
    else aString + NotALoopFunction(aString, n -1)
  }

  println(NotALoopFunction("Hello", 9))
}
