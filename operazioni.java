import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ask the user to enter two integers
        System.out.print("Enter the first number (a): ");
        int a = scanner.nextInt();

        System.out.print("Enter the second number (b): ");
        int b = scanner.nextInt();

        // Close the scanner after obtaining the numbers


        // Ask the user to choose an operation
        System.out.println("Choose an operation:");
        System.out.println("1. Sum");
        System.out.println("2. Difference");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");
        System.out.println("5. Power");
        System.out.print("Enter your choice: ");
        Scanner operationScanner = new Scanner(System.in);
        int choice = operationScanner.nextInt();

        scanner.close();

        // Perform the selected operation and print the result
        switch (choice) {
            case 1:
                System.out.println("Sum: " + sum(a, b));
                break;
            case 2:
                System.out.println("Difference: " + difference(a, b));
                break;
            case 3:
                System.out.println("Multiplication: " + multiplication(a, b));
                break;
            case 4:
                System.out.println("Division: " + division(a, b));
                break;
            case 5:
                System.out.println("Power: " + power(a, b));
                break;
            default:
                System.out.println("Invalid choice");
        }

        System.out.println("Goodbye bro");
    }

    public static int sum(int a, int b) {
        return a + b;
    }

    public static int difference(int a, int b) {
        return a - b;
    }

    public static int multiplication(int a, int b) {
        return a * b;
    }

    public static double division(int a, int b) {
        if (b != 0) {
            return (double) a / b;
        } else {
            System.out.println("Impossible");
            return 0;
        }
    }

    public static int power(int a, int b) {
        int result = 1;
        for (int i = 0; i < b; i++) {
            result *= a;
        }
        return result;
    }
}
