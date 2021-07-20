//Demonstrate the Shorthand Operators
object ShorthandOperators {

  def main(args: Array[String]) {
    var a = 50;
    var b = 40;
    var c = 0;

    c += a;
    println("c += a = " + c);
    c -= a;
    println("c -= a = " + c);
    c *= a;
    println("c *= a = " + c);
    c /= a;
    println("c /= a = " + c);
    c %= a;
    println("c %= a = " + c);
    c <<= 3;
    println("c <<= 3 = " + c);
    c >>= 3;
    println("c >>= 3 = " + c);
    c &= a;
    println("c &= 3 = " + c);
    c ^= a;
    println("c ^= a = " + c);
    c |= a;
    println("c |= a = " + c);
  }
}
