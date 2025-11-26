// Write a program to calculate without using modulus operator
import java.util.Scanner;

public class RemainderWithoutModulus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter dividend: ");
        int dividend = sc.nextInt();

        System.out.print("Enter divisor: ");
        int divisor = sc.nextInt();

        if (divisor == 0) {
            System.out.println("Division by zero is not allowed.");
        } else {
            // Formula: remainder = dividend - (divisor * (dividend / divisor))
            int quotient = dividend / divisor;
            int remainder = dividend - (divisor * quotient);

            System.out.println("Quotient = " + quotient);
            System.out.println("Remainder = " + remainder);
        }

        sc.close();
    }
}
