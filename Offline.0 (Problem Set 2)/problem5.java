import java.util.Scanner;
public class problem5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter the digit =");
        int a = input.nextInt();
        int count = 0 ;
        while (a != 0) {
             a = a / 10;
            ++ count ;
        }
        System.out.println("Number of digits = " + count);
    }

}