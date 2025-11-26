// Write a program to demonstrate logical operator(AND,OR,NOT)
public class LogicalOperators {
    public static void main(String[] args) {
        boolean a = true;
        boolean b = false;

        System.out.println("a = " + a + ", b = " + b);

        // Logical AND (&&)
        System.out.println("a && b = " + (a && b)); // true only if both are true

        // Logical OR (||)
        System.out.println("a || b = " + (a || b)); // true if any one is true

        // Logical NOT (!)
        System.out.println("!a = " + (!a)); // reverses true to false
        System.out.println("!b = " + (!b)); // reverses false to true
    }
}