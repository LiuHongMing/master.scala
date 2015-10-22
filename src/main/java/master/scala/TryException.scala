package scala.learn

import java.io.FileNotFoundException
import java.io.FileReader
import java.io.IOException
import java.net.URL
import java.net.MalformedURLException

object Exception {

  def f(): Int = try { return 1 } finally { return 2 }

  def g(): Int = try { 1 } finally { 2 }

  def urlFor(path: String) =
    try {
      new URL(path)
    } catch {
      case e: MalformedURLException => new URL("http://www.scalalang.org")
    }
  
  def main(args: Array[String]): Unit = {
    val n = 10
    val half =
      if (n % 2 == 0)
        n / 2
      else
        throw new RuntimeException("n must be even")

    try {
      val f = new FileReader("input.txt")
    } catch {
      case ex: FileNotFoundException => println(ex.getMessage)
      case ex: IOException => println(ex.getMessage)
    }
   
    println(f())
    println(g())
  }
}