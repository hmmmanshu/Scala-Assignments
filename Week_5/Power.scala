object Power {
    def main(args: Array[String]) {
        print("Enter a number : ")
        val a = scala.io.StdIn.readInt();
        println("Number ^2 : " + math.pow(a, 2));
        println("Number ^3 : " + math.pow(a, 3));
        println("Number ^4 : " + math.pow(a, 4));
    }
}
