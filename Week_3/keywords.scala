object keywords { // object keyword to define a class
  def main(args: Array[String]) {
    // def to define fucntions;
    // main denotes definition of main fucntion
    // Array to define an array of objects;
    // String is a predefined data type to hold alphanumeric objects

    var VAR = scala.io.StdIn.readLine();
    // Mutable objects
    // StdIn to denote standard input
    // readline to denote String input from standard input;

    val VAL = true;
    // val denotes mmutable objects
    // true denotes a boolean value;

    while (VAL) {
      // while to run a loop
      print("Printing something here");
      VAL = false;
      // false is a boolean value
    }

    Console.print(
      "This is a scala program"
    ); // Console implements the fucntions to display objects on the terminal/console
    print("This is print"); //print keyword to display objects on console

  }
}
