package scala.learn

object ListObj extends App {

  val oneTwoThree = List(1, 2, 3)

  val oneTwo = List(1, 2)
  val threeFour = List(3, 4)
  val onTwoThreeFour = oneTwo ::: threeFour

  println(oneTwo)
  println(threeFour)
  println(onTwoThreeFour)

  val twoThree = List(2, 3)
  val oneTwoThree1 = 1 :: twoThree
  println(oneTwoThree1)

  val oneTwoThree2 = 1 :: 2 :: 3 :: Nil
  println(oneTwoThree2)

  val thrill = "Will" :: "fill" :: "until" :: Nil
  println(thrill(2))
  println(thrill.count(s => s.length == 4))
  println(thrill.drop(2))
  println(thrill.map(s => s + "y"))
  
}