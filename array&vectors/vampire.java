import java.util.Scanner;
public class VampireNumber {
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
System.out.print("Enter a 4-digit number: ");
int number = scanner.nextInt();
scanner.close();
if (isVampireNumber(number)) {
System.out.println(number + " is a vampire number.");
} else {
System.out.println(number + " is not a vampire number.");
}
}
// Function to check if a number is a vampire number
public static boolean isVampireNumber(int number) {
if (number < 1000 || number > 9999) {
return false;
}
String numStr = String.valueOf(number);
for (int i = 10; i <= 99; i++) {
for (int j = i; j <= 99; j++) {
if (i * j == number) {
String ijStr = String.valueOf(i) + String.valueOf(j);
if (areAnagrams(numStr, ijStr)) {
return true;
}
}
}
}
return false;
}
// Function to check if two strings are anagrams
public static boolean areAnagrams(String str1, String str2) {
if (str1.length() != str2.length()) {
return false;
}

for (int i = 0; i < str1.length(); i++) {
if (str1.indexOf(str2.charAt(i)) == -1) {
return false;
}
}
return true;
}
}
