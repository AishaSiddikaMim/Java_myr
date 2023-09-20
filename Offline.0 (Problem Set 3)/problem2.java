import java.util.Scanner;
public class problem2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] x =new int[50];
        System.out.println("enter the integer = ");
        int a = input.nextInt();
        int odd = 0;
        for(int i = 1; i <= a ; i++) {
                System.out.println("odd numbers are = " + ((2*i)-1));
            }

        }
    }
