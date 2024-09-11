import java.util.Scanner;

public class ArithmeticOperations {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter the first number: ");
            int num1 = scanner.nextInt();

            System.out.print("Enter the second number: ");
            int num2 = scanner.nextInt();

            int sum = num1 + num2;
            int subtraction = num1 - num2;
            int product = num1 * num2;
            int division = num1 / num2;

            System.out.println("Sum: " + sum);
            System.out.println("subtraction: " + subtraction);
            System.out.println("Product: " + product);
            System.out.println("division: " + division);
        }
    }
}
