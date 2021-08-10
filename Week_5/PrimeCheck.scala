object PrimeCheck {
	
	def checkPrime(a: Int, div: Int): Boolean = {
		if (a < 2 || div == 1)
			return true;
		if (a % div == 0)
			return false;
		if (checkPrime(a, div - 1) == false)
			return false;
		return true;
	}

	def main(args: Array[String]) {
		val a = scala.io.StdIn.readInt(); // Assuming positive int
		if (checkPrime(a, (math.sqrt(a + 1)).toInt)) {
			println("The number is prime");
		} else {
			println("The number is composite");
		}
	}
}
