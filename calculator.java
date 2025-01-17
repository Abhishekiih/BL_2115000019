import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input numbers
        System.out.println("Enter the first number: ");
        double num1 = scanner.nextDouble();

        System.out.println("Enter the second number: ");
        double num2 = scanner.nextDouble();

        // Display options
        System.out.println("Choose an operation:");
        System.out.println("1. Addition (+)");
        System.out.println("2. Subtraction (-)");
        System.out.println("3. Multiplication (*)");
        System.out.println("4. Division (/)");

        System.out.println("Enter your choice (1-4): ");
        int choice = scanner.nextInt();

        // Perform operation based on choice
        switch (choice) {
            case 1: // Addition
                System.out.println("Result: " + (num1 + num2));
                break;
            case 2: // Subtraction
                System.out.println("Result: " + (num1 - num2));
                break;
            case 3: // Multiplication
                System.out.println("Result: " + (num1 * num2));
                break;
            case 4: // Division
                if (num2 != 0) {
                    System.out.println("Result: " + (num1 / num2));
                } else {
                    System.out.println("Error: Division by zero is not allowed.");
                }
                break;
            default:
                System.out.println("Invalid choice. Please select a valid operation (1-4).");
        }

        scanner.close();
    }
}
