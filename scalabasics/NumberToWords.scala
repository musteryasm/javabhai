object NumberToWords {
 def main(args: Array[String]): Unit = {
 val number = 123
 val digitsWords = numberToWords(number)
 println(s"The number $number in words: $digitsWords")
 }
 def numberToWords(number: Int): String = {
 def digitToWord(digit: Int): String = digit match {

 case 0 => "zero"
 case 1 => "one"
 case 2 => "two"
 case 3 => "three"
 case 4 => "four"
 case 5 => "five"
 case 6 => "six"
 case 7 => "seven"
 case 8 => "eight"
 case 9 => "nine"
 case _ => "Invalid"
 }
 var remaining = number
 var digitsWords = ""
 while (remaining > 0) {
 val unitsDigit = remaining % 10
 val unitsWord = digitToWord(unitsDigit)
 digitsWords = unitsWord + " " + digitsWords
 remaining /= 10
 }
 digitsWords.trim
 }
}
