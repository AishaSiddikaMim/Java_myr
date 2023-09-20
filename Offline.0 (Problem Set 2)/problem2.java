import java.util.Scanner;
public class problem2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int s = input.nextInt();
        System.out.println("Salary = " + s);
        if (s < 30000) {
           double a = s * 0.4 ;
           System.out.println("Income tax = " + a);
        }
        else if (s >= 30000 && s <= 70000 ) {
            double a = s * 0.1;
            System.out.println("Income tax = " + a);
        }
        else if (s > 70000) {
            double a = s * 0.15;
            System.out.println("Income tax = " + a);
        }

    }
}
