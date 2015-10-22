package scala.learn

object HelloWorld extends App {

  def sayHello(): String = { return "I am liuhongming"; }

  println(sayHello)

  println("Hello World from a script")

  //println("Hello " + args(0) + "!")

  val big = new java.math.BigInteger("1234")

  var greetStrings = new Array[String](3)
  greetStrings(0) = "Hello"
  greetStrings(1) = ","
  greetStrings(2) = "World!\n"

  for (i <- 0 to 2)
    print(greetStrings(i))

  val numNumbers1 = Array("zero", "one", "two", "three")
  
  val numNumbers2 = Array.apply("zero", "one", "two", "three")
}