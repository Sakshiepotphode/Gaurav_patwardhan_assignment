import java.util.Scanner;

public class PowerCalculation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the base (A): ");
        int base = scanner.nextInt();
        
        System.out.print("Enter the exponent (B): ");
        int exponent = scanner.nextInt();
        
        int result = 1;
        
        for (int i = 1; i <= exponent; ++i) {
            result *= base;
        }
        
        System.out.println(base + "^" + exponent + " = " + result);
    }
}
