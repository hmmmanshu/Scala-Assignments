object readlineDemo {
  def main(args: Array[String]) {
    Console.print("Press Ctrl+C to terminalte\n");
    while (true) {
      val result = scala.io.StdIn.readLine();
      println(result);
    }
  }
}
