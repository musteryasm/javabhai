object PrimeCheck {
 def main(args: Array[String]): Unit = {
 val number = 13
 val isPrime = isPrimeNumber(number)
 if (isPrime) {
 println(s"$number is a prime number.")
 } else {
 println(s"$number is not a prime number.")
 }
 }
 def isPrimeNumber(number: Int): Boolean = {
 if (number <= 1) {
 false
 } else {
 var i = 2
 var isPrime = true
 do {
 if (number % i == 0) {
 isPrime = false
 }
 i += 1
 } while (i * i <= number && isPrime)
 isPrime
 }
 }
}
