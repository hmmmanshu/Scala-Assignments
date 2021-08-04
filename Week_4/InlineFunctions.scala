object Inline {
  def main(args: Array[String]) {

    var increment = (a: Int) => (a + 1);
    var check0 = (a: Int) => (a == 0);
    var add = (a: Int, b: Int) => (a + b);
    var product = (a: Int, b: Int) => (a * b);

    println("Increment 1 : " + increment(1));
    println("Check 0 for 1 : " + check0(1));
    println("Sum of 5 and 10 : " + add(5, 10));
    println("Product of 5 and 10 : " + product(5, 10));

  }
}
