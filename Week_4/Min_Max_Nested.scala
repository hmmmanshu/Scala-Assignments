object Min_Max_Nested {
  def main(args: Array[String]) {
    var a = scala.io.StdIn.readInt();
    var b = scala.io.StdIn.readInt();
    println("Min and Max from a, b")
    MinMax(a, b);
  }
  def MinMax(a: Int, b: Int) {
    def maxValue() = {
      if (a > b)
        println("Max : " + a)
      else
        println("Max : " + b)
    }
    def minValue() {
      if (a < b)
        println("Min : " + a)
      else
        println("Min : " + b)
    }
    maxValue();
    minValue();
  }
}
