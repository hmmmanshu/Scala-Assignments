//Multiple nesting
object MaxMin {
  def main(args: Array[String]) {
    val a = scala.io.StdIn.readInt();
    val b = scala.io.StdIn.readInt();
    maxAndMin(a, b);
  }
  def maxAndMin(a: Int, b: Int) = {
    def max() = {
      maxValue();
      def maxValue() = {
        if (a > b)
          println("Max : " + a)
        else
          println("Max : " + b)
      }
    }
    def min() = {
      minValue();
      def minValue() = {
        if (a < b)
          println("Min : " + a)
        else
          println("Min : " + b)
      }
    }
    max();
    min();
  }
}
