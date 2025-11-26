// Check if a given year is a leap year.
public class LeapYearCheck {
    public static void main(String[] args) {
        int year = 2024;  // You can change this value or take user input

        // Leap year condition:
        // 1. Year divisible by 4 and not by 100, OR
        // 2. Year divisible by 400
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            System.out.println(year + " is a leap year.");
        } else {
            System.out.println(year + " is not a leap year.");
        }
    }
}
