import java.util.Scanner;
public class problem9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        System.out.println("Enter the wind speed = " + a);
        if (a < 1) {
            System.out.println("Calm");
        } else if (a >= 1 && a <= 3) {
            System.out.println("Light air");
        } else if (a >= 4 && a <= 27) {
            System.out.println("Breeze");
        }
        else if (a >= 28 && a <= 47){
            System.out.println("Gale");
        }
        else if (a >= 48 && a <= 63){
            System.out.println("Storm");
        }
        else if (a > 63){
            System.out.println("Hurricane");
        }
    }
}
