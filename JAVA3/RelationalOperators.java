// DemonsTRATE relational operators with input values
import java.util.Scanner;

public class RelationalOperators {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter first number: ");
        int a = sc.nextInt();

        System.out.print("Enter second number: ");
        int b = sc.nextInt();

        System.out.println("\n--- Relational Operators Demonstration ---");
        System.out.println("a = " + a + ", b = " + b);

        System.out.println("a == b : " + (a == b));  // equal to
        System.out.println("a != b : " + (a != b));  // not equal to
        System.out.println("a > b  : " + (a > b));   // greater than
        System.out.println("a < b  : " + (a < b));   // less than
        System.out.println("a >= b : " + (a >= b));  // greater than or equal to
        System.out.println("a <= b : " + (a <= b));  // less than or equal to

        sc.close();
    }
}
