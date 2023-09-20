import java.net.SocketOption;
import java.util.Scanner;
public class problem4 {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        int number = input.nextInt();
        System.out.println("number = " + number);
        int hours = input.nextInt();
        System.out.println("worked hours in a month = " + hours);
        int amount = input.nextInt();
        System.out.println("received amount per hour = " + amount);
        System.out.println("Employee = " + number);
        int receives = hours * amount;
        System.out.println("receives = " + receives);

    }

}
