import java.util.Scanner;


class calculator {

    private double operand1;
    private double operand2;
    public Calculator(double operand1, double operand2) {
        this.operand1 = operand1;
        this.operand2 = operand2;
    }

    // Addition method
    public double add() {
        return operand1 + operand2;
    }

    // Subtraction method
    public double subtract() {
        return operand1 - operand2;
    }

    // Multiplication method
    public double multiply() {
        return operand1 * operand2;
    }

    // Division method
    public double divide() {
        if (operand2 != 0) {
            return operand1 / operand2;
        } else {
            System.out.println("Error: Division by zero is not allowed.");
            return Double.NaN;
        }
    }
}


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter operand 1: ");
        double operand1 = scanner.nextDouble();
        System.out.print("Enter operand 2: ");
        double operand2 = scanner.nextDouble();
        Calculator calculator = new Calculator(operand1, operand2);
        System.out.print("Enter operator (+, -, *, /): ");
        char operator = scanner.next().charAt(0);

        switch (operator) {
            case '+':
                System.out.println("Addition: " + calculator.add());
                break;
            case '-':
                System.out.println("Subtraction: " + calculator.subtract());
                break;
            case '*':
                System.out.println("Multiplication: " + calculator.multiply());
                break;
            case '/':
                System.out.println("Division: " + calculator.divide());
                break;
            default:
                System.out.println("Error: Invalid operator.");
        }

        scanner.close();
    }
}
