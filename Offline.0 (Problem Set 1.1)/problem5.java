import java.util.Scanner;
public class problem5 {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        int givenSec = input.nextInt();
        System.out.println("seconds = " + givenSec);
        int h = givenSec / 3600;
        System.out.println("hours = " + h);
        int s = givenSec % 3600;
        System.out.println("remained seconds = " + s);
        int m = s / 60;
        System.out.println("minutes = " + m);
        int sec = givenSec % 60;
        System.out.println("seconds = " + sec);
        System.out.println("\n HH:MM:SS \n = " + (h+ ":" +m + ":"  +sec));
    }
}
