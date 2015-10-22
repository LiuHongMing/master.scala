package scala.learn

import scala.collection.mutable.Map

class ChecksumAccumulator {
  private var sum = 0;

  //def add(b: Byte): Unit = sum += b

  def add(b: Byte) { sum += b }

  def checksum(): Int = ~(sum & 0xFF) + 1

  def main(args: Array[String]) {
    val acc = new ChecksumAccumulator
    acc.sum = 5
    
  }
}

object ChecksumAccumulator {
  private val cache = Map[String, Int]()

  def calculate(s: String): Int =
    if (cache.contains(s))
      cache(s)
    else {
      val acc = new ChecksumAccumulator
      for (c <- s)
        acc.add(c.toByte)
      val cs = acc.checksum();
      cache += (s -> cs)
      cs
    }
  
  ChecksumAccumulator.calculate("Every value is an object.")
}

