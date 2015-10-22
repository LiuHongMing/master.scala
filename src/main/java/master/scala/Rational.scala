package scala.learn

class Rational(n: Int, d: Int) {
  require(d != 0)
  private val g = gcd(n.abs, d.abs)

  val numer = n / g
  val denom = d / g

  def this(n: Int) = this(n, 1)

  override def toString() = numer + "/" + denom

  def add(that: Rational): Rational = new Rational(
    numer * that.denom + denom * that.denom,
    denom * that.denom)

  def lessThan(that: Rational) =
    this.numer * this.denom > that.numer * that.denom

  def max(that: Rational) =
    if (lessThan(that)) that else this

  def +(that: Rational): Rational =
    new Rational(
      numer * that.denom + that.numer * denom,
      denom * that.denom)
  def +(i: Int): Rational =
    new Rational(numer + i * this.denom, this.denom)

  def -(that: Rational): Rational =
    new Rational(
      numer * that.denom - that.numer * denom,
      denom * that.denom)
  def -(i: Int): Rational =
    new Rational(numer - i * denom, denom)

  def *(that: Rational): Rational =
    new Rational(numer * that.numer, denom * that.denom)
  def *(i: Int): Rational =
    new Rational(numer * i, denom)

  def /(that: Rational): Rational =
    new Rational(numer * that.denom, denom * that.numer)
  def /(i: Int): Rational =
    new Rational(numer, denom * i)

  //最大公约数：greatest common divisor
  private def gcd(a: Int, b: Int): Int =
    if (b == 0) a else gcd(b, a % b)
}