//Multiple Nesting
object EvenOdd2 {
  def main(args: Array[String]) {
    val a = scala.io.StdIn.readInt();
    evenodd(a);
  }
  def evenodd(a: Int) {
    evenoddNested();
    def evenoddNested() {
      if (a % 2 == 1)
        println("Odd");
      else
        println("Even");
    }
  }
}
