package variablesValues

object ValuesVariablesTypes extends App{

  //Value - val are immutable.
  //Type can be inferred does not need declaring val x: Int = 42
  val x = 42;
  println(x)

  // No
 // x = 2

  val aString: String = " Hello";
  val aBoolean: Boolean = false
  val aChar: Char = 'A'
  val aShort: Short = 4565
  val aLong: Long = 78787878789845L
  val aFloat: Float = 2.15f
  val aDouble: Double = 2.35

  //Variable is mutable
  var aVariable: Int = 15
  aVariable = 5

}
