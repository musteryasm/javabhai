import java.util.Scanner;

public class YoungestOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter age of person 1: ");
        int age1 = scanner.nextInt();

        System.out.print("Enter age of person 2: ");
        int age2 = scanner.nextInt();

        System.out.print("Enter age of person 3: ");
        int age3 = scanner.nextInt();

        int oldest, youngest;

        if (age1 >= age2 && age1 >= age3) {
            oldest = age1;
        } else if (age2 >= age1 && age2 >= age3) {
            oldest = age2;
        } else {
            oldest = age3;
        }

        if (age1 <= age2 && age1 <= age3) {
            youngest = age1;
        } else if (age2 <= age1 && age2 <= age3) {
            youngest = age2;
        } else {
            youngest = age3;
        }

        System.out.println("Oldest person is " + oldest + " years old.");
        System.out.println("Youngest person is " + youngest + " years old.");
    }
}
