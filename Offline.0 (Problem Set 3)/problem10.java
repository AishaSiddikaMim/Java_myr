import java.util.Scanner;
public class problem10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        System.out.println("Enter the integer = " + a);
        int x = 0;
        for (int i = 1; i <= a; i++) {
            if (a % i == 0) {
                if (i % 2 != 0) {
                    x++;
                }
            }

        }
        System.out.println("Number of odd divisors = " + x);
    }
}

