import java.util.ArrayList;
import java.util.Scanner;
public class ShoppingList {
public static void main(String[] args) {
ArrayList<String> shoppingList = new ArrayList<>();
Scanner scanner = new Scanner(System.in);
while (true) {
System.out.println("Shopping List Menu:");
System.out.println("1. Add an item");
System.out.println("2. Delete an item");
System.out.println("3. Print the shopping list");
System.out.println("4. Quit");
System.out.print("Enter your choice: ");
int choice = scanner.nextInt();
switch (choice) {
case 1:
System.out.print("Enter the item to add: ");
scanner.nextLine(); // Consume the newline character
String itemToAdd = scanner.nextLine();
System.out.print("Enter the position to add (0-" +
shoppingList.size() + "): ");
int positionToAdd = scanner.nextInt();
if (positionToAdd >= 0 && positionToAdd <=
shoppingList.size()) {
shoppingList.add(positionToAdd, itemToAdd);
System.out.println(itemToAdd + " added to the shopping 
list.");
} else {
System.out.println("Invalid position. Item not added.");
}
break;
case 2:
if (shoppingList.isEmpty()) {
System.out.println("Shopping list is empty. Nothing to 
delete.");
} else {
System.out.print("Enter the position to delete (0-" +
(shoppingList.size() - 1) + "): ");
int positionToDelete = scanner.nextInt();
if (positionToDelete >= 0 && positionToDelete <
shoppingList.size()) {
String deletedItem =
shoppingList.remove(positionToDelete);
System.out.println(deletedItem + " removed from the 
shopping list.");
} else {
System.out.println("Invalid position. No item 
deleted.");
}

}
break;
case 3:
System.out.println("Shopping List:");
for (int i = 0; i < shoppingList.size(); i++) {
System.out.println((i + 1) + ". " + shoppingList.get(i));
}
break;
case 4:
scanner.close();
System.out.println("Exiting the program.");
System.exit(0);
break;
default:
System.out.println("Invalid choice. Please select a valid 
option.");
break;
}
}
}
}
