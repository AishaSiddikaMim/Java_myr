import java.util.Scanner;
    public class problem2 {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            int x = input.nextInt();
            System.out.println("x = " + x);
            int y = input.nextInt();
            System.out.println("y = " + y);
            int sum = x + y;
            System.out.println("sum = " + sum);
            if (x > y) {
            int subtraction = x- y;
            System.out.println("subtraction = " + subtraction);
        }
            else {
                int subtraction = y - x;
                System.out.println("subtraction = " + subtraction);
            }
                int multiplication = x * y;
               System.out.println("multiplication = " + multiplication);
            if (x > y) {
                int division = x / y;
                System.out.println("division = " + division);
            }
            else {
                int division = y / x;
                System.out.println("division = " + division);
            }
            if (x > y) {
                int remainder = x % y;
                System.out.println("remainder = " + remainder);
            }
            else {
                int remainder = y % x;
                System.out.println("remainder = " + remainder );
            }
            }
    }