import java.util.Scanner;
public class MetaStrings {
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
System.out.print("Enter the first string: ");
String str1 = scanner.nextLine();
System.out.print("Enter the second string: ");
String str2 = scanner.nextLine();
if (areMetaStrings(str1, str2)) {
System.out.println("The strings are meta strings.");

} else {
System.out.println("The strings are not meta strings.");
}
scanner.close();
}
public static boolean areMetaStrings(String str1, String str2) {
if (str1.length() != str2.length()) {
return false;
}
int len = str1.length();
int count = 0;
int firstIndex = -1, secondIndex = -1;
for (int i = 0; i < len; i++) {
if (str1.charAt(i) != str2.charAt(i)) {
count++;
if (count == 1) {
firstIndex = i;
} else if (count == 2) {
secondIndex = i;
}
}
}
if (count != 2) {
return false;
}
return str1.charAt(firstIndex) == str2.charAt(secondIndex) &&
str1.charAt(secondIndex) == str2.charAt(firstIndex);
}
}
