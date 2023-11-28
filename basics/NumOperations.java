public class NumOperations {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int choice;
        do {
            System.out.println("\nMenu:");
            System.out.println("1. Factorial");
            System.out.println("2. Armstrong Number");
            System.out.println("3. Palindrome");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter a number: ");
                    int numFactorial = scanner.nextInt();
                    long factorialResult = factorial(numFactorial);
                    System.out.println("Factorial of " + numFactorial + " is: " + factorialResult);
                    break;

                case 2:
                    System.out.print("Enter a number: ");
                    int numArmstrong = scanner.nextInt();
                    boolean isArmstrong = testArmstrong(numArmstrong);
                    if (isArmstrong) {
                        System.out.println(numArmstrong + " is an Armstrong number.");
                    } else {
                        System.out.println(numArmstrong + " is not an Armstrong number.");
                    }
                    break;

                case 3:
                    System.out.print("Enter a number: ");
                    int numPalindrome = scanner.nextInt();
                    boolean isPalindrome = testPalindrome(numPalindrome);
                    if (isPalindrome) {
                        System.out.println(numPalindrome + " is a Palindrome number.");
                    } else {
                        System.out.println(numPalindrome + " is not a Palindrome number.");
                    }
                    break;

                case 4:
                    System.out.println("Terminated");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }

        } while (choice != 4);
    }

    public static long factorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }

    public static boolean testArmstrong(int num) {
        int original = num;
        int sum = 0;

        while (num > 0) {
            int digit = num % 10;
            sum += Math.pow(digit, 3); 
            num /= 10;
        }

        return sum == original;
    }

    public static boolean testPalindrome(int num) {
        int reversed = 0, original = num;

        while (num != 0) {
            int digit = num % 10;
            reversed = reversed * 10 + digit;
            num /= 10;
        }

        return original == reversed;
    }
}

