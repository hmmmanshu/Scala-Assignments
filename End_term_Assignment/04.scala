import scala.annotation.tailrec
object tailrec{
    def main(args: Array[String]): Unit = {
        println("|=====================|")
        println("|Name : Himanshu Negi |")
        println("|Section : DS         |")
        println("|Roll No : 32         |")
        println("|=====================|")
        println("Enter two numbers")
        var a = scala.io.StdIn.readInt()
        var b = scala.io.StdIn.readInt()
        print(s"Factorial of $a = ")
        println(factorial(a))
        print(s"GCD of $a, $b = ")
        println(gcd(a, b))
    }
    
    def factorial(n: Int): Int = {
        @tailrec
        def factorialAcc(acc: Int, n: Int): Int = {
        if (n <= 1) acc
        else factorialAcc(acc * n, n - 1)
        }
        factorialAcc(1, n)
    }

    @tailrec
    def gcd(a: Int, b: Int): Int = {
        if (b == 0) a
        else gcd(b, a % b)
    }
}