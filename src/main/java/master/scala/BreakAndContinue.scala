package scala.learn

object BreakAndContinue {

  def main(args: Array[String]): Unit = {
    def searchFrom(i: Int): Int =
      if (i >= args.length) -1 // 不要越过最后一个参数
      else if (args(i).startsWith("-")) searchFrom(i + 1) // 跳过选项
      else if (args(i).endsWith(".scala")) i // 找到！
      else searchFrom(i + 1) // 继续找
    val i = searchFrom(0)
  }
}