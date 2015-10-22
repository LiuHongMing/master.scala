package scala.learn

object FirstClassFunction {
  def main(args: Array[String]): Unit = {
    var increase = (x: Int) => x + 1
    println(increase(10))

    increase = (x: Int) => x + 999
    println(increase(10))

    increase = (x: Int) => {
      println("We")
      println("are")
      println("here!")

      x + 1
    }
    println(increase(10))

    val someNumbers = List(-11, -10, -5, 0, 5, 10)
    //    someNumbers.foreach((x: Int) => println(x))
    //    someNumbers.filter((x: Int) => x > 0)
    //    someNumbers.filter((x) => x > 0)
    //    someNumbers.filter(x => x > 0)
    println(someNumbers.filter(_ > 0))
    //    val f = (_: Int) + (_: Int)
    //    println(f(5, 10))
    //
    //    someNumbers.foreach(println _)
    //
    //    println(sum(1, 2, 3))
    //
    //    val a = sum _
    //    a(1, 2, 3)
    //    a.apply(1, 2, 3)
    //
    //    val b = sum(1, _: Int, 3)
    //    b(2)

    println(addOne(10))

    more = 9999
    println(addOne(1))
    
    var sum = 0
    someNumbers.foreach(sum += _)
    println(sum)
  }

  def sum(a: Int, b: Int, c: Int) = a + b + c

  var more = 1

  def addOne(x: Int) = x + more
}


