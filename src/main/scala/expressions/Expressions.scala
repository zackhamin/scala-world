package expressions

object Expressions extends App {

  val x = 1 + 2 // Right hand side is an expression.
  println(x)

  println( 1 == x)
  // == != > < >= <=

  //Instructions (Do) vs Expressions (Value)

  //IF Expression

  val aCondition = true
  val aConditionedValue = if(aCondition) 5 else 3

  var i = 0

  while( i < 10) {
    println(i)
    i += 1

    //Scala does not use loops very often, coding standards. Do not use them. Never use while loops

    //Code block
    //Value of the block is the value of the last expression
    val aCodeBlock = {
      val y = 2
      val z = y + 1
      if(z > 2) "Hello" else "Goodbye"
    }
  }





}
