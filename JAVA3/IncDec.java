// Demonstrate increment and decrement operators
public class IncDec {
    public static void main(String[] args) {
        int x = 10;

        System.out.println("Initial value of x: " + x);

        // Pre-increment: ++x
        System.out.println("Pre-increment (++x): " + (++x)); // first increment, then print
        System.out.println("After pre-increment, x = " + x);

        // Post-increment: x++
        System.out.println("Post-increment (x++): " + (x++)); // first print, then increment
        System.out.println("After post-increment, x = " + x);

        // Pre-decrement: --x
        System.out.println("Pre-decrement (--x): " + (--x)); // first decrement, then print
        System.out.println("After pre-decrement, x = " + x);

        // Post-decrement: x--
        System.out.println("Post-decrement (x--): " + (x--)); // first print, then decrement
        System.out.println("After post-decrement, x = " + x);
    }
}
