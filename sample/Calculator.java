import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String continueCalculation = "y";

        while (continueCalculation.equalsIgnoreCase("y")) {
            // Display options
            System.out.println("Select operation:");
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.print("Enter choice (1/2/3/4): ");
            
            int choice = scanner.nextInt();
            
            // Get numbers from user
            System.out.print("Enter first number: ");
            double num1 = scanner.nextDouble();
            System.out.print("Enter second number: ");
            double num2 = scanner.nextDouble();
            
            double result = 0.0;
            boolean validChoice = true;
            
            // Perform operation based on choice
            switch (choice) {
                case 1:
                    result = num1 + num2;
                    System.out.println("Result: " + num1 + " + " + num2 + " = " + result);
                    break;
                case 2:
                    result = num1 - num2;
                    System.out.println("Result: " + num1 + " - " + num2 + " = " + result);
                    break;
                case 3:
                    result = num1 * num2;
                    System.out.println("Result: " + num1 + " * " + num2 + " = " + result);
                    break;
                case 4:
                    if (num2 != 0) {
                        result = num1 / num2;
                        System.out.println("Result: " + num1 + " / " + num2 + " = " + result);
                    } else {
                        System.out.println("Error: Division by zero is not allowed.");
                    }
                    break;
                default:
                    System.out.println("Invalid choice. Please enter 1, 2, 3, or 4.");
                    validChoice = false;
            }
            
            // Ask user if they want to perform another calculation
            if (validChoice) {
                System.out.print("Do you want to perform another calculation? (y/n): ");
                continueCalculation = scanner.next();
            }
        }

        System.out.println("Thank you for using the calculator.");
        scanner.close();
    }
}
