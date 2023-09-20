import java.util.Scanner;

public class ScannerTest {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        // take an integer as input
        int x = scn.nextInt();
        System.out.println("x = " + x);

        // take a double as input
        double y = scn.nextDouble();
        System.out.println("y = " + y);

        // take an array of integers as input
        int[] numbers1 = new int[4];
        for(int i = 0; i < numbers1.length; i++)
        {
            numbers1[i] = scn.nextInt();
        }
        for(int a: numbers1)
        {
            System.out.println(a);
        }


    }
}
