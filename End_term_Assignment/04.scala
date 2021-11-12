import scala.annotation.tailrec
object tailrec{
    def main(args: Array[String]): Unit = {
        println(factorial(5))
        println(gcd(10, 4))
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