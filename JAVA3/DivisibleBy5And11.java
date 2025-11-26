// Write a program to check if a number is divisible by 5 and 11
import java.util.Scanner;

public class DivisibleBy5And11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        // Check divisibility
        if (num % 5 == 0 && num % 11 == 0) {
            System.out.println(num + " is divisible by both 5 and 11.");
        } else {
            System.out.println(num + " is not divisible by both 5 and 11.");
        }

        sc.close();
    }
}

