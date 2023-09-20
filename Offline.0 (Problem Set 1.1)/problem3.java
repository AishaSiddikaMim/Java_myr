import java.util.Scanner;
public class problem3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int u = input.nextInt();
        System.out.println("u = " + u);
        int a = input.nextInt();
        System.out.println("a = " + a);
        int t = input.nextInt();
        System.out.println("t = " + t);
        int v = u + (a * t);
        System.out.println("velocity = " + v);
        double s = (u * t) + (0.5 * a * t * t);
        System.out.println("distance = " + s);


    }
}