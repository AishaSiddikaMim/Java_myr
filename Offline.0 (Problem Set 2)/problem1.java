import java.util.Scanner;
public class problem1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int x = input.nextInt();
        System.out.println("enter the integer = " + x);
        if (x % 3 == 0 && x % 5 ==0) {
            System.out.println("Divisible by 3 and 5");
        }
        else if  (x % 3 ==0) {
            System.out.println("Divisible by 3");
        }
        else if (x % 5 == 0){
            System.out.println("Divisible by 5");
        }
        else {
            System.out.println("Not divisible by 3 or 5");
        }
    }
}
