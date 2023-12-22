import java.util.*;
public class Frequency {
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
Vector<String> vector = new Vector<>();
System.out.print("Enter the no. of elements for the vector:");
int n = scanner.nextInt();
scanner.nextLine();

for (int i = 0; i < n; i++) {
System.out.printf("enter the %d element:",i+1);
vector.add(scanner.nextLine());
}
System.out.print("Enter the string to find its frequency: ");
String targetString = scanner.nextLine();
int frequency = 0;
for (int i = 0; i < vector.size(); i++) {
if (vector.get(i).equals(targetString)) {
frequency++;
}
}
System.out.println("Frequency of \"" + targetString + "\" is: " +
frequency);
scanner.close();
}
}
