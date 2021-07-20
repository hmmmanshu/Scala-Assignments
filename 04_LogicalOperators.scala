// Demonstrate logical operators
object LogicalOperators {

  def main(args: Array[String]) {
    var a = false
    var b = true

    println("!(a && b) = " + !(a && b));
    println("|| b = " + (a || b));
    println("a && b = " + (a && b));

  }
}
