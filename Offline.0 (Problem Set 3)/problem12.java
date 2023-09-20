import java.util.Scanner;
public class problem12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter  integers = ");
        int a = input.nextInt();
        int x = 0;
        int y = 0;
        while (a >= 1) {
            y = a % 10;
            x = (x * 10) + y;
            a = a / 10;
        }
        System.out.println("reverse = " +  x );

    }
}
