import java.util.Scanner;
public class prob1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] x =new int[50];
        int a = input.nextInt();
        System.out.println("enter the integer = " + a);
        int odd = 0;
        for(int i = 0; i < a ; i++) {
            if (i % 2 !=0) {
                System.out.println("odd numbers are = " + i);
        }
    }
    }
}
