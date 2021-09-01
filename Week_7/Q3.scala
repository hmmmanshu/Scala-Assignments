object Q3 {
  def main(args: Array[String]) {
    var list: List[Int] = List(1, 2, 3, 4, 5, 6);
    list = list.reverse;
    for (a <- list) {
      print(a);
    }
    println();

    val x = List.fill(10)(1)
    println(x);

  }
}
