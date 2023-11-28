import java.util.Scanner;

public class discount {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the quantity: ");
        int quantity = scanner.nextInt();

        int unitCost = 100;
        int totalCost = quantity * unitCost;

        if (totalCost > 1000) {
            double discount = 0.10 * totalCost;
            totalCost -= discount;
            System.out.println("You got a 10% discount!");
        }

        System.out.println("Total cost: " + totalCost);
    }
}
