import java.util.Scanner;
public class problem6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        System.out.println("number = " + a);
        int x = a / 100;
        int y = a % 100;
        int z = y / 10;
        int m = y % 10;
        System.out.println("after separating tabs = " + (x + "\t" +z+ "\t" +m) ) ;
    }
}
