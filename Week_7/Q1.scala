object Q1 {
  def main(args: Array[String]) {
    var a = 0;
    for (a <- 1 to 10) {
      println("Value of a: " + a);
    }
    a = 0;
    for (a <- 1 until 10) {
      println("Value of a: " + a);
    }

    a = 0;
    var b = 0;
    for (a <- 1 to 3; b <- 1 to 3) {
      println("Value of a: " + a);
      println("Value of b: " + b);
    }

    a = 0;
    val numList = List(1, 2, 3, 4, 5, 6);
    for (a <- numList) {
      println("Value of a: " + a);
    }

    a = 0;
    for (a <- numList if a != 3; if a < 8)
      println("Value of a: " + a);

  }
}
