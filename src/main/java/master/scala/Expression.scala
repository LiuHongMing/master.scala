package scala.learn

object Expression {

  def gcdLoop(x: Long, y: Long): Long = {
    var a = x
    var b = y

    while (a != 0) {
      val temp = a
      a = b % a
      b = temp
    }

    b
  }

  def main(args: Array[String]) {
    println(gcdLoop(42, 66))

    val filesHere = (new java.io.File(".")).listFiles
    for (file <- filesHere)
      println(file)

    for (i <- 1 to 4)
      println("Iteration " + i)

    for (i <- 1 until 4)
      println("Iteration " + i)

    for (i <- 0 to filesHere.length - 1)
      println(filesHere(i))

    for (file <- filesHere if file.getName.endsWith(".scala"))
      println(file)

    for (
      file <- filesHere if file.isFile;
      if file.getName.endsWith(".scala")
    ) println(file)
  }

  val filesHere = (new java.io.File(".")).listFiles
  def fileLines(file: java.io.File) =
    scala.io.Source.fromFile(file).getLines.toList

  def grep(pattern: String) =
    for {
      file <- filesHere
      if file.getName.endsWith(".scala")
      line <- fileLines(file)
      trimmed = line.trim
      if trimmed.matches(pattern)
    } println(file + ": " + trimmed)
  grep(".*gcd.*")
  
  def scalaFiles = 
    for {
      file <- filesHere
      if file.getName().endsWith(".scala")
    } yield file

  val forLineLengths =
    for {
      file <- filesHere
      if file.getName.endsWith(".scala")
      line <- fileLines(file)
      trimmed = line.trim
      if trimmed.matches(".*for.*")
    } yield trimmed.length    
}