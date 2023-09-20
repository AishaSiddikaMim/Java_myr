import java.util.Scanner;
public class problem4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter two integers = ");
        int a = input.nextInt();
        int b = input.nextInt();
        int x = 1;
        while ( b > 0  ) {
             x = x * a ;
             b--;

        }
        System.out.println(x);

    }
}

