//Single Nested Function
object EvenOdd {
  def main(args: Array[String]) {
    val a = scala.io.StdIn.readInt();
    evenodd(a);
  }
  def evenodd(a: Int) {
    if (a % 2 == 1)
      println("Odd");
    else
      println("Even");
  }
}
