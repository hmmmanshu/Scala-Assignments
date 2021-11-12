object Conversion {
    def main(args: Array[String]):Unit= {
        println("Enter choice\n1. Farenheit to Celsius")
        println("2. Inches to meters\n3. Years to days\n");
        val choice = scala.io.StdIn.readInt();

        println("Enter the value to convert");
        val value = scala.io.StdIn.readInt();

        val temp = (a: Int) => (a - 32) * 5 / 9;
        val dist = (a: Int) => (a / 39.37);
        def days(a: Int): Int = {
            if (a % 100 == 0) {
                if (a % 400 == 0)
                    return a * 366;
                else
                    return a * 365;
            }
            if (a % 4 == 0)
                return a * 366;
            return a * 365;
        }

        if (choice == 1)
            println(temp(value));
        else if (choice == 2)
            println(dist(value));
        else
            println(days(value))
    }
}